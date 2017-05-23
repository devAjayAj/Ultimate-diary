/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimate.diary;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Ajay
 */
public class LoginController implements Initializable {

    @FXML
    TextField userid;
    @FXML
    PasswordField pass;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void enter(KeyEvent event) throws Exception{
        if(event.getCode() == KeyCode.ENTER){
            submit();
        }
    }
    public void exitscreen(KeyEvent event) throws Exception{
        if(event.getCode() == KeyCode.ESCAPE){
            exit();
        }
    }
    public void exitb(){
        exit();
    }
    public boolean checkp(String u,String p) throws SQLException, ClassNotFoundException{
            Class.forName("org.sqlite.JDBC");
            Connection con;
            con = DriverManager.getConnection("jdbc:sqlite:personaldiary.db");
            ResultSet res = null;
            PreparedStatement stat;
            String q = "Select * from details where userid = ? and password = ?";
            stat = con.prepareStatement(q);
            stat.setString(1,u);
            stat.setString(2,p);
            res = stat.executeQuery();
            if(res.next()){
                res.close();
                con.close();
                return true;
            }
            else{
                return false;
            }
        
    }
    public void submit() throws SQLException, ClassNotFoundException, IOException{
        String id = userid.getText();
        String pas = pass.getText();
        if(checkp(id,pas)){
            Stage st = (Stage) pass.getScene().getWindow();
            st.close();
            Stage stag = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("writingsection.fxml"));
            Scene sc = new Scene(root,700,750);
            stag.setScene(sc);
            sc.getStylesheets().add(getClass().getResource("writingsection.css").toExternalForm());
            stag.initStyle(StageStyle.TRANSPARENT);
            stag.show();
        }
        else{
            exit();
        }
    }
}
