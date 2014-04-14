package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 14/04/14.
 */
public class CoreDataRules
{
    public static final int EMAIL_MAX_LENGTH = 255;
    public static final int PASSWORD_MIN_LENGTH = 6;
    public static final int PASSWORD_MAX_LENGTH = 32;
    public static final int FIRSTNAME_MAX_LENGTH = 255;
    public static final int LASTNAME_MAX_LENGTH = 255;

    public static final int RESET_KEY_LIFETIME = 3600; // an hour
    public static final int ACTIVATION_KEY_LIFETIME = 86400; // a day

    public static final class tables
    {
        public static final String users = "users";
        public static final String tasks = "tasks";
        public static final String notes = "notes";
        public static final String tags = "tags";
    }
}
