package MashianePOEPart1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */
public class RegisterAndLoginSystem {
 //Create register and login objects
    
    static Login objLogin = new Login ();
    public static void main(String[] args) {
        // Call a method to get user input
        getRegisterInput();
    }   
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

    
    
    }    
    
    
        
    
      