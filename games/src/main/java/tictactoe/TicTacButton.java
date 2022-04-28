package tictactoe;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.util.Random;


public class TicTacButton extends Application  {
    Random generator = new Random();
    String [][] game = new String [3][3];
    int move=0;






    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        Scene scene = new Scene(grid);
        primaryStage.setTitle("TicTacToe Game");
        primaryStage.setScene(scene);
        primaryStage.show();
        for (int i = 0; i <= game.length - 1; i++) {
            for (int n = 0; n <= i; n++) {
                game[i][n] = "--";
            }
        }
        game[0][0] = "--";
        game[0][1] = "--";
        game[0][2] ="--";
        game[1][0] = "--";
        game[1][1] = "--";
        game[1][2] = "--";
        game[2][0] = "--";
        game[2][1] = "--";
        game[2][2] = "--";
        grid.setMinSize(100, 100);
        grid.setMaxSize(100, 100);
        grid.setPadding(new Insets(10, 10, 10, 10));


        grid.setHgap(10);
        grid.setVgap(10);
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();
        Button button9 = new Button();
        button1.setText(String.valueOf(game[0][0]));
        button2.setText(String.valueOf(game[0][1]));
        button3.setText(String.valueOf(game[0][2]));
        button4.setText(String.valueOf(game[1][0]));
        button5.setText(String.valueOf(game[1][1]));
        button6.setText(String.valueOf(game[1][2]));
        button7.setText(String.valueOf(game[2][0]));
        button8.setText(String.valueOf(game[2][1]));
        button9.setText(String.valueOf(game[2][2]));
        grid.add(button1, 1, 1);
        grid.add(button2, 2, 1);
        grid.add(button3, 3, 1);
        grid.add(button4, 1, 2);
        grid.add(button5, 2, 2);
        grid.add(button6, 3, 2);
        grid.add(button7, 1, 3);
        grid.add(button8, 2, 3);
        grid.add(button9, 3, 3);





        EventHandler button1event = new EventHandler() {
            @Override
            public void handle(Event event) {
            if(game[0][0]=="--"){
                game[0][0]="X";
                button1.setText("X");
                    move++;
                    System.out.println(move);

                if (move!=9){
                    System.out.println(move);
                    int horizontal = generator.nextInt(3)+1;
                    int vertical = generator.nextInt(3)+1;
                    while (game[horizontal-1][vertical-1] != "--") {
                        horizontal = generator.nextInt(3) + 1;
                        vertical = generator.nextInt(3) + 1;
                    }
                    if (game[horizontal-1][vertical-1] == "--") {
                        game[horizontal-1][vertical-1]="O";
                        move++;
                        button1.setText(String.valueOf(game[0][0]));
                        button2.setText(String.valueOf(game[0][1]));
                        button3.setText(String.valueOf(game[0][2]));
                        button4.setText(String.valueOf(game[1][0]));
                        button5.setText(String.valueOf(game[1][1]));
                        button6.setText(String.valueOf(game[1][2]));
                        button7.setText(String.valueOf(game[2][0]));
                        button8.setText(String.valueOf(game[2][1]));
                        button9.setText(String.valueOf(game[2][2]));

                    }}

                }


            }
        };

