package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 28/02/14.
 */
public class CoreTasks extends CoreList
{
	public CoreTasks()
	{
		super();
	}

    public CoreTask get(int index)
    {
        return (CoreTask) super.get(index);
    }
}