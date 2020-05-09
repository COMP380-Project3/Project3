import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class TaskLoadandSave {
	
	public static void main (String [] args) {
		TaskLoadandSave tr = new TaskLoadandSave();
	LinkedList<Task> tasks = new LinkedList<Task>();
	tasks.add(new Task("task1", "This is task1", "05/15/20","05/30/20", 10, 15, tasks, tasks, "Task", null, null));
	try {
		tr.save(tasks);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		
				tasks = tr.load();
				System.out.println(tasks.getFirst().toString());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	
	}
	public static LinkedList<Task> load () throws IOException{
		String path = System.getProperty("user.dir");
		LinkedList<Task> restoredTask;
		try {
		FileInputStream file = new FileInputStream(path+"\\Task.txt");
		ObjectInputStream input = new ObjectInputStream(file);
		Object o = input.readObject();
		restoredTask = (LinkedList<Task>) o;
		System.out.println("Task.txt loaded");
		
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"The system cannot find the file specified.");
			restoredTask=null;
		}
		return restoredTask;
	}
	public void save (LinkedList<Task> tasks) throws IOException{
		try {
		FileOutputStream file = new FileOutputStream("Task.txt");
		ObjectOutputStream output = new ObjectOutputStream (file);
		output.writeObject(tasks);
		file.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
