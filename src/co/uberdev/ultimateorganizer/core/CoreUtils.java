package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 15/04/14.
 */
public class CoreUtils
{
    public static int getUnixTimestamp()
    {
        return (int) (System.currentTimeMillis()/1000);
    }
}
