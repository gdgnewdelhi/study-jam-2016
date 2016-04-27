package TaskList;

import java.util.ArrayList;
import java.util.List;



/**
 * class that represents a bunch of things To DO
 *
 */
public class TaskList implements java.io.Serializable
{
	/**
	 * gobbledygook required by the Serializable interface
	 * used to make sure the file is the same version as the currently loaded class 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * the things that need to be done
	 *@var List<Task>
	 */
	ArrayList <Task> tasks;
	
	/**
	 * constructor
	 */
	public TaskList()
	{
		tasks = new ArrayList<Task>();
	}
	
	/**
	 * adds a task to the task list
	 * @param description
	 * @return Integer -- the handle to the newly created task
	 */
	public Integer addTask(String description)
	{
		tasks.add(
			new Task(description, false)
		);
		
		return tasks.size()-1;
	}
	
	/**
	 * gets a list of task handles that meet the passed criteria
	 * @param boolean completed -- if true then only get completed tasks, otherwise get only incomplete tasks
	 * return List<Integer>
	 */
	public List<Integer> get(boolean completed)
	{
		List<Integer> found = new ArrayList<Integer>();
		for(Integer i = 0; i<tasks.size(); i++)
		{
			Task task = tasks.get(i);
			if(task.isComplete() == completed)
			{
				found.add(i);
			}
		}
		return found;
	}
	
	/**
	 * gets a list of task handles that have been completed
	 * @return List<Integer>
	 */
	public List<Integer> getCompleteTasks()
	{
		return get(true);
	}
	
	/**
	 * gets a list of task handles that are incomplete
	 * @return List<Integer>
	 */
	public List<Integer> getIncompleteTasks()
	{
		return get(false);
	}
	
	/**
	 * is the task identified by the passed handle completed
	 * @param Integer handle
	 * @return boolean
	 */
	public boolean isComplete(Integer handel)
	{
		return tasks.get(handel).isComplete();
	}
	
	/**
	 * gets the description of the task identified by the passed handle
	 * @param Integer handle
	 * @return String
	 */
	public String getDescription(Integer handel)
	{
		return tasks.get(handel).getDescription();
	}
	
	/**
	 * gets the description of the task identified by the passed handle
	 * @param Integer handle
	 * @return String
	 */
	public void setDescription(Integer handel, String description)
	{
		tasks.get(handel).setDescription(description);
	}
	
	/**
	 * sets the task identified by the passed handle as complete
	 * @param Integer handle
	 */
	public void setComplete(Integer handel)
	{
		tasks.get(handel).setComplete();
	}
	
	/**
	 * sets the task identified by the passed handle as not complete
	 * @param Integer handle
	 */
	public void setIncomplete(Integer handel)
	{
		tasks.get(handel).setIncomplete();
	}
}
