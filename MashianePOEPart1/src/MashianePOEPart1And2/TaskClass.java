
package MashianePOEPart1And2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */
public class TaskClass {
    
  // Declare attributes required for all tasks 
  public String status;
  public String taskDetails;
  public String taskId;
  public String firstName;
  public int options;
  private String developerDetails;
  private String taskName;
  private String taskDescription;
  private String username;
  private String password;
  private String loginUsername;
  private String loginPassword;
  private int duration;
  private int taskStatus;
  private int taskNumber;
  private int count;
  private int total;
  
  
  // Declare constructors for each attribute
    public TaskClass() {
        this.taskStatus = 0;
        this.developerDetails = "";
        this.taskName = "";
        this.taskDescription = "";
        this.username = "";
        this.password = "";
        this.loginUsername = "";
        this.loginPassword = "";
        this.taskNumber = 0;
        this.count =0;                                             
        this.total =0;
        this.duration =0;
        
    }
   // Create accessor and mutator methods 
    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDesription(String taskDesription) {
        this.taskDescription = taskDesription;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

       
    // This method allows the user to enter task description
public boolean checkTaskDescription(){
    for(int i=0;i<1;i++) //A for loop is used to allow the user to enter task description again if it was incorrect the first time
       
    if (taskDescription.length()>50){
        JOptionPane.showMessageDialog(null, " Please enter a task description of less than 50 characters ","ERROR",JOptionPane.ERROR_MESSAGE);     
   }
    else{
          JOptionPane.showMessageDialog(null,"Task successfully captured ! ");
            }
      return true;
}  

            
// This method creates the taskID using the task name, task number and the developer's name.
  public String createTaskID(){
 taskId = taskName.substring(0,2).toUpperCase() + ":" + taskNumber + ":" +developerDetails.substring(developerDetails.length() - 3).toUpperCase();
      return taskId;
}

    // This method returns the total number of hours for each task
  public int returnTotalHours(){
      int totalOne = 0; // The number of task hours is initialised to 0
      if(count == 0){
          totalOne = duration;
      }
      else if (count >=1){
          total = (totalOne + duration); 
      }
      return duration;
  }
  
  
  // The method below displays task status 
  public String printTaskDetails(){
      if(taskStatus == 1){
          status = ("To-Do");
          return status;
      }
      else if (taskStatus == 2){
          status = ("Done");
          return status;
      }
      else if (taskStatus == 3){
          status = ("Doing");
          return status;
      }
      //The code statement below puts together all the information required to print the task details
   taskDetails = (developerDetails + "\n" + taskName + "\n" +  taskDescription + "\n" + status + "\n" + duration + "\n" + taskId );
    
      return taskDetails;
  }
  /* 
  REFERENCE LIST 
  Farrell, J. 2019. Java Programming. 9th ed. Boston: Cengage
  W3Schools. 2024. Java, 2024. [Online]. Available at: https://www.w3schools.com/java/ [Accessed on 21 May 2024]
  Switch Statement in java - Neso Academy . 2020. YouTube video. [Online]. Available at: https://m.youtube.com/watch?v=wcwWlasmLWs&pp=y.gUjaG93IHRvIHVzZSBzd2I0Y2ggc3RhdGVtZW50IGlulGphdmE%3D [Accessed on 21 May 2024]
  
  */
}

