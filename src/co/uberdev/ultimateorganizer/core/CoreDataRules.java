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
    public static final int SCHOOLNAME_MAX_LENGTH = 255;
    public static final int DEPARTMENT_MAX_LENGHT = 255;

    public static final int RESET_KEY_LIFETIME = 3600; // an hour
    public static final int ACTIVATION_KEY_LIFETIME = 86400; // a day

    public static final class tables
    {
        public static final String users = "users";
        public static final String tasks = "tasks";
        public static final String notes = "notes";
        public static final String tags = "tags";
        public static final String courses = "courses";
		public static final String reminders = "reminders";
    }

    public static final class columns
    {
        public static final class users
        {
            public static final String id = "id";
            public static final String emailAddress = "email_address";
            public static final String passwordHashed = "password_hashed";
            public static final String firstName = "first_name";
            public static final String lastName = "last_name";
            public static final String publicKey = "public_key";
            public static final String secretToken = "secret_token";
            public static final String state = "state";
            public static final String resetKey = "reset_key";
            public static final String resetDue = "reset_due";
            public static final String schoolName = "school_name";
            public static final String departmentName = "department_name";
            public static final String created = "created";
            public static final String birthday = "birthday";
            public static final String devices = "devices";
        }

		public static final class tasks
		{
			public static final String id = "id";
			public static final String ownerId = "owner_id";
			public static final String taskName = "name";
			public static final String taskDesc = "description";
			public static final String status = "status";
			public static final String tags = "tags";
			public static final String relatedTasks = "related_tasks";
			public static final String relatedNotes = "related_notes";
			public static final String reminders = "reminders";
			public static final String personal = "personal";
			public static final String dateCreated = "date_created";
			public static final String lastModified = "last_modified";
			public static final String beginDate = "begin_date";
			public static final String endDate = "end_date";
			public static final String course = "course";
            public static final String courseId = "course_id";
			public static final String courseCodeCombined = "course_code_combined";
			public static final String taskOwnerNameCombined = "task_owner_name_combined";
		}

        public static final class notes
        {
            public static final String id = "id";
            public static final String ownerId = "owner_id";
            public static final String dateCreated = "date_created";
            public static final String lastModified = "last_modified";
            public static final String content = "content";
            public static final String attachment =  "attachment";
            public static final String relatedTaskID = "related_task_id";
        }

		public static final class tags
		{
			public static final String id = "id";
			public static final String ownerId = "owner_id";
			public static final String tagTitle = "title";
			public static final String color = "color";
		}

		public static final class courses
		{
			public static final String id = "id";
			public static final String ownerId = "owner_id";
			public static final String semester = "semester";
			public static final String departmentCode = "department_code";
			public static final String courseCode = "course_code";
			public static final String sectionCode = "section_code";
			public static final String title = "title";
			public static final String instructor_name = "instructor_name";
			public static final String color = "color";
		}

        public static final class reminders
        {
            public static final String id = "id";
            public static final String targetDate = "target_date";
            public static final String taskId = "task_id";
            public static final String ownerId = "owner_id";
            public static final String localTaskId = "local_task_id";
            public static final String gap = "gap";
            public static final String title = "title";
            public static final String details = "details";
            public static final String vibrate = "vibrate";
            public static final String sound = "sound";
            public static final String light = "light";
        }
    }

    public static final class fields
    {
        public static final class login
        {
            public static final String email = "email";
            public static final String password = "password";
        }

        public static final class register
        {
            public static final String email = "email";
            public static final String password = "password";
            public static final String firstName = "first_name";
            public static final String lastName = "last_name";
            public static final String schoolName = "school_name";
            public static final String departmentName = "department_name";
            public static final String birthday = "birthday";
            public static final String device = "device";
        }

        public static final class request
        {
            public static final String public_key = "public_key";
            public static final String signature = "signature";
        }
    }
}
