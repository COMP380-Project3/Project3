import java.time.LocalDate;
import java.util.UUID;

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
		setDescription("");
		if(dateCreated.isEmpty()) {
			setTodayDate();
		}else {
			setTodayDate(dateCreated);
		}
		setResources(resourceName);
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
		setResources(resourceName, 1);
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
  public void setResources(String names, int a) {
		resourceName = names;
		LocalDate today = LocalDate.now(); //automatically assign a date when a resource is assigned
		dateAssigned = today.toString();
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

}
