import java.util.List;

public class Controller {

	/* Member variables */
	
    Timesheet timesheet;
    ConsoleUtils consoleUtils;
    
    /* Constructor */
    
    public Controller(){
        this.timesheet = new Timesheet();
        this.consoleUtils = new ConsoleUtils();
    }
    
    /* Methods */

	/*
	 * Runs the program
	 */
    public void start() {

        consoleUtils.printHelp(); // Print the action menu

        boolean quit = false;
        while(!quit) {

			// Prompt the user for input, collect input, parse into parts
            String input = consoleUtils.promptString("> ");
            String[] actionParts = input.split(" ");
            String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
            if (action.equals("add")) {

                processAddAction();
                
                
                

            } else if (action.equals("delete")) {

                processDeleteAction(actionParts);

            } else if (action.equals("stop")) {

                processStopAction(actionParts);

            } else if (action.equals("list")) {

                processListAction(actionParts);

            } else if (action.equals("quit")) {

                System.exit(0);

            } else if (action.equals("help")) {

            	this.consoleUtils.printHelp();

            } else if(action.length() ==0 ){
            
                // do nothing.
                
            	// What happens if we press surprise?
            	// this took way too long to implement.
            } else if(action.equals("surprise")) {
System.out.println("            	   ,'``.._   ,'``.");
System.out.println("                  :,--._:) ,:,._,.:       All Glory to");
System.out.println("                  :`--,''   :`...';      the HYPNO TOAD!");
System.out.println("                   `,'       `---'  `.");
System.out.println("                   /                 :");
System.out.println("                  /                   |");
System.out.println("                ,'                     :.___,-.\\");
System.out.println("              `...,---'``````-..._    |:       \\");
System.out.println("                (                 )   ;:    )     _,-.\\");
System.out.println("                 `.              (   //          `'    \\");
System.out.println("                  :               `.//  )      )     , ;|");
System.out.println("                ,-|`.            _,'/       )    ) ,' ,'/");
System.out.println("               (  :`.`-..____..=:.-':     .     _,' ,'/");
System.out.println("                `,') ``--....-)='    `._,  |  ,') _ '``._");
System.out.println("             _.-/ _ `.       (_)      /     )' ; / \\ \\`-.'\\");
System.out.println("            `--(   `-:`.     `' ___..'  _,-'   |/   `.)\\");
System.out.println("                `-. `.`.``-----``--,  .'\\");
System.out.println("                  |/`.`'        ,','); SSt\\");
System.out.println("                      `         (/  (/\\");
            } else {
            
            	consoleUtils.error(" Invalid action.]");
                
            }
        }

    }

	/*
	 * The user requested that a given TimesheetEntry be stopped (marked as complete)
	 * This method conveys that request to the Timesheet
	 */
    public void processStopAction(String[] actionParts){
        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        } else if (actionParts.length < 2) {
        	
        	consoleUtils.error("Stop command requires a valid integer ID.");
            return;
        } 
        
        try  {
        	Integer.parseInt(actionParts[1]);
        } catch (NumberFormatException e) {
        	consoleUtils.error("Stop command requires a valid integer ID.");
        	return;
        }

        int id = Integer.parseInt(actionParts[1]);
        
//    	In Controller.java, finish the implementation of the processStopAction() method:
//    	Call the get() method to retrieve the TimesheetEntry with the specified id
//    	Call the stop() method you just created to set the end time for that TimesheetEntry
//    	Run your program to validate that the stop action is working as you expect
        if (timesheet.get(id) == null) {
        	consoleUtils.error("Could not find entry with ID "+ id);
        	return;
        }
        timesheet.stop(timesheet.get(id));
        System.out.println("Process " + id + " stopped.");
    }

	/*
	 * The user requested that a given TimesheetEntry be deleted
	 * This method conveys that request to the Timesheet
	 */
    public void processDeleteAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to delete command");
            return;
        } else if (actionParts.length < 2) {
        	
        	consoleUtils.error("Stop command requires a valid integer ID.");
            return;
        } 
        
        try  {
        	Integer.parseInt(actionParts[1]);
        } catch (NumberFormatException e) {
        	consoleUtils.error("Stop command requires a valid integer ID.");
        	return;
        }

