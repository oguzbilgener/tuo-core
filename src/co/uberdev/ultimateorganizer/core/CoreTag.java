package co.uberdev.ultimateorganizer.core;

/**
 * Created by mozart on 27/03/14.
 */
public class CoreTag extends Core
{
    protected String name;
    protected int colour;
    protected long id;
    protected long ownerId;

    public CoreTag(String name)
    {
        this.name = name;
    }

    public int getColour()
    {
        return color;
    }

    public void setColour(int colour)
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

    public long getOwnerId()
    {
        return ownerId;
    }

    public void setOwnerId(long ownerId)
    {
        this.ownerId = ownerId;
    }
}
