package tictactoe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;



public class TicTacToe extends Application {


    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        Scene scene = new Scene(grid);
        primaryStage.setTitle("TicTacToe Game");
        primaryStage.setScene(scene);
        primaryStage.show();
        StackPane root = new StackPane();

        //Pola tekstowe do wyświetlania
        TextField textField1 = new TextField();
        TextField textFiled2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        Button button2 = new Button();
          grid.setMinSize(100, 100);
          grid.setMaxSize(100,100);
          grid.setPadding(new Insets(10,10,10,10));

        /* grid.add(textField1,0,0);
          grid.add(textFiled2,1,0);
          grid.add(textField3,2,0);
          grid.add(textField4,3,3);
          grid.add(textField5,4,3);
          grid.add(textField6,5,3);
          grid.add(button2,1,1);
          */




          Circle circle1 = new Circle(0,0,50);
          Circle circle2 = new Circle(0,0,40);
          circle2.setFill(Color.BEIGE);
          Shape shape = Shape.subtract(circle1,circle2);
         // circle1.setStroke(Color.LIGHTBLUE); //kontur
         // circle1.setStrokeWidth(23);

         grid.add(shape,6,4);
         // grid.add(circle2, 6,4);

        //linia i krzyżyk

        Line line1 = new Line(0,0,100,100);
        Line line2 = new Line(100, 0,0,100);
        Polyline xline = new Polyline(0,100,100,00);

        grid.add(line1,2,2);
        grid.add(line2,2,2);
        grid.add(xline,3,2);


        //      prostokąt

        Rectangle rectangle1 = new Rectangle(0,0,100,100);
        Rectangle rectangle2 = new Rectangle(0,0,100,100);
        Rectangle rectangle3 = new Rectangle(0,0,100,100);
        rectangle1.setFill(Color.LIGHTBLUE);
        rectangle2.setFill(Color.LIGHTBLUE);
        rectangle3.setFill(Color.LIGHTBLUE);

        grid.add(rectangle2,2,4);
        grid.add(rectangle3,3,4);

        grid.setGridLinesVisible(true);
        grid.setHgap(10);
        grid.setVgap(10);


        EventHandler eventHandlertriangle = new EventHandler() {
            @Override
            public void handle(Event event) {
                Line line1= new Line(0,0,100,100);
                Line line2 = new Line(100, 0,0,100);
                grid.add(line1,1,5);
                grid.add(line2,1,5);
                grid.getChildren().remove(rectangle1);
System.out.println("Rectangle test");


            }
        };


        Button button1 = new Button();
        button1.setText("1");
        EventHandler eventHandlerButton1 = new EventHandler() {
            @Override
            public void handle(Event event) {
               button1.setText("x");
                Circle circle3 = new Circle(50,50,20);
                circle3.setFill(Color.RED);
                grid.add(circle3,6,5);

            }
        };
        button1.setOnAction(eventHandlerButton1);
        rectangle1.setOnMouseClicked(eventHandlertriangle);
        grid.add(button1,1,3);
        root.getChildren().add(button1);
        grid.add(button1,6,4);
        root.getChildren().add(rectangle1);
        grid.add(rectangle1,1,5);



    }
    public static void main(String[] args) {
        launch(args);
    }
}
