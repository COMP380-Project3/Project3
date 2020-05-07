import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.UUID;

//public class Resource 
public class Resource{
	
	private String uniqueID;
	private String name;
	private String title;
	private ArrayList<Skills> skill;
	private Double payRate = 0.0;
        private ArrayList<Tasks> tasksAssigned;
        private String status;

	
	//Resource constructor
	Resource(String name, String title, ArrayList skill, String availabilityCalendar,
			   Double payRate, ArrayList taskAssigned){
		uniqueID = generateUniqueID();
		this.name = name;
		this.title = title;
                this.skill = skill;
                this.payRate = payRate;
                this.tasksAssigned = taskAssigned;
                this.status = status;
	}
        
	// Unique ID generator
	private static String generateUniqueID() {
		String uniqueID = UUID.randomUUID().toString();
		return uniqueID;
	}
        
        
	//--------------------------------------Set functions
        public void setName(String name) { this.name = name;}
       
        public void setTitle(String title) {	this.title = title;}
                
        public void setPayRate(Double payRate) { this.payRate = payRate; }

        public void setSkill(ArrayList skill){
            Iterator i = skill.iterator();
            Boolean  newskillassigned = false;
            
            if(i.next() == skill){
                while (i.hasNext()) {
                    if(i.next() != skill){
                        this.skill = skill;
                        newskillassigned = true;
                    }
                    else{
                        System.out.println("Resource already has this skill");
                    }
                }
            }
        }
        
        public void setNewTask(ArrayList task){
            Iterator i = tasksAssigned.iterator();
            Boolean  newtaskassigned = false;
            
            if(i.next() == task){
            while (i.hasNext()) {
                if(i.next() != task){
                    this.tasksAssigned = task;
                    newtaskassigned = true;
                }
                else{
                    System.out.println("Resource already has this task assigned to it");
                }
            }
            }
        }
        
        //--------------------------------------Get functions

        public String getName(String name) { return this.name; }
       
        public String getTitle(String name) { return this.title; } 
        
        public Double getPayRate(Double payRate) { return this.payRate; } 
        
        public void getSkill(ArrayList skill){
            Iterator i = skill.iterator();
            
            if(i.next() == skill){
                while (i.hasNext()) {
                    System.out.println(this.skill);
                }
            }
        }
        
        public void getTask(ArrayList Tasks){
            Iterator i = Tasks.iterator();
            
            if(i.next() == tasksAssigned){
                while (i.hasNext()) {
                    System.out.println(this.tasksAssigned);
                }
            }
        }
        
        
}
        
        
        
        
	
	
