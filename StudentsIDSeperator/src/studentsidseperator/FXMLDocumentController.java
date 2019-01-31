/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsidseperator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Teacher
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField student_id;
    @FXML
    private TextField year;
    @FXML
    private TextField semester;
    @FXML
    private TextField school;
    @FXML
    private TextField department;
    @FXML
    private TextField program;
    @FXML
    private TextField id;
    @FXML
    private Button button_generate;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickGenerate(ActionEvent event) {
        String inputFromUser = student_id.getText();
        
        // year
        String year = inputFromUser.substring(0, 4);
        this.year.setText(year);
        // semester
        String semester = inputFromUser.substring(4,5);
        if(semester.equals("0")){
            this.semester.setText("Spring");
        }else if(semester.equals("1")){
            this.semester.setText("Summer");
        }else{
            this.semester.setText("Fall");
        }
        
        // School
        String school = inputFromUser.substring(5,6);
        this.school.setText(school);
        // Department
        String department = inputFromUser.substring(6,8);
        this.department.setText(department);
        
        //Program
        String program = inputFromUser.substring(8,10);
        this.program.setText(program);
        
        //id
        String id = inputFromUser.substring(10,13);
        this.id.setText(id);
        
    }
    
}