        EventHandler button2event = new EventHandler() {
            @Override
            public void handle(Event event) {

                if(game[0][1]=="--"){
                    game[0][1]="X";
                    button2.setText("X");
                    move++;
                    System.out.println(move);
                    if (move!=9){
                        System.out.println(move);
                    int horizontal = generator.nextInt(3)+1;
                    int vertical = generator.nextInt(3)+1;
                    while (game[horizontal-1][vertical-1] != "--") {
                        horizontal = generator.nextInt(3) + 1;
                        vertical = generator.nextInt(3) + 1;
                    }
                    if (game[horizontal-1][vertical-1] == "--") {
                        game[horizontal-1][vertical-1]="O";
                        move++;
                        button1.setText(String.valueOf(game[0][0]));
                        button2.setText(String.valueOf(game[0][1]));
                        button3.setText(String.valueOf(game[0][2]));
                        button4.setText(String.valueOf(game[1][0]));
                        button5.setText(String.valueOf(game[1][1]));
                        button6.setText(String.valueOf(game[1][2]));
                        button7.setText(String.valueOf(game[2][0]));
                        button8.setText(String.valueOf(game[2][1]));
                        button9.setText(String.valueOf(game[2][2]));
                    }}
                }
            }
            };
        EventHandler button3event = new EventHandler() {
            @Override
            public void handle(Event event) {
                if(game[0][2]=="--"){
                    game[0][2]="X";
                    button3.setText("X");
                    move++;
                    System.out.println(move);
                    if (move!=9){
                        System.out.println(move);
                    int horizontal = generator.nextInt(3)+1;
                    int vertical = generator.nextInt(3)+1;
                    while (game[horizontal-1][vertical-1] != "--") {
                        horizontal = generator.nextInt(3) + 1;
                        vertical = generator.nextInt(3) + 1;
                    }
                    if (game[horizontal-1][vertical-1] == "--") {
                        game[horizontal-1][vertical-1]="O";
                        move++;
                        button1.setText(String.valueOf(game[0][0]));
                        button2.setText(String.valueOf(game[0][1]));
                        button3.setText(String.valueOf(game[0][2]));
                        button4.setText(String.valueOf(game[1][0]));
                        button5.setText(String.valueOf(game[1][1]));
                        button6.setText(String.valueOf(game[1][2]));
                        button7.setText(String.valueOf(game[2][0]));
                        button8.setText(String.valueOf(game[2][1]));
                        button9.setText(String.valueOf(game[2][2]));
                    }}
                }
            }
        };
        EventHandler button4event= new EventHandler() {
            @Override
            public void handle(Event event) {

                if(game[1][0]=="--"){
                    game[1][0]="X";
                    button4.setText("X");
                    move++;
                    System.out.println(move);
                    if(move!=9){
                        System.out.println(move);
                    int horizontal = generator.nextInt(3)+1;
                    int vertical = generator.nextInt(3)+1;
                    while (game[horizontal-1][vertical-1] != "--") {
                        horizontal = generator.nextInt(3) + 1;
                        vertical = generator.nextInt(3) + 1;
                    }
                    if (game[horizontal-1][vertical-1] == "--") {
                        game[horizontal-1][vertical-1]="O";}
                        move++;
                        button1.setText(String.valueOf(game[0][0]));
                        button2.setText(String.valueOf(game[0][1]));
                        button3.setText(String.valueOf(game[0][2]));
                        button4.setText(String.valueOf(game[1][0]));
                        button5.setText(String.valueOf(game[1][1]));
                        button6.setText(String.valueOf(game[1][2]));
                        button7.setText(String.valueOf(game[2][0]));
                        button8.setText(String.valueOf(game[2][1]));
                        button9.setText(String.valueOf(game[2][2]));
                    }
                }}
            };