//    	In Controller.java, finish the implementation of the processDeleteAction() method:
//    	Call the get() method you created in the previous step to retrieve the TimesheetEntry with the specified id
//    	Call the delete() method you just created to delete that TimesheetEntry from the Timesheet
//    	Run your program to validate that the delete action is working as you expect
        int id = Integer.parseInt(actionParts[1]);
        if (timesheet.get(id) == null ) {
        	consoleUtils.error("Could not find entry with ID " + id);
        } else {
        	timesheet.delete(timesheet.get(id));
        	System.out.println("Entry removed.");
        }
    }

	/*
	 * The user wants to view a list of timesheet entries
	 * This method conveys that request to the Timesheet,
	 * along with any special options (active-only, filter by project name)
	 */
    public void processListAction(String[] actionParts){
//    	Implement the list action
//    	Requirements:
//    	When the user inputs list, the program prints all the entries in the timesheet
//    	Don’t worry about the [PROJECT] and [-a] options for now. We will get to them later 
//    	Directions:
//    	In Timesheet.java, create a method list() that returns a List<TimesheetEntry> of the entries in the database
//    	In Controller.java, finish the implementation of the processListAction() method:
//    	Call the list() method you just created to get a list of all the entries in the Timesheet
//    	Use the appropriate ConsoleUtils method to print out the list of entries
//    	Run your program to validate that the list action is working as you expect
    	
//    	In Controller.java, edit the processListAction() method:
//    	Check the actionParts to see if the user entered the -a option
//    	If so, call list() with appropriate value of activeOnly
//    	If not, default to your existing code that prints all entries
//    	Run your program to validate that the list -a action is working as you expect
    	

//    	In Controller.java, edit the processListAction() method:
//    	Check if the user entered the PROJECT option
//    	If so, retrieve the project name from the user input and pass it to the list() method
//    	If the user entered both the PROJECT option and the -a option, ensure that the list() method is called with the appropriate arguments
        if(actionParts.length > 3){
            consoleUtils.error("Too many inputs to list command");
            return;
        }
        boolean aFlag = false;
        int projIndex = -1;
        
        // handle length 2
        if (actionParts.length > 1 && actionParts.length < 3) {
        	if (actionParts[1].equals("-a")) {
        		aFlag = true;
        	} else {
        		projIndex = 1;
        	}
        	
        }
        
        // handle length 3
        if (actionParts.length == 3) {
        	if (actionParts[2].equals("-a")) {
        		projIndex = 1;
        		aFlag = true;
        	}
        	else {
        		projIndex= 2;
        		aFlag =true;
        	}
        }
        
        String project = null;
        if (projIndex != -1) {
        	project = actionParts[projIndex];
        }
        consoleUtils.printList(this.timesheet.list(aFlag, project));
    }

	/*
	 * The user wants to add a new entry to the Timesheet
	 * This method conveys that request to the Timesheet, along with
	 * the specified project name and task description 
	 */
    public void processAddAction(){

//      Implement the add action:
//      	Requirements:
//      	When the user inputs add, the program should prompt them to enter a project name, then a task description. The program will use these to create a new timesheet entry and add it to the timesheet.
//      	Important note: The project name entered by the user must be one word only
//      	Directions:
//      	In Timesheet.java, create a method add(String project, String task) that creates a new TimesheetEntry and adds it to the Timesheet database
//      	In Controller.java, finish the implementation of the processAddAction() method:
//      	Collect project name and task description from the user
//      	Call the add(project, task) method you just created to add the entry to the Timesheet
//      	Run your program to validate that the add action is working as you expect
        String project = consoleUtils.promptString("Project Name (one word only):");
        String description = consoleUtils.promptString("Task:");
        
        if (project.equals(null) || project.isEmpty()) {
        	consoleUtils.error("Project name required.]");
        } else if (description.equals(null) || project.isEmpty()) {
        	consoleUtils.error("Project description required.]");
        } else {
        this.timesheet.add(project, description);
        System.out.println("Entry added.");
        }
		// Your code here
    }
}