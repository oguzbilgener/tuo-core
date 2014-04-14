package co.uberdev.ultimateorganizer.core;

/**
 * Created by mozart on 27/03/14.
 */
public class CoreTag extends Core
{
    protected String name;
    protected int color;
    protected long id;
    protected long ownerId;

    public CoreTag(String name)
    {
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

    public long getOwnerId()
    {
        return ownerId;
    }

    public void setOwnerId(long ownerId)
    {
        this.ownerId = ownerId;
    }
}
