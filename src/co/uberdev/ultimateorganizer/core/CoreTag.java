package co.uberdev.ultimateorganizer.core;

/**
 * Created by mozart on 27/03/14.
 */
public class CoreTag extends Core
{
    protected String name;
    protected int color;
    protected long id;
	protected long localId;
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
        this.color = color;
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
