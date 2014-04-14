package co.uberdev.ultimateorganizer.core;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by oguzbilgener on 28/02/14.
 */
public class CoreTask extends Core
{
    // Task's id
	protected long id;
    // ownerId is the id of the user who creates the task
	protected long ownerId;
	protected String taskName;
	protected String taskDesc;
    // Tasks will always belong to four status, described below
    protected int status;
    // Tags that are related to the task will be in the tags ArrayList
    protected ArrayList<CoreTag> tags;
    // Related notes and related tasks will always be indicated by their id's, so linking process will be easier
    // Each task on the server will have a distinct id, each note on the server will have a distinct id
    // Id's of tasks and notes will be counted separately, so that the id's of a task and a note is possible to be the same
    // Each task will have an arrayList of id's of related tasks and related notes to ease the linking process
    protected ArrayList<Long> relatedNotes;
    protected ArrayList<Long> relatedTasks;
    // dateCreated signifies the creation date of the task, will be initialised when the task is created
    protected Date dateCreated;
    // lastModified signifies the last modification date of the task, important for synchronisation
    // If a user previously downloaded a task and the creator of that task modified it later,
    // lastModifiedDate will be later than the last synchronisation date of the user who downloaded the task
    // The task will be replaced with the previously downloaded one
    protected Date lastModified;
    // beginDate is the Date user specifies for the task to begin, endDate is the date the task is due to
    protected Date beginDate;
    protected Date endDate;

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
        dateCreated = new Date();
		this.id = id;
		this.ownerId = -1;
        tags = new ArrayList<CoreTag>();
        relatedTasks = new ArrayList<Long>();
        relatedNotes = new ArrayList<Long>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String toString()
	{
		return this.asJsonString();
	}

    public static class BadStateException extends Exception
    {

    }
}