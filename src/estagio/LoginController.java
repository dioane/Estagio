/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estagio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Cleiton
 */
public class LoginController implements Initializable {
    

    
    
   
    
    
    

   @FXML
   public void handleButtonAction(ActionEvent event) throws Exception  { 
       System.out.println("teste1");
        ChamaTelaLogin a = new ChamaTelaLogin();  
        a.start(new Stage());
        
   }
        

         
    
      @Override
    public void initialize(URL url, ResourceBundle rb) {
   

}
       
}
    