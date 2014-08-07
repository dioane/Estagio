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
public class MenuController implements Initializable {
    
    
     @FXML
   public void handleButtonActionCliente(ActionEvent event) throws Exception  { 
       System.out.println("teste2");
        ChamaTelaMenu a = new ChamaTelaMenu();  
        a.start(new Stage());
   }
public void handleButtonActionFuncionário (ActionEvent event) throws Exception  { 
       System.out.println("teste3");
        ChamaTelaMenuFuncionário a = new ChamaTelaMenuFuncionário();  
        a.start(new Stage());
        
   }

public void handleButtonActionProduto (ActionEvent event) throws Exception  { 
       System.out.println("teste3");
        ChamaTelaProduto a = new ChamaTelaProduto();  
        a.start(new Stage());
        
   }

public void handleButtonActionUsuário (ActionEvent event) throws Exception  { 
       System.out.println("teste4");
        ChamaTelaUsuário a = new ChamaTelaUsuário();  
        a.start(new Stage());
        
   }
public void handleButtonActionPréVenda (ActionEvent event) throws Exception  { 
       System.out.println("teste5");
        ChamaTelaPréVenda a = new ChamaTelaPréVenda();  
        a.start(new Stage());
        
   }

public void handleButtonActionEstoque (ActionEvent event) throws Exception  { 
       System.out.println("teste5");
        ChamaTelaEstoque a = new ChamaTelaEstoque();  
        a.start(new Stage());
        
   }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
