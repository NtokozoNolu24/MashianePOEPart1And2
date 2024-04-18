
package MashianeLoginICETaskThreePrj;

import static MashianeLoginICETaskThreePrj.RegisterAndLoginSystem.objRegister;
import javax.swing.JOptionPane;


/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */
public class Register {
    
   
    // Declare your variables as private
       private String firstName = "";
       private String lastName = "";
       private String username = "";
       private String password = "";
       
       //Declare constructors
    public Register() {
    }
//Declare getters and setters for each variable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
   //Create a method to allow user to enter register details
public void Register(){
    
      objRegister.setFirstName(JOptionPane.showInputDialog("Please enter your first name : "));
      objRegister.setLastName(JOptionPane.showInputDialog("Please enter your last name : "));
      for (int i=0; i<2 ;i++)
    {
      objRegister.setUsername(JOptionPane.showInputDialog("Please enter your username : "));
     
    if(username.length()<=5 && username.contains("_")){
              JOptionPane.showMessageDialog(null, "Username successfully captured !");
           break; 
          }
      else{JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore "
                    + "and is no more than 5 characters in length","ERROR",JOptionPane.ERROR_MESSAGE);
     
     }
       }
      }

      // This method ensures that the user meets the password requirements
         public void  checkPasswordComplexity(){
             for (int i=0; i<2 ;i++)
    {
             objRegister.setPassword(JOptionPane.showInputDialog("Please enter your password : "));
              if(password.length()>=8 && password.matches(".*[0-9]*.") && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*()]*.")){
                  JOptionPane.showMessageDialog(null, "Password successfully captured !");
                  
                  break;
         }
         else{ 
             JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.","ERROR",JOptionPane.ERROR_MESSAGE);
              }
    }
         }
         //This method notifies the user that the registration process was successful
 public void successfulRegister(){
     JOptionPane.showMessageDialog(null,"Successful registration!");
         
        
              }
           
         
}

    

