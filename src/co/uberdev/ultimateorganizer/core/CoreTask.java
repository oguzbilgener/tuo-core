package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 28/02/14.
 */
public class CoreTask extends Core
{
	protected long id;
	protected long ownerId;
	protected String taskName;
	protected String taskDesc;

	public CoreTask()
	{
		this(0);
	}
	public CoreTask(long id)
	{
		this.id = id;
		this.ownerId = -1;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String toString()
	{
		return this.asJsonString();
	}
}