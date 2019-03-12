import java.util.List;
import java.util.ArrayList;

//Implement the Timesheet.java class. This is the “database” that stores the timesheet entries. Your implementation should have the following:
//Member variable:
//private List<TimesheetEntry> database
//Note: You will have to import java.util.List and java.util.ArrayList
//Constructor:
//No arguments
//Your constructor should:
//Initialize database to a new ArrayList<>
public class Timesheet {
	private List<TimesheetEntry> database;
	
	public Timesheet() {
		this.database = new ArrayList<>();
	}
	
//	In Timesheet.java, create a method add(String project, String task) that creates a new TimesheetEntry and adds it to the Timesheet database
	public void add (String project, String task) {
		database.add(new TimesheetEntry(project, task));
	}
	
//	When the user inputs list -a, the program should print all the entries in the timesheet that are still active (incomplete)
//	If activeOnly is set to true, return a list of all the active (incomplete) TimesheetEntries in the Timesheet
//	Otherwise, return a list of all the entries in the timesheet
	
//  When the user inputs list PROJECT, the program should print all entries in the timesheet that have the specified project name
//	When the user inputs list PROJECT -a or list -a PROJECT, the program should print all active timesheet entries with the specified project name
//	If the name argument is not null, return a list of TimesheetEntries whose projectName field matches name
//	Otherwise, return a list of all the entries in the timesheet

	public List<TimesheetEntry> list(boolean activeOnly, String argument) {
		if (activeOnly) {
			List<TimesheetEntry> temp = new ArrayList<TimesheetEntry>();
			for (int i = 0; i < this.database.size(); i++) {
				if (this.database.get(i).getEndTime() == null) {
					if (argument == null) {
					temp.add(database.get(i));
					} else {
						if (database.get(i).getProjectName().equals(argument)) {
							temp.add(database.get(i));
						}
					}
				}
			}
			return temp;
		} 
		
		// if we have to just projects by name
		
		if (argument != null) {
			List<TimesheetEntry> temp = new ArrayList<TimesheetEntry>();
			for (int i = 0; i < this.database.size(); i++) {
				
						if (database.get(i).getProjectName().equals(argument)) {
							temp.add(database.get(i));
						}
			}
			return temp;
		}
		return this.database;
	}
	
//	In Timesheet.java, implement a get(int id) method with the following specifications:
//		Searches the database for a TimesheetEntry with the specified id
//		If a TimesheetEntry is found, return it
//		Otherwise, return null
	public TimesheetEntry get(int id) {
		for (int i = 0; i < database.size(); i++ ) {
			if (database.get(i).getId() == id) {
				return database.get(i);
			}
		}
		return null;
	}
	
//  When the user inputs delete ID, the program should remove the TimesheetEntry with the specified id from the Timesheet


	public void delete(TimesheetEntry entry) {
		if (database.contains(entry)) {
			database.remove(entry);
		} 
	}
	
	
//	Implement the stop action
//	Requirements:
//	When the user inputs stop ID, the program retrieves the TimesheetEntry with the specified id and sets its endTime
//	Directions:
//	In Timesheet.java, create a method stop(TimesheetEntry entry) that updates the TimesheetEntry object’s endTime
//	Hint: We’ve already created a method that helps with this
//	In Controller.java, finish the implementation of the processStopAction() method:
//	Call the get() method to retrieve the TimesheetEntry with the specified id
//	Call the stop() method you just created to set the end time for that TimesheetEntry
//	Run your program to validate that the stop action is working as you expect
	
	public void stop(TimesheetEntry entry) {
		try {
			entry.updateEndTime();
		} catch (Exception e) {
			System.out.println("[ERROR: Stop command failed, was entry already stopped?");
		}
	}
	
	
	
}
