package TaskList;

/**
 * class that represents a thing To DO
 *
 */
public class Task implements java.io.Serializable
{
	/**
	 * gobbledygook required by the Serializable interface
	 * used to make sure the file is the same version as the currently loaded class 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * tell you what you have to do
	 */
	private String description;
	
	/**
	 * have you done it?
	 */
	private boolean completed;
	
	/**
	 * constructor
	 * @param _description
	 */
	Task(String _description, boolean _completed)
	{
		description = _description;
		completed = _completed;
	}
	
	/**
	 * gets the description
	 * @return String
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * gets the description
	 * @return String
	 */
	public void setDescription(String _description)
	{
		description = _description;
	}
	
	/**
	 * returns if this task is complete
	 */
	public boolean isComplete()
	{
		return completed;
	}
	
	/**
	 * sets the task as complete
	 */
	public void setComplete()
	{
		completed = true;
	}
	
	/**
	 * sets the task as not complete
	 */
	public void setIncomplete()
	{
		completed = false;
	}
}
