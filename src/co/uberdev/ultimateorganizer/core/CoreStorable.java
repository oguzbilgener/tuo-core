package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 28/02/14.
 */
public interface CoreStorable
{
	public String getTableName();
	public boolean insert();
	public boolean update();
	public boolean remove();
}

