import java.util.Date;
import java.util.LinkedList;

public class Deliverable {

  private String uniqueID;
  private String name;
  private String description;
  private Date expectedCompletionDate;
  private Date actualCompletionDate;
  private ArrayList<Requirements> requirements;
  private ArrayList<Tasks> tasks;
  
  //constructor for creating deliverable objects, used instead of a createDeliverable method.
  public Deliverable (String name, String description, Date expectedCompletionDate, ArrayList<Requirements> requirements, ArrayList<Tasks> tasks) {
  
  this.name = name;
  this.description = description;
  this.expectedCompletionDate = expectedCompletionDate;
  this.requirements = requirements;
  this.tasks = tasks;
  generateUniqueID();
  saveDeliverable();
}
  public void generateUniqueID() {
  //To Do
  }
  
  //update the Deliverable with the passed name
  public void setName (String name) {
  this.name = name;
  }
  
  //retrieve the Deliverable's current name attribute
  public String getName () {
  return name;
  }
  
  //update the Deliverable with the passed description
  public void setDescription (String description) {
  this.description = description;
  }
  
  //retrieve the Deliverable's current description attribute
  public String getDescription () {
  return description;
  }
  
  //update the Deliverable with the passed expected completion date
  public void setExpectedCompletionDate (Date dueDate) {
  this.dueDate = expectedCompletionDate;
  }
  
  //retrieve the Deliverable's current expected completion date attribute
  public Date getExpectedCompletionDate () {
  return expectedCompletionDate;
  }
  
  //update the Deliverable with the passed actual completion date
  public void setActualCompletionDate (Date actualCompletionDate) {
  this.actualCompletionDate = actualCompletionDate;
  }
  
  //retrieve the Deliverable's current actual completion date attribute
  public Date getActualCompletionDate () {
  return actualCompletionDate;
  }
  
  //add the passed Requirements object to the Deliverable's current list of Requirements
  public void assignRequirement (Requirements requirements) {
    this.requirements.add(requirements);
  }
  
  //add the passed Tasks object to the Deliverable's current list of Tasks
  public void assignTask (Tasks tasks) {
    this.tasks.add(tasks);
  }
  
  //update the Deliverable with the passed list of Requirements
  public void setListOfRequirements (ArrayList<Requirements> requirements) {
    this.requirements = requirements;
  }
  
  //retrieve the Deliverable's current list of Requirements attribute
  public <ArrayList<Requirements> getListOfRequirements () {
    return requirements;
  }
  
  //update the Deliverable with the passed list of Tasks
  public void setListOfTasks (ArrayList<Tasks> tasks) {
    this.tasks = tasks;
  }
  
  //retrieve the Deliverable's current list of Tasks attribute
  public ArrayList<Tasks> getListOfTasks () {
    return tasks;
  }
  
  //output the Deliverable and all of its attributes
  public void displayDeliverable() {
  //To Do
  }
  
  //Perform a database save after creating/updating/deleting the Deliverable
  public void saveDeliverable() {
  //To Do
  }
  
  //remove the Deliverable from the database
  public void deleteDeliverable() {
  //To Do
  saveDeliverable();
  }
  
  
    
  
