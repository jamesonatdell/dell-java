import java.time.LocalDateTime;

//Implement the TimesheetEntry.java class. This represents an entry in the timesheet. Your implementation should have the following:
//Member variables:
//private String projectName
//private String task
//private int id
//private LocalDateTime startTime
//private LocalDateTime endTime
//Note: You will have to import java.time.LocalDateTime for the startTime and endTime variables
//Static variable:
//private static int NEXTID = 1
//Constructor:
//Two arguments: String myProject and String myTask
//Your constructor should:
//Initialize member variables projectName and task
//Initialize startTime to LocalDateTime.now()
//Initialize id to the current value of NEXTID
//Increment NEXTID
//Methods:
//Getters for all five member variables (setters optional)
//Implement a method called updateEndTime():
//If endTime has not been set, set it to LocalDateTime.now()
//Otherwise, do nothing (for now)

public class TimesheetEntry {
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	private static int NEXTID = 1;
	
	public TimesheetEntry(String myProject, String myTask) {
		this.projectName = myProject;
		this.task = myTask;
		this.startTime = LocalDateTime.now();
		this.id = NEXTID;
		NEXTID++;
	}
	
	public String getProjectName() {
		return this.projectName;
	}
	
	public String getTask() {
		return this.task;
	}
	
	public int getId() {
		return this.id;
	}
	
	public LocalDateTime getStartTime() {
		return this.startTime;
	}
	
	public LocalDateTime getEndTime() {
		return this.endTime;
	}
	
	
//	Throw an exception when the user tries to stop an entry that’s already been completed
//	In TimesheetEntry.java, modify the method updateEndTime() to throw an exception if the value of endTime has already been set
//	Modify the code that calls updateEndTime() to catch the exception and return a friendly message to the user
	public void updateEndTime() throws Exception {
	
		if (this.endTime == null) {
			this.endTime = LocalDateTime.now();
		} else throw new Exception();
		
	}
}
