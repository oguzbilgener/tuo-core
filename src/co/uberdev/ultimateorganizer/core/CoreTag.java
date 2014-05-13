package co.uberdev.ultimateorganizer.core;

/**
 * Created by dunkuCoder on 27/03/14.
 * CoreTag is the core
 */
public class CoreTag extends Core
{
    // Tag's title
    protected String name;
    // Tag's background color
    protected int color;
    // id will be stored on the server
    protected long id;
    // localId is the id on the phone
	protected long localId;
    // ownerId is the id of the user who creates the tag
    protected long ownerId;

    public CoreTag()
    {
        this("");
    }

    public CoreTag(String name)
    {
        this.name = name;
        color = 0;
        id = 0;
        ownerId = -1;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getColor()
    {
        return color;
    }

    public void setColor(int colour)
    {
        this.color = colour;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

	public long getLocalId() {
		return localId;
	}

	public void setLocalId(long localId) {
		this.localId = localId;
	}

	public long getOwnerId()
    {
        return ownerId;
    }

    public void setOwnerId(long ownerId)
    {
        this.ownerId = ownerId;
    }
}
