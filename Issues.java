//Julio
//Issue.java
import java.util.Date;
//import java.sql.date;


public class Issues {
	private long UniqueID;
	private String IssueName;
	private String Description;
	private int Severity;
	private Date expectedStartDate;
	private Date expectedEndDate;
	private Date actualEndDate;
	private string status;
	

  
        private String createIssue;
	private String edirIssue;
	private String deleteIssue;
List of Action Items: arrayList<ActionItem>
	
List of Decisions: arrayList<Decisions>
       
	private Issues [] issues;

Issue(String name, String description, String dateCreated, String resourceName,
			String expectedCompletionDate, String actualCompletionDate,
			String status, String statusDescription){
		uniqueID = generateUniqueID();
		this.IssueName=IssueName;		
		this.IssueDescription=IssueDescription;	
		this.expectedStartDate = expectedStart;
		this.expectedEndDate = expectedEnd; 	
		this.severity=severity;
		this.status=status;
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


	public void GenerateUniqueID () {
	Random rand = new Random(); //instance of random class
      int upperbound = 1000;
        //generate random values from 0-1000
      int int_random = rand.nextInt(upperbound); 
	}


	
	public void updateName ( String newName) {this.name = newName;}
	public void updateIssue(String newIssue) {this.description=newDesc;
	public void  updateExpectedStartDate(Date newDate) {this.expectedStartDate=newDate;}

	public void  updateExpectedEndDate(Date newDate) {this.expectedEndDate=newDate;}
	public void  updateActualStartDate(Date newDate) {this.actualStartDate=newDate;}
	public void  updateActualEndDate(Date newDate) {this.actualEndDate=newDate;}
        public void  updateSeverity(Date newDate) {this.Severity=newSev;}
	public void updateStatus ( String newStatus) {this.status = newStatus;}
	/*public void assignPriority (Priority priority) {

	 	//order issues based on their severity
		//high severity=high priority
		//low severity= low priority
		//assign a value of 0 to low severity
		//assign a value of 1 to medium severity
		//assign a value of 2 to high severity
		
		
		 for(String str: arraylist){
			System.out.println(str);
		}

	   /* Sorting in decreasing order*/
	   Collections.sort(arraylist, Collections.reverseOrder());

	   /* Sorted List in reverse order*/
	   System.out.println("ArrayList in decending order:");
	   for(String str: arraylist){
			System.out.println(str);
		}
	}

	 }*/



	/*public void assignIssue (Issue issue) {
 	//assign issue to task
	// define two strings
String issue = this.issue;
String task  = this.task;

// concatenate the strings
String association  = issue + task;
 }*/
 


public void setName(String name) {
		this.name = name;
	}
public void setDescription(String des) {
		this.des = des;
	}
public void setPriority(String priority) {
		this.priority = priority;
	}
public void setSeverity(String sev) {
		this.sev = sev;
	}
public void setDateRaised(int date) {
		this.date = date;
	}
public void setDateAssigned(int datea) {
		this.datea = datea;
	}
public void setExpectedCompletionDate(int ex) {
		this.ex = ex;
	}
public void setActualCompletionDate(Sint act) {
		this.act = act;
	}
public void setStatus(String status) {
		this.status = status;
	}
public void setStatusDescription(String statdes) {
		this.statdes = statdes;
	}
public void setUpdateDate(int dateu) {
		this.dateu = dateu;
	}

public String getName() {
		return name;
	}
public String getStatusDescription() {
		return this.statusDescription;
	}
public Priority getPriority() {
		return this.priority;
	}
public Severity getSeverity() {
		return this.statusSeverity;
	}
 public date getDateRaised() {
		return this.DateRaised;
	}
public date getDateAssigned() {
		return this.DateAssigneed;
	}
public date getExpectedCompletionDate() {
		return this.ExpectedCompletionDate;
	}
public date getActualCompletionDate() {
		return this.ActualCompletionDate;
	}
public String getStatus() {
		return this.status;
	}
public void setStatus(String status) {
		this.status = status;
	}
date getUpdateDate() {
		return this.UpdateDatee;
	}
 
public void getListofDecisions() {
		return this.ListofDesisions;
	}
 public void setListOfTasks (ArrayList<Issue> tasks) {
    this.issue = issue;
  }
 public ArrayList<Tasks> getListOfTasks () {
    return tasks;
  }
      

}
