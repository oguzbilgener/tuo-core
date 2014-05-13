package co.uberdev.ultimateorganizer.core;

import java.util.ArrayList;

/**
 * Created by dunkuCoder on 28/02/14.
 */
public class CoreTask extends Core
{
    // Task's id
	protected long id;
	protected long localId;
    // ownerId is the id of the user who creates the task
	protected long ownerId;

	// the owner user of this task. Warning: might be null
	protected CoreUser owner;
    // Task's name and description
	protected String taskName;
	protected String taskDesc;
    // taskOwnerNameCombined is the combination of the user's first and last name such as "Ani Kristo"
    protected String taskOwnerNameCombined;
    // Tasks will always belong to four status, described below
	protected int status;
    // Tags that are related to the task will be in the tags ArrayList
    protected CoreTags tags;
    // Related notes and related tasks will always be indicated by their id's, so linking process will be easier
    // Each task on the server will have a distinct id, each note on the server will have a distinct id
    // Id's of tasks and notes will be counted separately, so that the id's of a task and a note is possible to be the same
    // Each task will have an arrayList of id's of related tasks and related notes to ease the linking process
    protected ArrayList<Long> relatedNotes;
    protected ArrayList<Long> relatedTasks;
	protected ArrayList<Long> relatedTasksLocal;

	protected boolean personal;

	// Reminders are stored as objects in tasks
	// However, they will be inserted into a different table by using the insert method in
	protected CoreReminders reminders;

	// The related course of the task
	protected CoreCourse course;
	// the id on the server side of this course
	protected long courseId;
	// The code of this course
	protected String courseCodeCombined;
    // dateCreated signifies the creation date of the task, will be initialised when the task is created
    protected int dateCreated;
    // lastModified signifies the last modification date of the task, important for synchronisation
    // If a user previously downloaded a task and the creator of that task modified it later,
    // lastModifiedDate will be later than the last synchronisation date of the user who downloaded the task
    // The task will be replaced with the previously downloaded one
    protected int lastModified;
    // beginDate is the Date user specifies for the task to begin, endDate is the date the task is due to
    protected int beginDate; // in seconds, unix timestamp
    protected int endDate; // in seconds, unix timestamp

    // TASK states
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_COMPLETED = 2;
    public static final int STATE_ARCHIVED = 3;
    public static final int STATE_DELETED = 0;

    public CoreTask()
	{
		this(0);
	}

	public CoreTask(long id)
	{
        dateCreated = CoreUtils.getUnixTimestamp();
		this.id = id;
		this.ownerId = -1;
        tags = new CoreTags();
        relatedTasks = new ArrayList<Long>();
        relatedNotes = new ArrayList<Long>();
		personal = false;

		reminders = new CoreReminders();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getLocalId()
	{
		return localId;
	}

	public void setLocalId(long localId)
	{
		this.localId = localId;
	}

	public CoreUser getOwner() {
		return owner;
	}

	public void setOwner(CoreUser owner) {
		this.owner = owner;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

    public CoreReminders getReminders(){return reminders;}

    public void setReminders(CoreReminders reminders){this.reminders = reminders;}

    public ArrayList<Long> getRelatedTasks(){return relatedTasks;}

    public void setRelatedTasks(ArrayList<Long> relatedTasks){this.relatedTasks = relatedTasks;}

    public ArrayList<Long> getRelatedNotes(){return relatedNotes;}

    public void setRelatedNotes(ArrayList<Long> relatedNotes){this.relatedNotes = relatedNotes;}


    public void addTag(CoreTag t)
    {
        tags.add( t);
    }

    public void removeTag(long id)
    {
        for(int i = 0; i < tags.size(); i++)
        {
            if( id == tags.get(i).getId())
            {
                tags.remove(i);
                i--;
            }
        }
    }

	public CoreTags getTags()
	{
		return tags;
	}

    public void addNote(long id)
    {
        relatedNotes.add(id);
    }

    public void removeNote(long id)
    {
        for(int i = 0; i < relatedNotes.size(); i++)
        {
            if( id == relatedNotes.get(i))
            {
                relatedNotes.remove(i);
                i--;
            }
        }
    }

    public void relateTask(long id)
    {
        relatedTasks.add(id);
    }

    public void unrelateTask(long id)
    {
        for(int i = 0; i < relatedTasks.size(); i++)
        {
            if( id == relatedTasks.get(i))
            {
                relatedTasks.remove(i);
                i--;
            }
        }
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status) throws BadStateException {
        if(status < STATE_DELETED || status > STATE_ARCHIVED)
            throw new BadStateException();
        this.status = status;
    }

    public int getDateCreated()
    {
        return dateCreated;
    }

    public void setDateCreated(int dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public int getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(int beginDate) {
        this.beginDate = beginDate;
    }

    public int getLastModified() {
        return lastModified;
    }

    public void setLastModified(int lastModified) {
        this.lastModified = lastModified;
    }

	public boolean isPersonal() {
		return personal;
	}

	public void setPersonal(boolean personal) {
		this.personal = personal;
	}

	public CoreCourse getCourse() {
		return course;
	}

	public void setCourse(CoreCourse course) {
		this.course = course;
	}

	public String getCourseCodeCombined() {
		return courseCodeCombined;
	}

	public void setCourseCodeCombined(String courseCodeCombined) {
		this.courseCodeCombined = courseCodeCombined;
	}

	public String toString()
	{
		return this.asJsonString();
	}

    public static class BadStateException extends Exception
    {

    }

	public void addReminder(CoreReminder reminder)
	{
		reminders.add(reminder);
	}

	public void removeReminder(CoreReminder reminder)
	{
		for(int i = 0; i < reminders.size(); i++)
		{
			if( reminder == reminders.get(i))
			{
				reminders.remove(i);
				i--;
			}
		}
	}

    public void setTaskOwnerNameCombined( String name)
    {
        taskOwnerNameCombined = name;
    }

    public String getTaskOwnerNameCombined()
    {
        return taskOwnerNameCombined;
    }

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public void setTags(CoreTags tags) {
		this.tags = tags;
	}

	public boolean isEmpty()
	{
		return getTaskName().isEmpty();
	}

	public ArrayList<Long> getRelatedTasksLocal() {
		return relatedTasksLocal;
	}

	public void setRelatedTasksLocal(ArrayList<Long> relatedTasksLocal) {
		this.relatedTasksLocal = relatedTasksLocal;
	}
}