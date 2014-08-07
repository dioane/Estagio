/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estagio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Cleiton
 */
public class Login extends Application {

   
    @Override
        
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setScene(scene);
        stage.show();
       
    stage.setFullScreen(false);//para fazer com que a pagina abra em tela inteira:True
    stage.setResizable(false); //deixar tela maximizada
    
    
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
}

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
} 
