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



  

        private String editIssue;



       

	private Issues [] issues;





	public void createIssue(String IssueName,String IssueDescription,Date expectedStart, Date expectedEnd, int expectedDuration



			String type/*,Issue [] issues, Resource [] resources*/ ) {

		this.IssueName=IssueName;		this.IssueDescription=IssueDescription;	this.expectedStartDate = expectedStart;

		this.expectedEndDate = expectedEnd; 	





		if (type.toLowerCase() != "Issue" || type.toLowerCase() != "Issue Summary" || type.toLowerCase() != "" ) {



			System.out.println("error with type of Issue");







		}



		this.issues = issues;		

	}

	/**







	 * Not implemented







	 */







	public void GenerateUniqueID () {

	}





	// Display Task method;

	public void updateName ( String newName) {this.name = newName;}

	public void updateIssue(String newIssue) {this.description=newDesc;

	public void  updateExpectedStartDate(Date newDate) {this.expectedStartDate=newDate;}



	public void  updateExpectedEndDate(Date newDate) {this.expectedEndDate=newDate;}

	public void  updateActualStartDate(Date newDate) {this.actualStartDate=newDate;}

	public void  updateActualEndDate(Date newDate) {this.actualEndDate=newDate;}





        public void  updateSeverity(Date newDate) {this.Severity=newSev;}

	

	/*public void assignResource (Resource resource) {



	 	if (resources list is empty)



	 		return, no resource to assign



	 	else 



	 		this.resources[this.resources.length()-1] = resource;



	 }*/











	/*public void assignIssue (Issue issue) {

 	if (issues list is empty)



 		return, no issue to assign



 	else 



 		this.issues[this.issues.length()-1] = issue;



 }*/







}