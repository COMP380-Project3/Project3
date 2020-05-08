import java.time.LocalDate;
import java.util.UUID;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

//public class ActionItem extends Issues{ // is what i would put if i had an issues class
public class ActionItems{

	String uniqueID;
	String name;
	String description;
	String dateCreated;
	String dateAssigned;
	String resourceName;
	String expectedCompletionDate;
	String actualCompletionDate;
	String status;
	String statusDescription;
	String updateDate;

	ActionItems(){
		uniqueID = generateUniqueID();
		setName("");
		setDescription("");setTodayDate("");
		setResources("");
		setExpectedCompletionDate("");
		setActualCompletionDate("");
		setStatus("");
		setStatusDescription("");
	}

	//constructor with items
	ActionItems(String name, String description, String dateCreated, String resourceName,
			String expectedCompletionDate, String actualCompletionDate,
			String status, String statusDescription){
		uniqueID = generateUniqueID();
		setName(name);
		setDescription(description);
		if(dateCreated.isEmpty()) {
			setTodayDate();
		}else {
			setTodayDate(dateCreated);
		}
		setResources(resourceName);
		setExpectedCompletionDate(expectedCompletionDate);
		setActualCompletionDate(actualCompletionDate);
		setStatus(status);
		setStatusDescription(statusDescription);
		setUpdateDate();
	}

	ActionItems(String name, String description, String dateCreated, String resourceName,
			String dateAssigned, String expectedCompletionDate, String actualCompletionDate,
			String status, String statusDescription, String updateDate){
		uniqueID = generateUniqueID();
		setName(name);
		setDescription(description);
		if(dateCreated.isEmpty()) {
			setTodayDate();
		}else {
			setTodayDate(dateCreated);
		}
		if(resourceName.isEmpty() && dateAssigned.isEmpty()) {
			setResources("", "");
		}else if(dateAssigned.isEmpty()){
			setResources(resourceName, "");
		}else{
			setResources(resourceName, dateAssigned);
		}
		setExpectedCompletionDate(expectedCompletionDate);
		setActualCompletionDate(actualCompletionDate);
		setStatus(status);
		setStatusDescription(statusDescription);
		setUpdateDate();
	}
	ActionItems(String uniqueID, String name, String description, String dateCreated, String resourceName,
			String dateAssigned, String expectedCompletionDate, String actualCompletionDate,
			String status, String statusDescription, String updateDate){
		this.uniqueID = uniqueID;
		setName(name);
		setDescription(description);
		setTodayDate(dateCreated);
		setResources(resourceName, dateAssigned);
		setExpectedCompletionDate(expectedCompletionDate);
		setActualCompletionDate(actualCompletionDate);
		setStatus(status);
		setStatusDescription(statusDescription);
		setUpdateDate();
	}

	public String generateUniqueID() {
		String uniqueID = UUID.randomUUID().toString();
		return uniqueID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTodayDate() {
		return dateCreated;
	}

	public void setTodayDate() {
		LocalDate today = LocalDate.now();
		dateCreated = today.toString();
	}
	public void setTodayDate(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getResources() {
		return resourceName;
	}

	public void setResources(String names) {
		resourceName = names;
		LocalDate today = LocalDate.now(); //automatically assign a date when a resource is assigned
		dateAssigned = today.toString();
	}
	public void setResources(String names, String date) {
		if(names.isEmpty() && date.isEmpty()){
			resourceName = "";
			dateAssigned = "";
		}else if(date.isEmpty()){
			resourceName = names;
			LocalDate today = LocalDate.now(); //automatically assign a date when a resource is assigned
			dateAssigned = today.toString();
		}else{
			resourceName = names;
			//LocalDate today = LocalDate.now(); //automatically assign a date when a resource is assigned
			dateAssigned = date;
		}
	}

	public String getExpectedCompletionDate() {
		return expectedCompletionDate;
	}

	public void setExpectedCompletionDate(String expectedCompletionDate) {
		this.expectedCompletionDate = expectedCompletionDate;
	}

	public String getActualCompletionDate() {
		return actualCompletionDate;
	}

	public void setActualCompletionDate(String actualCompletionDate) {
		this.actualCompletionDate = actualCompletionDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDescription() {
		return this.statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateDate() {
		LocalDate today = LocalDate.now(); //automatically assign a date when a resource is assigned
		updateDate = today.toString();
	}

	public String toString(){
		String rtn =  "";
		rtn = uniqueID +":" + name + ":" + description + ":" + dateCreated + ":" + resourceName + ":" + dateAssigned + ":" +
				expectedCompletionDate + ":" + actualCompletionDate + ":" + status + ":" + statusDescription + ":" + updateDate +"\n";
		return rtn;
	}

	//save the linked list into a text document
	public void save(LinkedList<ActionItems> item){
		try {
			//create file if there isnt one
			File myObj = new File("ActionItem.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
			try {

				//write to the file
				FileWriter myWriter = new FileWriter("ActionItem.txt");
				//myWriter.write("Files in Java might be tricky, but it is fun enough!");
				for(int i = 0; i < item.size(); i++){
					myWriter.write(item.get(i).toString());
				}

				myWriter.close();
				System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	//load a new item into the linked list
	public LinkedList<ActionItems> load(){
		LinkedList<ActionItems> item = new LinkedList<ActionItems>();
		try {
			//create file if there isnt one
			File myObj = new File("ActionItem.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
				Scanner reader = new Scanner(myObj);
				String[] temp = new String[11];
				String tempIN;
				while(reader.hasNext()) {

					tempIN = reader.nextLine();
					temp= tempIN.split(":");
					System.out.println("tempIN values = " + temp);
					item.add(new ActionItems(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9], temp[10]));
				}
			}
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return item;
	}


}
