import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

import javax.swing.JOptionPane;
//import java.sql.date;

public class Task implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID ID;
	private String name;
	private String description;
	private int percentageCompleted;
	private String expectedStartDate;
	private String expectedEndDate;
	private double expectedDuration;
	private int expectedEffort;
	private String actualStartDate;
	private String actualEndDate;
	private double actualDuration;
	private int actualEffort;
	private int effortCompleted;
	private LinkedList<Task>  predeccesors;
	private LinkedList<Task>  succesors;
	private String type;
	private LinkedList<Issues> issues;
	private LinkedList<Resource> resources;

	public Task(String name,String description,String expectedStart, String expectedEnd, int expectedDuration,int expectedEffort,LinkedList<Task> predec, LinkedList<Task> succ,
			String type,LinkedList<Issue> issue,LinkedList<Resource> resource) {
		this.setName(name);		this.setDescription(description);	this.setExpectedStartDate(expectedStart);
		this.setExpectedEndDate(expectedEnd); 	this.setExpectedDuration(expectedDuration);
		this.setExpectedEffort(expectedEffort);  	this.setPredeccesors(predec);	this.setSuccesors(succ);
		this.percentageCompleted=0; generateID(); 
		if (isRightType(type))
			this.type=type;
		this.issues= issue;
		this.resources = resource;
	}
	
	public Task(String name,String type,String expectedStart, String expectedEnd) {
		this.name=name;
		this.type=type;
		this.expectedStartDate= expectedStart;
		this.expectedEndDate=expectedEnd;
		this.percentageCompleted=0;
		generateID();
	}
	public void updateTask(String name,String expectedStart, String expectedEnd, String type) {
		this.setName(name);	this.setExpectedStartDate(expectedStart);	this.setExpectedEndDate(expectedEnd);
		generateID(); this.percentageCompleted=0;
		//if (!isRightType(type)) 
			//System.out.println("Error with type in constructor");
		//else
			//this.type=type;
		
	}
	public void updateTask(String name,String description,String expectedStart, String expectedEnd, 
			int expectedDuration,int expectedEffort,LinkedList<Task> predec, LinkedList<Task> succ,
			String type,LinkedList<Issue>  issues, LinkedList<Resource> resources ) {
		this.setName(name);		this.setDescription(description);	this.setExpectedStartDate(expectedStart);
		this.setExpectedEndDate(expectedEnd); 	this.setExpectedDuration(expectedDuration);
		this.setExpectedEffort(expectedEffort);  	this.setPredeccesors(predec);	this.setSuccesors(succ);
		this.percentageCompleted=0; generateID();
		if (isRightType(type))
			this.type=type;
		this.issues = issues;		this.resourrces= resources;
	}
	private boolean isRightType(String type) {
		return (type.toLowerCase() == "task" || type.toLowerCase() == "summary task");
	}

	public void generateID() {
		ID= UUID.randomUUID();
	}
	public UUID getID() {
		return ID;
	}
	
	public void updateType(String type) {
		if (isRightType(type)) 
			this.type=type;
	}
	public void setResource(LinkedList<Resource> resource) {
		this.resources=resource;
	}
	public LinkedList<Resource> getResource(){
		return this.resources;
	}
	public void setIssue(LinkedList<Issue> issues) {
		this.issues=issues;
	}
	public LinkedList<Issue> getIssues(){
		return this.issues;
	}
	public void addResource(Resource resource) {
		this.resources.add(resource);
	}
	public void removeResource(int index) {
		this.resources.remove(index);
	}
	public void addissues(issues issue) {
		this.issues.add(issue);
	}
	public void removeissues(int index) {
		this.issues.remove(index);
	}
	public String getType() {
		return type;
	}
	
	public int getExpectedEffort() {
		return expectedEffort;
	}
	public void setExpectedEffort(int expectedEffort) {
		this.expectedEffort = expectedEffort;
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
	
	public int getPercentageCompleted() {
		return percentageCompleted;
	}
	public void setPercentageCompleted(int percentageCompleted) {
		this.percentageCompleted = percentageCompleted;
	}
	
	public String getExpectedStartDate() {
		return expectedStartDate;
	}
	public void setExpectedStartDate(String expectedStartDate) {
		this.expectedStartDate = expectedStartDate;
	}
	
	public String getExpectedEndDate() {
		return expectedEndDate;
	}
	public void setExpectedEndDate(String expectedEndDate) {
		this.expectedEndDate = expectedEndDate;
	}
	
	public double getExpectedDuration() {
		return expectedDuration;
	}
	public void setExpectedDuration(double expectedDuration) {
		this.expectedDuration = expectedDuration;
	}
	
	public String getActualStartDate() {
		return actualStartDate;
	}
	public void setActualStartDate(String actualStartDate) {
		this.actualStartDate = actualStartDate;
	}
	
	public String getActualEndDate() {
		return actualEndDate;
	}
	public void setActualEndDate(String actualEndDate) {
		this.actualEndDate = actualEndDate;
	}
	
	public double getActualDuration() {
		return actualDuration;
	}
	public void setActualDuration(double actualDuration) {
		this.actualDuration = actualDuration;
	}
	
	public int getActualEffort() {
		return actualEffort;
	}
	public void setActualEffort(int actualEffort) {
		this.actualEffort = actualEffort;
	}
	
	public int getEffortCompleted() {
		return effortCompleted;
	}
	public void setEffortCompleted(int effortCompleted) {
		this.effortCompleted = effortCompleted;
	}
	
	public LinkedList<Task> getPredeccesors() {
		return predeccesors;
	}
	public void setPredeccesors(LinkedList<Task> predeccesors) {
		this.predeccesors = predeccesors;
	}
	
	public LinkedList<Task> getSuccesors() {
		return succesors;
	}
	public void setSuccesors(LinkedList<Task> succesors) {
		this.succesors = succesors;
	}
	public void addSuccesor(Task succesor) {
		this.succesors.add(succesor);
	}
	public void addPredeccesors(Task pred) {
		this.predeccesors.add(pred);
	}
	
	
	
/*
	public Issues[] getIssues(){
		return issues;
		
	public void assignIssue (Issue issue) {
 	if (issues list is empty)
 		return, no issue to assign
 	else 
 		this.issues[this.issues.length()-1] = issue;
 }
 */
	/*public void assignResource (Resource resource) {
 	if (resources list is empty)
 		return, no resource to assign
 	else 
 		this.resources[this.resources.length()-1] = resource;
 }
 	
 	public Resource [] getResource(){
 		return resource; 
 */
	
	public boolean isEmpty() {
		return ID==null;
	}
	
	
	public void save(LinkedList<Task> tasks){
		try {
			//create file if there isnt one
			File myObj = new File("Task.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
			try {

				//write to the file
				FileWriter myWriter = new FileWriter("Task.txt");
				//myWriter.write("Files in Java might be tricky, but it is fun enough!");
				for(int i = 0; i < tasks.size(); i++){
					myWriter.write(tasks.get(i).toString());
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
	public LinkedList<Task> load(){
		LinkedList<Task> item = new LinkedList<Task>();
		try {
			//create file if there isnt one
			File myObj = new File("Task.txt");
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
					item.add(new Task(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9], temp[10]));
				}
			}
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return item;
	}
	

}
