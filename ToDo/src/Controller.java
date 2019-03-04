// The controller.java class acts as the glue between the user and the DAO.
// it handles input and sends valid input to the database to be processed
// it has three variables, a scanner, an instance of the DAO, and an INT for the ID of each ToDo Item.

// it has 7 methods:
// print() is the first instance called and acts as the user input grabber
// handleInput(String input) takes the user's input and validates it, then sends the desired command to other methods
// help() prints the commands
// add() adds a new ToDo item to the list
// delete() prints an item's information and removes it from the DAO
// done() marks a pending item as done
// list() lists pending, finished, or all of the items in the list

// get dat yung scanner
import java.util.Scanner;
public class Controller {
	Scanner scn = new Scanner(System.in);
	// instantiate the DAO and set ID to 0
	Dao dao = new Dao();
	private int ID = 0;
	
	// print method grabs the user's input and sends it to handleInput
	public void print() {
		System.out.print("> ");
		String input = scn.nextLine();
		handleInput(input);
	}
	
	// handleInput uses a switch statement to parse the user's input into commands
	// if not valid, the default for the switch statement is invalid command
	private void handleInput(String input) {
		switch (input) {
		case "add":
			add();
			break;
		case "delete":
			delete();
			break;
		case "mark done":
			done();
			break;
		case "list pending":
			list("pending");
			break;
		case "list done":
			list("done");
			break;
		case "list all":
			list("all");
			break;
		case "help":
			help();
			break;
		case "quit":
			System.exit(0);
			break;
		default: 
			System.out.println("\nInvalid command\n");
			print();
		}
	}
	
	// help simply prints the list of available commands
	public void help() {
		System.out.print("Available functions: \n"
				+ "add: to add an item\n"
				+ "delete: to delete an item\n"
				+ "mark done: the item to mark as done\n"
				+ "list pending: to list the pending items\n"
				+ "list done: to list the done items\n"
				+ "list all: to list all items\n"
				+ "help: display available functions\n"
				+ "quit: to exit\n");
		System.out.println();
	}
	
	// adds a new item to the ToDo list
	private void add() {
		System.out.print("Enter a description: ");
		String desc = scn.nextLine();
		// default is false for done, and increment ID after adding
		dao.add(new ToDoItem(++ID, desc, false));
		System.out.print("\n[item added] \n");
	}
	
	// print an item if it has a matching item ID, then remove it
	private void delete() {
		System.out.print("Enter an item ID: ");
		int id = Integer.parseInt(scn.nextLine());
		if (dao.find(id) == null) {
			System.out.println("[ERROR] Could not find an item");
			return;
		}
		// remove it using ArrayList's built-in method for delete
		dao.delete(dao.find(id));
	}
	
	// mark an item as done if it is found
	private void done() {
		System.out.print("Enter an item ID: ");
		int id = Integer.parseInt(scn.nextLine());
		if (dao.find(id) == null) {
			System.out.println("\n[ERROR] Could not find an item\n");
			return;
		}
		dao.update(dao.find(id));
		System.out.println("[Item updated]");
	}
	
	// access the DAO's list function with the specified flag
	private void list(String flag) {
		dao.list(flag);
	}
}
