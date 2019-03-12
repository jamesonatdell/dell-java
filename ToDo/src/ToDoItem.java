// The ToDoItem is the object representing a ToDo item in the database
// it has three attributes:
// int ID, corresponding to the ID of the ToDoItem
// String description, a description of the item
// boolean flag - false for pending, true for done

// it has one method, an update method, which marks an item as completed
// it has one constructor with three arguments corresponding to the three attributes.
public class ToDoItem {
	int id;
	String desc;
	boolean flag;
	
	public ToDoItem(int id, String desc, boolean flag) {
		this.id =id;
		this.desc = desc;
		this.flag = flag;
	}
	
	public void update() {
		this.flag = true;
	}

	
}
