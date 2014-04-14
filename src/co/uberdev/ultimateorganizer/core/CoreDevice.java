package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 14/04/14.
 */
public class CoreDevice extends Core
{
    // a unique identifier for the device
    protected String identifier;
    // the operating system type. just Android for now!
    protected int os;
    // information about the device: vendor, os version etc
    protected String info;
    // the first login date, unix timestamp
    protected int loginDate;
    // the latest access date, unix timestamp
    protected int lastAccess;

    public static final int OS_ANDROID = 1;

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(int loginDate) {
        this.loginDate = loginDate;
    }

    public int getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(int lastAccess) {
        this.lastAccess = lastAccess;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
