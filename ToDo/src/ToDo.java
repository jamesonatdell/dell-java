// The class ToDo contains the main method for the program
// it takes in one unused argument, the String[] of args.
// It instantiaties a new controller, calls the help function,
// and begins the loop. it only breaks when System.exit(0) is called in "quit."

// Otherwise, it goes forever.
public class ToDo {
	public static void main(String[] args) {
		Controller controller= new Controller();
		// include a system.exit(0) in the controller so no need to break loop otherwise
		// call initial help function since it shoudln't be called every print method call
		controller.help();
		while (true) {
			// the loop of the program - print acts as the controller.
			controller.print();
		}
	}
}
