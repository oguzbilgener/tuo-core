package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 14/04/14.
 */
public class CoreCourses extends CoreList implements CoreSelectable
{
    public CoreCourse get(int i)
    {
        return (CoreCourse) get(i);
    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public boolean loadFromDb(String sqlCriteria, String[] params, int limit) {
        return false;
    }

    @Override
    public boolean loadFromDb(int limit) {
        return false;
    }

    @Override
    public boolean loadFromDb() {
        return false;
    }
}
