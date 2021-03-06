package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 30/04/14.
 */
public class CoreReminder extends Core
{
	protected long id;
	protected long localId;
	protected long targetDate; // in seconds, unix timestamp
	protected long taskId;
	protected long ownerId;
	protected long localTaskId;
	protected long gap; // the gap between the begin date of the task and targetDate of the reminder, in minutes
	protected String title;
	protected String details;
	protected boolean vibrate;
	protected boolean sound;
	protected boolean light;

	// Alarm id is only used on the client side but we had to be sure that it was included in the json object
	protected long alarmId;

	public CoreReminder()
	{
		targetDate = 0;
		gap = 0;
		title = "";
		details = "";
		vibrate = false;
		sound = false;
		light = false;
		alarmId = 0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getLocalId() {
		return localId;
	}

	public void setLocalId(long localId) {
		this.localId = localId;
	}

	public long getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(long targetDate) {
		this.targetDate = targetDate;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public long getLocalTaskId() {
		return localTaskId;
	}

	public void setLocalTaskId(long localTaskId) {
		this.localTaskId = localTaskId;
	}

	public long getGap() {
		return gap;
	}

	public void setGap(long gap) {
		this.gap = gap;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public boolean isVibrate() {
		return vibrate;
	}

	public void setVibrate(boolean vibrate) {
		this.vibrate = vibrate;
	}

	public boolean isSound() {
		return sound;
	}

	public void setSound(boolean sound) {
		this.sound = sound;
	}

	public boolean isLight() {
		return light;
	}

	public void setLight(boolean light) {
		this.light = light;
	}

	public long getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
	}

	/**
	 * yep, CS101 things can be necessary sometimes
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof CoreReminder))
			return false;

		CoreReminder reminder = (CoreReminder) obj;
		// do not check equity for every single property. we don't use reminders the way described above yet.
		if(this.gap == reminder.getGap() && this.targetDate == reminder.getTargetDate()
				&& this.light == reminder.isLight() && this.sound == reminder.isSound()
				&& this.vibrate == reminder.isVibrate())
			return true;
		return false;
	}
}
