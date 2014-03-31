package co.uberdev.ultimateorganizer.core;

/**
 * Created by Ata Ali Kılıçlı on 3/31/14.
 */
public class CoreNote {


    protected long id;

    protected long ownerId;

    //Creation date initilized on declaration.
    protected Date dateCreated;
    //Changed on edit. Used for synching and sorting purposes.
    protected Date lastModified;

    //Id of file attached to this note. Type subject to change
    protected String attachment;

    //
    protected ArrayList<long> relatedTasks;




}