        EventHandler button5event = new EventHandler() {
            @Override
            public void handle(Event event) {


                if (game[1][1] == "--") {
                    game[1][1] = "X";
                    button5.setText("X");
                    move++;
                    System.out.println(move);
                    if (move!=9){
                        System.out.println(move);
                    int horizontal = generator.nextInt(3) + 1;
                    int vertical = generator.nextInt(3) + 1;
                    while (game[horizontal - 1][vertical - 1] != "--") {
                        horizontal = generator.nextInt(3) + 1;
                        vertical = generator.nextInt(3) + 1;
                    }
                    if (game[horizontal - 1][vertical - 1] == "--") {
                        game[horizontal - 1][vertical - 1] = "O";
                        move++;
                        button1.setText(String.valueOf(game[0][0]));
                        button2.setText(String.valueOf(game[0][1]));
                        button3.setText(String.valueOf(game[0][2]));
                        button4.setText(String.valueOf(game[1][0]));
                        button5.setText(String.valueOf(game[1][1]));
                        button6.setText(String.valueOf(game[1][2]));
                        button7.setText(String.valueOf(game[2][0]));
                        button8.setText(String.valueOf(game[2][1]));
                        button9.setText(String.valueOf(game[2][2]));
                    }
                }}
            }
        };
        EventHandler button6event =new EventHandler() {
                @Override
                public void handle(Event event) {
                    if (game[1][2] == "--") {
                        game[1][2] = "X";
                        button6.setText("X");
                        move++;
                        if (move!=9){
                        int horizontal = generator.nextInt(3) + 1;
                        int vertical = generator.nextInt(3) + 1;
                        while (game[horizontal - 1][vertical - 1] != "--") {
                            horizontal = generator.nextInt(3) + 1;
                            vertical = generator.nextInt(3) + 1;
                        }
                        if (game[horizontal - 1][vertical - 1] == "--") {
                            game[horizontal - 1][vertical - 1] = "O";
                            move++;
                            button1.setText(String.valueOf(game[0][0]));
                            button2.setText(String.valueOf(game[0][1]));
                            button3.setText(String.valueOf(game[0][2]));
                            button4.setText(String.valueOf(game[1][0]));
                            button5.setText(String.valueOf(game[1][1]));
                            button6.setText(String.valueOf(game[1][2]));
                            button7.setText(String.valueOf(game[2][0]));
                            button8.setText(String.valueOf(game[2][1]));
                            button9.setText(String.valueOf(game[2][2]));
                        }}
                    }
                }
            };
        EventHandler button7event = new EventHandler() {
            @Override
            public void handle(Event event) {
                if (game[2][0] == "--") {
                    game[2][0] = "X";
                    button7.setText("X");
                    move++;
                    if (move!=9){
                    int horizontal = generator.nextInt(3) + 1;
                    int vertical = generator.nextInt(3) + 1;
                    while (game[horizontal - 1][vertical - 1] != "--") {
                        horizontal = generator.nextInt(3) + 1;
                        vertical = generator.nextInt(3) + 1;
                    }
                    if (game[horizontal - 1][vertical - 1] == "--") {
                        game[horizontal - 1][vertical - 1] = "O";
                        move++;
                        button1.setText(String.valueOf(game[0][0]));
                        button2.setText(String.valueOf(game[0][1]));
                        button3.setText(String.valueOf(game[0][2]));
                        button4.setText(String.valueOf(game[1][0]));
                        button5.setText(String.valueOf(game[1][1]));
                        button6.setText(String.valueOf(game[1][2]));
                        button7.setText(String.valueOf(game[2][0]));
                        button8.setText(String.valueOf(game[2][1]));
                        button9.setText(String.valueOf(game[2][2]));
                    }}
                }
            }
        };
        EventHandler button8event = new EventHandler() {
            @Override
            public void handle(Event event) {
                if (game[2][1] == "--") {
                    game[2][1] = "X";
                    button8.setText("X");
                    move++;
                    if (move!=9){
                    int horizontal = generator.nextInt(3) + 1;
                    int vertical = generator.nextInt(3) + 1;
                    while (game[horizontal - 1][vertical - 1] != "--") {
                        horizontal = generator.nextInt(3) + 1;
                        vertical = generator.nextInt(3) + 1;
                    }
                    if (game[horizontal - 1][vertical - 1] == "--") {
                        game[horizontal - 1][vertical - 1] = "O";
                        move++;
                        button1.setText(String.valueOf(game[0][0]));
                        button2.setText(String.valueOf(game[0][1]));
                        button3.setText(String.valueOf(game[0][2]));
                        button4.setText(String.valueOf(game[1][0]));
                        button5.setText(String.valueOf(game[1][1]));
                        button6.setText(String.valueOf(game[1][2]));
                        button7.setText(String.valueOf(game[2][0]));
                        button8.setText(String.valueOf(game[2][1]));
                        button9.setText(String.valueOf(game[2][2]));
                    }}
                }
            }
        };
        EventHandler button9event = new EventHandler() {
            @Override
            public void handle(Event event) {
                if (game[2][2] == "--") {
                    game[2][2] = "X";
                    move++;
                    button9.setText("X");
                    if (move!=9){
                    int horizontal = generator.nextInt(3) + 1;
                    int vertical = generator.nextInt(3) + 1;
                    while (game[horizontal - 1][vertical - 1] != "--") {
                        horizontal = generator.nextInt(3) + 1;
                        vertical = generator.nextInt(3) + 1;
                    }
                    if (game[horizontal - 1][vertical - 1] == "--") {
                        game[horizontal - 1][vertical - 1] = "O";
                        move++;
                        button1.setText(String.valueOf(game[0][0]));
                        button2.setText(String.valueOf(game[0][1]));
                        button3.setText(String.valueOf(game[0][2]));
                        button4.setText(String.valueOf(game[1][0]));
                        button5.setText(String.valueOf(game[1][1]));
                        button6.setText(String.valueOf(game[1][2]));
                        button7.setText(String.valueOf(game[2][0]));
                        button8.setText(String.valueOf(game[2][1]));
                        button9.setText(String.valueOf(game[2][2]));
                    }}
                }
            }};



        button1.setOnMouseClicked(button1event);
        button2.setOnMouseClicked(button2event);
        button3.setOnMouseClicked(button3event);
        button4.setOnMouseClicked(button4event);
        button5.setOnMouseClicked(button5event);
        button6.setOnMouseClicked(button6event);
        button7.setOnMouseClicked(button7event);
        button8.setOnMouseClicked(button8event);
        button9.setOnMouseClicked(button9event);



    }
    public static void main(String[] args) {
        launch(args);

    }
}


