import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.UUID;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.UUID;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

//public class Resource 
public class Resource{
	
	 String uniqueID;
	 String name;
	 String title;
         String skills;
	 String payRate;
         String assignedTasks;
         String availability;
         String status;

	
	//Resource dedfault constructor
	Resource() {
                uniqueID = generateUniqueID();
		setName("");
		setTitle("");
                setPayRate("");
                setAvailability("");
                assignSkill("");
                assignTask("");
                setStatus("");    
        }
        
        //Resource constructor
        Resource(String name, String title, String skills, String payRate, String assignedTask,String status, String availability){
		uniqueID = generateUniqueID();
		setName(name);
		setTitle(title);
                setPayRate(payRate);
                setAvailability(availability);
                assignSkill(skills);
                assignTask(assignedTasks);
                setStatus(status);
	}
        
        Resource(String uniqueID, String name, String title, String skills, String payRate, String assignedTask,String status, String availability){
		this.uniqueID = generateUniqueID();
		setName(name);
		setTitle(title);
                setPayRate(payRate);
                setAvailability(availability);
                assignSkill(skills);
                assignTask(assignedTasks);
                setStatus(status);
	}
        
	// Unique ID generator
	private static String generateUniqueID() {
		String uniqueID = UUID.randomUUID().toString();
		return uniqueID;
	}

	//--------------------------------------Set functions
        public void setName(String name) { this.name = name;}
       
        public void setTitle(String title) {	this.title = title;}
                
        public void setPayRate(String payRate) { this.payRate = payRate; }
        
        public void setAvailability(String availability){ this.availability = availability;}
        
        public void setStatus(String status){ 
            if(this.assignedTasks != "")
                this.status = "Assigned";
            else{
                this.status = "Unassigned";
            }
        } 
        
        public void assignTask(String task){ this.assignedTasks = task;}
        
        public void assignSkill(String skill){ this.skills = skill;}

        //--------------------------------------Get functions

        public String getName(String name) { return this.name; }
       
        public String getTitle(String title) { return this.title; } 
        
        public String getPayRate(String payRate) { return this.payRate; } 
        
        public String getAvailability(String availability){
            return this.availability;
        }
        
        public String getStatus(String status) { return this.status; } 

        public String getTask(String task){ return assignedTasks;}
        
        public String getSkill(String skill){ return skills;}
        
        
        //--------------------------------------------------Save/delete 
        public void finalize() throws Throwable{
            System.out.println("Resource deleted.");
        }
        
       public String toString(){
		String rtn =  "";
		rtn = uniqueID +":" + name + ":" + title + ":" + skills + ":" + payRate + ":" + assignedTasks + ":" +
				availability + ":" + status + "\n";
		return rtn;
	}
        
         public void deleteResource(Resource resource){
             resource = null;
        }
         
         //save the linked list into a text document
	public void save(LinkedList<Resource> item){
		try {
			//create file if there isnt one
			File myObj = new File("Resource.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
			try {
				//write to the file
				FileWriter myWriter = new FileWriter("Resource.txt");
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
	public LinkedList<Resource> load(){
		LinkedList<Resource> item = new LinkedList<Resource>();
		try {
			//create file if there isnt one
			File myObj = new File("Resource.txt");
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
					item.add(new Resource(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]));
				}
			}
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return item;
	}
}     
