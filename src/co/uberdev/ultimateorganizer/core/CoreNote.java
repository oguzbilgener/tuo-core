package co.uberdev.ultimateorganizer.core;

/**
 * Created by Ata Ali Kılıçlı on 3/31/14.
 */
public class CoreNote extends Core {

    public static final int NOTE_PLAIN = 0;
    public static final int NOTE_PHOTO = 1;
    public static final int NOTE_AUDIO = 2;
    public static final int NOTE_TODO = 3;

    protected long id;
	protected long localId;

    protected long ownerId;

    //Creation date initialized on declaration.
    protected int dateCreated;
    //Changed on edit. Used for syncing and sorting purposes.
    protected int lastModified;

    // The basic content of the note. May include some basic html for formatting
    protected String content;

    //Id of file attached to this note. Type subject to change
    protected CoreAttachment attachment;

    //ID of the task that refers to this note.
    protected long relatedTaskId;

    protected int status;

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    protected String noteDescription;

    protected String noteTitle;

    protected CoreTags relatedTags;


	public CoreNote()
	{
		this(0);
	}

    public CoreNote(long id)
    {
        dateCreated = CoreUtils.getUnixTimestamp();
        lastModified = CoreUtils.getUnixTimestamp();

        this.id = id;
        this.ownerId = -1;
    }

    public void setId(long id){ this.id = id; }

    public long getId(){ return id; }

	public long getLocalId()
	{
		return localId;
	}

	public void setLocalId(long localId)
	{
		this.localId = localId;
	}

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public void setContent(String content){ this.content = content; }

    public String getContent(){ return content; }

    public int getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getLastModified() {
        return lastModified;
    }

    public void setLastModified(int lastModified) {
        this.lastModified = lastModified;
    }

    public CoreAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(CoreAttachment attachment) {
        this.attachment = attachment;
    }

    public long getRelatedTaskId() {
        return relatedTaskId;
    }

    public void setRelatedTaskId(long relatedTaskId) {
        this.relatedTaskId = relatedTaskId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

	public boolean isEmpty()
	{
		return getNoteTitle().isEmpty();
	}
}
