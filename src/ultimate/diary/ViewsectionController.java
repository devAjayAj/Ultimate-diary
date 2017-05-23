/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimate.diary;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Ajay
 */
public class ViewsectionController implements Initializable {

    @FXML 
    DatePicker datechose;
    @FXML
    private ObservableList<ObservableList> data;
    @FXML
    TableView table;
    String dat;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void dispdate(){
        LocalDate date = datechose.getValue();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        dat = formatter.format(date);
        System.out.println(dat);
        builddata();
    }public void builddata(){
        data = FXCollections.observableArrayList();
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:sqlite:personaldiary.db");
        ResultSet res = null;
        Statement stat = null;
        stat = conn.createStatement();
        String query = "SELECT filename from content where filename LIKE ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1,"%"+dat+"%");
        res = preparedStatement.executeQuery();
        System.out.println("1" + res.getMetaData());
        table.getColumns().clear();
        for(int i=0 ; i<res.getMetaData().getColumnCount(); i++){
                final int j = i;                
                TableColumn col = new TableColumn(res.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {                                                                                              
                        return new SimpleStringProperty(param.getValue().get(j).toString());                        
                    }                    
                });

                table.getColumns().addAll(col); 
            }
        while(res.next()){
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=res.getMetaData().getColumnCount(); i++){
                    row.add(res.getString(i));
                }
                data.add(row);
                table.setItems(data);
            }
            res.close();
            stat.close();
            conn.close();
        }
        catch(Exception e){
             System.out.println(e);
        }
    }
}
