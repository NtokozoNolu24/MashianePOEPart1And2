
package MashianeLoginICETaskThreePrj;

import javax.swing.JOptionPane;
/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */

public class Login {
    //Declare protected variables
      protected String username;
      protected String password;
      protected String firstName;
      protected String lastName;
      // declare strings for entered variables
      String enteredUsername;
      String enteredPassword;
      String enteredfirstName;
      String enteredlastName;

    public Login() {
        //This method is used to match variables
        this.enteredPassword =password;
        this.enteredUsername = username;
        this.enteredfirstName = firstName;
        this.enteredlastName = lastName;
        
    }
      
    public void RegisterUser(){
    }
    //Create login user method
     public void LoginUser(){
     String enteredUsername = username;
     String enteredPassword = password;
     String enteredfirstName = firstName;
     String enteredlastName = lastName;
            JOptionPane.showInputDialog("Please enter your username :");
            JOptionPane.showInputDialog("Please enter your password :");
    if(enteredUsername.equals(username)&& enteredPassword.equals(password)&& enteredfirstName.equals(firstName)&& enteredlastName.equals(lastName)){
        JOptionPane.showMessageDialog(null, "Welcome " + firstName + lastName + ", It is great to see you again!");
    } 
    else{
    JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again","ERROR",JOptionPane.ERROR_MESSAGE);
    
}
         
     }   
  // Create a method to validate your login
   public void returnLoginStatus(){
     
        if(enteredUsername.equals(username)&& enteredPassword.equals(password)&& enteredfirstName.equals(firstName)&& enteredlastName.equals(lastName)){
               JOptionPane.showMessageDialog(null, "A successful login !");}
        else{
            JOptionPane.showMessageDialog(null,"A failed login!","ERROR",JOptionPane.ERROR_MESSAGE);
           
        }
        }
    }


   
        