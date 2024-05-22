package MashianePOEPart1And2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */
public class RegisterAndLoginSystem {
 //Create register and login objects
    
    static Login objLogin = new Login ();
    static TaskClass objTask = new TaskClass ();
      
    public static void getRegisterInput(){
        objLogin.setFirstName(JOptionPane.showInputDialog("Please enter your first name : "));
        objLogin.setLastName(JOptionPane.showInputDialog("Please enter your last name : "));
        objLogin.checkUserName();
        objLogin.checkPasswordComplexity();
        objLogin.registerUser();
        objLogin.setLoginUsername(JOptionPane.showInputDialog("Please enter your username : "));
        objLogin.setLoginPassword(JOptionPane.showInputDialog("Please enter your password :"));
        objLogin.loginUser();
        objLogin.returnLoginStatus();
        
    }
 public static void main(String[] args) {
        // Call a method to get user input
        getRegisterInput();
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanBan ! ");
             
    // This code allows the user to make a selection from a numeric menu which I have named ' options'
        int options = Integer.parseInt(JOptionPane.showInputDialog("Please select an option then press OK : \n 1) Add tasks \n" + " 2) Show Report (Coming Soon) \n"+ "3) Quit"));
                                     
          switch (options)// This switch will determine what happens in the program based on what the user decides
          {
              case 1:{
                 int taskNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of tasks : "));
 
                
//This for loop will run for the number of times the user has entered the number of tasks
                for(int i =0;i<taskNumber;++i){
                  //Some methods will be displayed using JOptionPane  
                    objTask.setTaskName((JOptionPane.showInputDialog("Please enter the task name : ")));
                    objTask.setTaskDesription((JOptionPane.showInputDialog("Please enter a short task description : ")));
                    objTask.checkTaskDescription();
                    objTask.setDeveloperDetails((JOptionPane.showInputDialog("Please enter the first and last name of the developer : ")));
                    JOptionPane.showMessageDialog(null,objTask.createTaskID());
                    objTask.setDuration(Integer.parseInt(JOptionPane.showInputDialog("Please enter your task duration ( in hours )")));
                    JOptionPane.showMessageDialog(null,objTask.returnTotalHours());
                    int option = Integer.parseInt(JOptionPane.showInputDialog("Please enter the task status by selecting one of the options below :\n 1) To-Do\n" + "2) Done \n" + "3) Doing"));
                    JOptionPane.showMessageDialog(null,objTask.printTaskDetails());
                }
              }
                case 2:{
          //This if statement will execute once the user has selected the second option
          if (options == 2){
          JOptionPane.showMessageDialog(null,"Coming soon");
          } break;}
          case 3:{
          if (options == 3){  // This code statement will execute once the user selects 3
          System.exit(0);}
 }
          default :{
              JOptionPane.showMessageDialog(null,"Please restart the program and select one of the three options");
   
    }
}
}
              }
           
    
    
        
    
      