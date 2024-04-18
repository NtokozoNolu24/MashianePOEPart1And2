package MashianeLoginICETaskThreePrj;

/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */
public class RegisterAndLoginSystem {
 //Create register and login objects
    static Register objRegister = new Register();
    static Login objLogin = new Login();

    public static void main(String[] args) {
  // call Register method
  Register();
  // call Login method
  Login();
    }   
    //Call methods created in register class
    public static void Register(){
      objRegister.Register();
      objRegister.checkPasswordComplexity();
      objRegister.successfulRegister();
      
      //Call methods created in login class
    }
    public static void Login(){
     objLogin.RegisterUser();
     objLogin.LoginUser();
     objLogin.returnLoginStatus();
        
    }
}      