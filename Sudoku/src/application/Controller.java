package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/* Controller needs to implement Initializable as JavaFX relies on the class having
 * an "initialize" method. It is going to execute the "initialize" method only AFTER the layout
 * file has been loaded.
 */
public class Controller implements Initializable {

    @FXML // The FXML loader is going to inject from the layout
            Button button_one; // remember our fx:id's for our buttons? name should be the same in order for the FXMLLoader to find it.
    @FXML
    Button button_two;
    @FXML
    Button button_three;
    @FXML
    Button button_four;
    @FXML
    Button button_five;
    @FXML
    Button button_six;
    @FXML
    Button button_seven;
    @FXML
    Button button_eight;
    @FXML
    Button button_nine;
    @FXML
    Canvas canvas;

    // Make a new GameBoard declaration
    GameBoard gameboard;
    int player_selected_row;
    int player_selected_col;

    public Controller() {
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        this.gameboard = new GameBoard();
        GraphicsContext context = this.canvas.getGraphicsContext2D();
        this.drawOnCanvas(context);
        this.player_selected_row = 0;
        this.player_selected_col = 0;
    }

    public void drawOnCanvas(GraphicsContext context) {
        context.clearRect(0.0D, 0.0D, 450.0D, 450.0D);

        int row;
        int row;
        int col;
        for (int row = 0; row < 9; ++row) {
            for (row = 0; row < 9; ++row) {
                row = row * 50 + 2;
                col = row * 50 + 2;
                int width = 46;
                context.setFill(Color.WHITE);
                context.fillRoundRect((double) col, (double) row, (double) width, (double) width, 10.0D, 10.0D);
            }
        }
    }
            context.setStroke(Color.RED);
        context.setLineWidth(5.0D);
        context.strokeRoundRect((double)(this.player_selected_col * 50 + 2), (double)(this.player_selected_row * 50 + 2), 46.0D, 46.0D, 10.0D, 10.0D);
    int[][] initial = this.gameboard.getInitial();

    int position_y;
        for(row = 0; row < 9; ++row) {
        for(row = 0; row < 9; ++row) {
            col = row * 50 + 30;
            position_y = row * 50 + 20;
            context.setFill(Color.BLACK);
            context.setFont(new Font(20.0D));
            if (initial[row][row] != 0) {
                context.fillText(String.valueOf(initial[row][row]), (double)position_y, (double)col);
            }
        }
    }

    int[][] player = this.gameboard.getPlayer();

        for(row = 0; row < 9; ++row) {
        for(col = 0; col < 9; ++col) {
            position_y = row * 50 + 30;
            int position_x = col * 50 + 20;
            context.setFill(Color.PURPLE);
            context.setFont(new Font(22.0D));
            if (player[row][col] != 0) {
                context.fillText(String.valueOf(player[row][col]), (double)position_x, (double)position_y);
            }
        }
    }

        if (this.gameboard.checkForSuccessGeneral()) {
        context.clearRect(0.0D, 0.0D, 450.0D, 450.0D);
        context.setFill(Color.GREEN);
        context.setFont(new Font(36.0D));
        context.fillText("SUCCESS!", 150.0D, 250.0D);
    }

}

    public void canvasMouseClicked() {
        this.canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                int mouse_x = (int)event.getX();
                int mouse_y = (int)event.getY();
                Controller.this.player_selected_row = mouse_y / 50;
                Controller.this.player_selected_col = mouse_x / 50;
                Controller.this.drawOnCanvas(Controller.this.canvas.getGraphicsContext2D());
            }
        });
    }

    public void buttonOnePressed() {
        this.gameboard.modifyPlayer(1, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }

    public void buttonTwoPressed() {
        this.gameboard.modifyPlayer(2, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }

    public void buttonThreePressed() {
        this.gameboard.modifyPlayer(3, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }

    public void buttonFourPressed() {
        this.gameboard.modifyPlayer(4, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }

    public void buttonFivePressed() {
        this.gameboard.modifyPlayer(5, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }

    public void buttonSixPressed() {
        this.gameboard.modifyPlayer(6, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }

    public void buttonSevenPressed() {
        this.gameboard.modifyPlayer(7, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }

    public void buttonEightPressed() {
        this.gameboard.modifyPlayer(8, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }

    public void buttonNinePressed() {
        this.gameboard.modifyPlayer(9, this.player_selected_row, this.player_selected_col);
        this.drawOnCanvas(this.canvas.getGraphicsContext2D());
    }
