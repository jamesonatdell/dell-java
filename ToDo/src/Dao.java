// The DAO is the database which contains and manages the ToDoItems
// It has one attribute, an ArrayList of ToDoItems which holds the ToDoItems
// It has five methods:
//- update method (mark a to-do item as complete)
// find method - search the DB for an item corresponding to an ID
//- add method - add an item to the DB
//- delete method - remove an item from the DB
//- list method - list the items of the DB depending on the flag set
import java.util.*;
public class Dao {
	private List<ToDoItem> database = new ArrayList<ToDoItem>();
	
	// validation for an invalid ID is handled in Controller
	public void update(ToDoItem toUpdate) {
		// update the flag
		toUpdate.update();
	}
	
	// Loop through the DB and find the item corresponding to the ID
	public ToDoItem find(int id) {
		for (ToDoItem item: database) {
			if (item.id == id) {
				return item;
			}
		}
		// if not found, return null
		return null;
	}
	
	// add item to the database
	public void add(ToDoItem toAdd) {
		if (!this.database.contains(toAdd) && toAdd != null) {
			this.database.add(toAdd);
			return;
		}
		
		// unsure if this will ever be reached as you can't have duplicate items since ID updates
		System.out.println("Item already exists in DB.");
	}
	
	// find the item if it exists, print the id, desc, and flag
	// remove the item from the DB which is an ArrayList with a built in remove method
	public void delete(ToDoItem toDelete) {
		if (database.contains(toDelete)) {
			System.out.println("Item: " + toDelete.id);
			System.out.println("Description: " + toDelete.desc);
			String flag = "pending";
			if (toDelete.flag) {
				flag = "completed";
			}
			System.out.println("Status: " + flag);
			database.remove(toDelete);
		
		}
	}
	
	
	// list the attributes based on three flags - pending, done, all - from the PARAM flag
	public void list(String flag) {
		// variable for how many items have been found
		int itemCount = 0;
		 System.out.println("ID | description | Status");
		 System.out.println("---+-------------+--------+");
		 // find items by pending, done, or the third category, all
		if (flag.equals("pending")) {
			// loop through the database and print based on pending flags
			for (ToDoItem item: this.database) {
				if (!item.flag) {
					// increase item count if it's found
					itemCount++;
//					---+-------------+--------+
					System.out.println(item.id + " | " + item.desc+ "     |      pending");
				}
			}
		} else if (flag.equals("done")){
			// done
			for (ToDoItem item: this.database) {
				if (item.flag) {
					itemCount++;
					System.out.println(item.id + " | " + item.desc + "     |      completed");
				}
			}
		} else {
			for (ToDoItem item: this.database) {
				String status = "pending";
				if (item.flag) {
					status = "completed";
				}
				itemCount++;
				System.out.println(item.id + " | " + item.desc + "     |      " + status);
			}
		}
		// print based on if we have 1 item or 0/many items
		if (itemCount == 1) {
			System.out.println("[" + itemCount + " entry]");
		} else {
			System.out.println("[" + itemCount + " entries]");
		}
	}


}
