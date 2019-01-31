package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Controller {

    public TextArea info;
    @FXML
    private Pane mainPage;
    @FXML
    private TextField nameText;
    @FXML
    private Text name;
    @FXML
    private TextField idText;
    @FXML
    private TextField batchText;
    @FXML
    private Text id;
    @FXML
    private Text batch;
    @FXML
    private Text name1;
    @FXML
    private Button saveButton;
    public void action(javafx.event.ActionEvent event){

        if (event.getSource() == saveButton){

            String idInput = idText.getText();

            String nameText = idInput.substring(0,5);
            this.nameText.setText(nameText);

            String batchText = idInput.substring(0,1);
            this.batchText.setText(batchText);
        }
    }
}
/*
            info.setText("Name: " + nameText.getText() + "\nID: " + idText.getText() + "\nBatch: " + batchText.getText());
                    String idInfo = idText.getText();
                    */