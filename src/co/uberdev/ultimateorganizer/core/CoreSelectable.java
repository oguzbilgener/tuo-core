package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 28/02/14.
 */

public interface CoreSelectable
{
	public String getTableName();

	// TODO: add detailed methods for querying different conditions
    public boolean loadFromDb(String sqlCriteria, String[] params, int limit);
    public boolean loadFromDb(int limit);
    public boolean loadFromDb();

}