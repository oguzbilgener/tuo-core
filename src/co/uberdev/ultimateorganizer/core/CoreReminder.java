package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 30/04/14.
 */
public class CoreReminder extends Core
{
	private long id;
	private long targetDate;
	private long taskId;
	private String title;
	private String details;
	private boolean vibrate;
	private boolean sound;
	private boolean light;

	public CoreReminder()
	{

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
}
