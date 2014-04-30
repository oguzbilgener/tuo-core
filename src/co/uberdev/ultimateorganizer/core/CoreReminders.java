package co.uberdev.ultimateorganizer.core;

import java.util.ArrayList;

/**
 * Created by oguzbilgener on 30/04/14.
 */
public class CoreReminders extends ArrayList<Core>
{
	public CoreReminder get(int i)
	{
		return (CoreReminder) super.get(i);
	}
}
