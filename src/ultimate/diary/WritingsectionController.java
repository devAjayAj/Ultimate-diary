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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import static javafx.application.Platform.exit;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Ajay
 */
public class WritingsectionController implements Initializable {

    @FXML
    TextArea write;
    @FXML
    Pane colorpalettepane;
    @FXML
    Pane top;
    @FXML
    Pane bottom;
    @FXML
    Button yellowb;
    @FXML
    Button orangeb;
    @FXML
    Button violetb;
    @FXML
    Button blueb;
    @FXML
    Button greenb;
    @FXML
    Button brownb;
    @FXML
    Button greyb;
    @FXML
    Button pinkb;
    @FXML
    Button aquab;
    @FXML
    Button saveb;
    @FXML
    Button writeb;
    @FXML
    Button colorpaletteb;
    @FXML
    Label savemessage;
    public String ctop,cbottom;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        write.setWrapText(true);
        write.setDisable(true);
        colorpalettepane.setVisible(false);
        colorpalettepane.setDisable(true);
        yellowb.setVisible(false);
        orangeb.setVisible(false);
        violetb.setVisible(false);
        blueb.setVisible(false);
        greenb.setVisible(false);
        brownb.setVisible(false);
        greyb.setVisible(false);
        pinkb.setVisible(false);
        aquab.setVisible(false);
        ctop = "-fx-background-color: #42A5F5;";
        cbottom = "-fx-background-color: #BBDEFB;";
        message.setVisible(false);
        savemessage.setVisible(false);
    }    
    public void exitscreen(KeyEvent event) throws Exception{
        if(colorpalettepane.isDisable()){
        if(event.getCode() == KeyCode.ESCAPE){
            exit();
        }
        }
        else{
            if(event.getCode() == KeyCode.ESCAPE){
            hide();
        }
        }
    }
        
    public void showpalette(){
        colorpalettepane.setDisable(false);
        colorpalettepane.setVisible(true);
        yellowb.setVisible(true);
        orangeb.setVisible(true);
        violetb.setVisible(true);
        blueb.setVisible(true);
        greenb.setVisible(true);
        brownb.setVisible(true);
        greyb.setVisible(true);
        pinkb.setVisible(true);
        aquab.setVisible(true);
    }
    public void writeb(){
        write.setDisable(false);
        write.requestFocus();
        ScrollBar scroll = (ScrollBar) write.lookup(".scroll-bar:vertical:disabled");
        scroll.setDisable(true);
    }
    public void applyyellow(){
        ctop = "-fx-background-color: #FFEE58;";
        cbottom = "-fx-background-color: #FFF9C4;";
        top.setStyle("-fx-background-color: #FFEE58;");
        bottom.setStyle("-fx-background-color: #FFF9C4;");
        saveb.setStyle("-fx-background-color: #FFEE58;");
        writeb.setStyle("-fx-background-color: #FFEE58;");
        colorpaletteb.setStyle("-fx-background-color: #FFEE58;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #FFFDE7;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #FFEE58;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #FFFDE7;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #FFEE58;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #FFFDE7;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #FFEE58;");
        }
        });
    }
    public void applyorange(){
        ctop = "-fx-background-color: #FF7043;";
        cbottom = "-fx-background-color: #FFCCBC;";
        top.setStyle("-fx-background-color: #FF7043;");
        bottom.setStyle("-fx-background-color: #FFCCBC;");
        saveb.setStyle("-fx-background-color: #FF7043;");
        writeb.setStyle("-fx-background-color: #FF7043;");
        colorpaletteb.setStyle("-fx-background-color: #FF7043;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #FBE9E7;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #FF7043;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #FBE9E7;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #FF7043;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #FBE9E7;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #FF7043;");
        }
        });
    }
    public void applyviolet(){
        ctop = "-fx-background-color: #7E57C2;";
        cbottom = "-fx-background-color: #D1C4E9;";
        top.setStyle("-fx-background-color: #7E57C2;");
        bottom.setStyle("-fx-background-color: #D1C4E9;");
        saveb.setStyle("-fx-background-color: #7E57C2;");
        writeb.setStyle("-fx-background-color: #7E57C2;");
        colorpaletteb.setStyle("-fx-background-color: #7E57C2;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #D1C4E9;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #7E57C2;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #D1C4E9;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #7E57C2;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #D1C4E9;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #7E57C2;");
        }
        });
    }
    public void applyblue(){
        ctop = "-fx-background-color: #42A5F5;";
        cbottom = "-fx-background-color: #BBDEFB;";
        top.setStyle("-fx-background-color: #42A5F5;");
        bottom.setStyle("-fx-background-color: #BBDEFB;");
        saveb.setStyle("-fx-background-color: #42A5F5;");
        writeb.setStyle("-fx-background-color: #42A5F5;");
        colorpaletteb.setStyle("-fx-background-color: #42A5F5;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #BBDEFB;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #42A5F5;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #BBDEFB;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #42A5F5;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #BBDEFB;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #42A5F5;");
        }
        });
    }
    public void applygreen(){
        ctop = "-fx-background-color: #66BB6A;";
        cbottom = "-fx-background-color: #C8E6C9;";
        top.setStyle("-fx-background-color: #66BB6A;");
        bottom.setStyle("-fx-background-color: #C8E6C9;");
        saveb.setStyle("-fx-background-color: #66BB6A;");
        writeb.setStyle("-fx-background-color: #66BB6A;");
        colorpaletteb.setStyle("-fx-background-color: #66BB6A;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #C8E6C9;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #66BB6A;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #C8E6C9;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #66BB6A;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #C8E6C9;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #66BB6A;");
        }
        });
    }
    public void applybrown(){
        ctop = "-fx-background-color: #8D6E63;";
        cbottom = "-fx-background-color: #D7CCC8;";
        top.setStyle("-fx-background-color: #8D6E63;");
        bottom.setStyle("-fx-background-color: #D7CCC8;");
        saveb.setStyle("-fx-background-color: #8D6E63;");
        writeb.setStyle("-fx-background-color: #8D6E63;");
        colorpaletteb.setStyle("-fx-background-color: #8D6E63;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #D7CCC8;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #8D6E63;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #D7CCC8;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #8D6E63;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #D7CCC8;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #8D6E63;");
        }
        });
    }
    public void applygrey(){
        ctop = "-fx-background-color: #9E9E9E;";
        cbottom = "-fx-background-color: #EEEEEE;";
        top.setStyle("-fx-background-color: #9E9E9E;");
        bottom.setStyle("-fx-background-color: #EEEEEE;");
        saveb.setStyle("-fx-background-color: #9E9E9E;");
        writeb.setStyle("-fx-background-color: #9E9E9E;");
        colorpaletteb.setStyle("-fx-background-color: #9E9E9E;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #EEEEEE;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #9E9E9E;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #EEEEEE;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #9E9E9E;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #EEEEEE;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #9E9E9E;");
        }
        });
    }
    public void applypink(){
        ctop = "-fx-background-color: #EC407A;";
        cbottom = "-fx-background-color: #F8BBD0;";
        top.setStyle("-fx-background-color: #EC407A;");
        bottom.setStyle("-fx-background-color: #F8BBD0;");
        saveb.setStyle("-fx-background-color: #EC407A;");
        writeb.setStyle("-fx-background-color: #EC407A;");
        colorpaletteb.setStyle("-fx-background-color: #EC407A;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #F8BBD0;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #EC407A;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #F8BBD0;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #EC407A;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #F8BBD0;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #EC407A;");
        }
        });
    }
    public void applyaqua(){
        ctop = "-fx-background-color: #26A69A;";
        cbottom = "-fx-background-color: #B2DFDB;";
        top.setStyle("-fx-background-color: #26A69A;");
        bottom.setStyle("-fx-background-color: #B2DFDB;");
        saveb.setStyle("-fx-background-color: #26A69A;");
        writeb.setStyle("-fx-background-color: #26A69A;");
        colorpaletteb.setStyle("-fx-background-color: #26A69A;");
        hide();
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #B2DFDB;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #26A69A;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #B2DFDB;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #26A69A;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #B2DFDB;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #26A69A;");
        }
        });
    }
    
    public void bluehover(){
        saveb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #BBDEFB;");
        }
        });
        saveb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          saveb.setStyle("-fx-background-color: #42A5F5;");
        }
        });
        writeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #BBDEFB;");
        }
        });
        writeb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          writeb.setStyle("-fx-background-color: #42A5F5;");
        }
        });
        colorpaletteb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #BBDEFB;");
        }
        });
        colorpaletteb.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
          colorpaletteb.setStyle("-fx-background-color: #42A5F5;");
        }
        });
    }
    
    
    public void colorselect(){
        yellowb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #FFEE58;");
          bottom.setStyle("-fx-background-color: #FFF9C4;");
          saveb.setStyle("-fx-background-color: #FFEE58;");
          writeb.setStyle("-fx-background-color: #FFEE58;");
          colorpaletteb.setStyle("-fx-background-color: #FFEE58;");
      }
    });
        yellowb.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        orangeb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #FF7043;");
          bottom.setStyle("-fx-background-color: #FFCCBC;");
          saveb.setStyle("-fx-background-color: #FF7043;");
          writeb.setStyle("-fx-background-color: #FF7043;");
          colorpaletteb.setStyle("-fx-background-color: #FF7043;");
      }
    });
        orangeb.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        violetb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #7E57C2;");
          bottom.setStyle("-fx-background-color: #D1C4E9;");
          saveb.setStyle("-fx-background-color: #7E57C2;");
          writeb.setStyle("-fx-background-color: #7E57C2;");
          colorpaletteb.setStyle("-fx-background-color: #7E57C2;");
      }
    });
        violetb.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        blueb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #42A5F5;");
          bottom.setStyle("-fx-background-color: #BBDEFB;");
          saveb.setStyle("-fx-background-color: #42A5F5;");
          writeb.setStyle("-fx-background-color: #42A5F5;");
          colorpaletteb.setStyle("-fx-background-color: #42A5F5;");
      }
    });
        blueb.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        greenb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #66BB6A;");
          bottom.setStyle("-fx-background-color: #C8E6C9;");
          saveb.setStyle("-fx-background-color: #66BB6A;");
          writeb.setStyle("-fx-background-color: #66BB6A;");
          colorpaletteb.setStyle("-fx-background-color: #66BB6A;");
      }
    });
        greenb.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        brownb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #8D6E63;");
          bottom.setStyle("-fx-background-color: #D7CCC8;");
          saveb.setStyle("-fx-background-color: #8D6E63;");
          writeb.setStyle("-fx-background-color: #8D6E63;");
          colorpaletteb.setStyle("-fx-background-color: #8D6E63;");
      }
    });
        brownb.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        greyb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #9E9E9E;");
          bottom.setStyle("-fx-background-color: #EEEEEE;");
          saveb.setStyle("-fx-background-color: #9E9E9E;");
          writeb.setStyle("-fx-background-color: #9E9E9E;");
          colorpaletteb.setStyle("-fx-background-color: #9E9E9E;");
      }
    });
        greyb.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        pinkb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #EC407A;");
          bottom.setStyle("-fx-background-color: #F8BBD0;");
          saveb.setStyle("-fx-background-color: #EC407A;");
          writeb.setStyle("-fx-background-color: #EC407A;");
          colorpaletteb.setStyle("-fx-background-color: #EC407A;");
      }
    });
        pinkb.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        aquab.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @FXML
      public void handle(MouseEvent e) {
          top.setStyle("-fx-background-color: #26A69A;");
          bottom.setStyle("-fx-background-color: #B2DFDB;");
          saveb.setStyle("-fx-background-color: #26A69A;");
          writeb.setStyle("-fx-background-color: #26A69A;");
          colorpaletteb.setStyle("-fx-background-color: #26A69A;");
      }
    });
        aquab.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        if(ctop == "-fx-background-color: #42A5F5;"){
        bluehover();
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);}
        else{
        top.setStyle(ctop);
        bottom.setStyle(cbottom);
        saveb.setStyle(ctop);
        writeb.setStyle(ctop);
        colorpaletteb.setStyle(ctop);
        }
      }
    });
        
    }
    public void hide(){
        colorpalettepane.setVisible(false);
        colorpalettepane.setDisable(true);
        yellowb.setVisible(false);
        orangeb.setVisible(false);
        violetb.setVisible(false);
        blueb.setVisible(false);
        greenb.setVisible(false);
        brownb.setVisible(false);
        greyb.setVisible(false);
        pinkb.setVisible(false);
        aquab.setVisible(false);
    }
    public int evennumber() {
        Random random = new Random();
        int number = random.nextInt(92)+34;
        while ((number%2)!=0) {
            number = random.nextInt(92)+34;
        }
        return number;
    }
    public int oddnumber() {
        Random random = new Random();
        int number = random.nextInt(92)+34;
        while ((number%2)==0) {
            number = random.nextInt(92)+34;
        }
        return number;
    }
    String ena = "";
    @FXML
    Label message;
    public void save() throws IOException, ClassNotFoundException, SQLException{
        String a;
        a = write.getText();
        if(a.length()==15){
           Stage stage = (Stage) saveb.getScene().getWindow();
           stage.close();
           Stage stag = new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("viewsection.fxml"));
           Scene sc = new Scene(root,400,400);
           stag.setScene(sc);
           stag.initStyle(StageStyle.UTILITY);
           stag.show();
        }
        
        else{
            System.out.println("1");
        Random rand = new Random();
        if(a.trim().length() == 0){
            message.setVisible(true);
            /*new Thread() {
    public void run() {
        FadeTransition fadeTransition = new FadeTransition(Duration.millis(1000000), message);
                fadeTransition.setFromValue(1.0);
                fadeTransition.setToValue(0.0);
                fadeTransition.play();
        Platform.runLater(new Runnable() {
            public void run() {
                
            message.setVisible(false);
            }
        });
    }
}.start();*/
          PauseTransition visiblePause = new PauseTransition(
        Duration.seconds(2)
);
visiblePause.setOnFinished(
        event -> message.setVisible(false)
);
visiblePause.play();

            
        }
        else{
            System.out.println("2");
        a = a.replaceAll(" ", "_");
        a = new StringBuffer(a).reverse().toString();
        for(int i=0;i<a.length();i++){
            char z = a.charAt(i);
            int x = z;
            String y = Integer.toString(x,2);
            for(int j = 0;j<y.length();j++){
            int t = y.charAt(j);
            if(t == 49){
            int ran = evennumber();
            String r = Character.toString((char)ran);
            ena = ena.concat(r);
            }
            else{
            int ran = oddnumber();
            String r = Character.toString((char)ran);
            ena = ena.concat(r);
            }
            }
            }
            if(write()){
                System.out.println("3");
                write.clear();
                savemessage.setVisible(true);
                PauseTransition visiblePause = new PauseTransition(
        Duration.seconds(2)
);
visiblePause.setOnFinished(
        event -> savemessage.setVisible(false)
);
visiblePause.play();
            }
            else{
                System.out.println("4");
                JOptionPane.showMessageDialog(null,"Cannot Save");
            }
            }
        }
    }
    public boolean write() throws ClassNotFoundException, SQLException{
        try{
        SimpleDateFormat date = new SimpleDateFormat ("E dd.MM.yyyy hh:mm:ss a");
        Date d = new Date();
        String filed = date.format(d).toString();
        Class.forName("org.sqlite.JDBC");
        Connection con;
        PreparedStatement stat;
        System.out.println(ena);
        System.out.println(filed);
        ena = ena.replaceAll("'"," ");
        System.out.println(ena);
        con = DriverManager.getConnection("jdbc:sqlite:personaldiary.db");
        String q = "INSERT into content(filename,data) VALUES('"+filed+"','"+ena+"')";
        stat = con.prepareStatement(q);
        int res = stat.executeUpdate();
        if(res!=0){
            ena = "";
            con.close();
            return true;
        }
        else{
            ena = "";
            con.close();
            return false;
        }
        }
        catch(Exception e){
            ena = "";
            System.out.println(e);
            return false;
        }
    }
}
