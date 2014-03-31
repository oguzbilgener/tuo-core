package co.uberdev.ultimateorganizer.core;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ata Ali Kılıçlı on 3/31/14.
 */
public class CoreNote {


    protected long id;

    protected long ownerId;

    //Creation date initialized on declaration.
    protected Date dateCreated;
    //Changed on edit. Used for syncing and sorting purposes.
    protected Date lastModified;

    //Id of file attached to this note. Type subject to change
    protected String attachment;

    //ID of the task that refers to this note.
    protected Long relatedTaskId;



    public CoreNote(long id)
    {
        dateCreated = new Date();
        lastModified = new Date(dateCreated.getTime());

        this.id = id;
        this.ownerId = -1;


    }




}
