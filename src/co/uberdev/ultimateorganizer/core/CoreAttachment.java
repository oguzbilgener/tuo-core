package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 14/04/14.
 */
public class CoreAttachment extends Core
{
    protected String path;
    protected long ownerId;
    protected long relatedNoteId;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public long getRelatedNoteId() {
        return relatedNoteId;
    }

    public void setRelatedNoteId(long relatedNoteId) {
        this.relatedNoteId = relatedNoteId;
    }
}
