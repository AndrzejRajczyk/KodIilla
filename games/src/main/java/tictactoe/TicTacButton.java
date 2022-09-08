//package tictactoe;
//
//import javafx.application.Application;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.event.Event;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
//import javafx.scene.input.MouseButton;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.*;
//import javafx.scene.transform.Scale;
//import javafx.stage.Popup;
//import javafx.stage.Stage;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//import java.util.stream.Collectors;
//
//
//public class TicTacButton extends Application  {
//    Random generator = new Random();
//    GridPane grid = new GridPane();
//    Label label = new Label();
//    int move=0;
//    boolean playerVsComputer=true;
//    String player="X";
//
//
//void computerMove(){
//    if(playerVsComputer==true && move!=10){
//    System.out.println(grid.getChildren());
//    List<Button> buttons = grid.getChildren().stream()
//            .filter(node -> node instanceof Button)
//            .map(node -> (Button) node)
//            .filter(button -> button.getText().equals("--"))
//            .collect(Collectors.toList());
//    int index = generator.nextInt(buttons.size());
//        if (move%2==0) {
//            player = "O";
//        }
//
//        if(move%2!=0){
//            player="X";
//        }
//    buttons.get(index).setText(player);
//        move++;
//
//    }
//
//
//}
//void player1win() {
//    String s="";
//    List<Button> buttons = grid.getChildren().stream()
//            .filter(node -> node instanceof Button)
//            .map(node -> (Button) node)
//            .filter(button -> button.getText().equals("X"))
//            .collect(Collectors.toList());
//
//    Map<Integer, Integer> xxx = new HashMap<>();
//    Map <Integer, Integer> yyy = new HashMap<>();
//
//    for (int i = 0; i < buttons.size(); i++) {
//
//        int x = GridPane.getRowIndex(buttons.get(i));
//        int y = GridPane.getColumnIndex(buttons.get(i));
//        s = s + x + y;
//
//   /*for (int i = 0; i < buttons.size(); i++) {
//        int x = GridPane.getRowIndex(buttons.get(i));
//        int y = GridPane.getColumnIndex(buttons.get(i));
//        System.out.println("x "+ x + "y " + y);
//        s =s+x+y;
//        if (xxx.containsKey(x)){
//            int value = xxx.get(x);
//            value++;
//            xxx.put(x,value);
//
//        }
//        else{
//            xxx.put(x,1);
//        }*/
//        if (s.equals("000102") || s.equals("101112") || s.equals("202122")) {
//            System.out.println("You Win");
//            label.setText("The Winner is: X");
//            move=10;
//
//        }
//        if (s.equals("001020") || s.equals("011121") || s.equals("021222")) {
//            System.out.println("You Win");
//            label.setText("The Winner is: X");
//            move=10;
//        }
//        if (s.equals("001122") || s.equals("201102")) {
//            System.out.println("You Win");
//            label.setText("The Winner is: X");
//            move=10;
//        }
//    }
//
//
//
//    }
//
//
//void player2win() {
//        String s="";
//
//        List<Button> buttons = grid.getChildren().stream()
//                .filter(node -> node instanceof Button)
//                .map(node -> (Button) node)
//                .filter(button -> button.getText().equals("O"))
//                .collect(Collectors.toList());
//        for (int i = 0; i < buttons.size(); i++) {
//            int x = GridPane.getRowIndex(buttons.get(i));
//            int y = GridPane.getColumnIndex(buttons.get(i));
//            s =s+x+y;
//            if(s.equals("000102")|| s.equals("101112")|| s.equals("202122")){
//                System.out.println("You Win");
//                label.setText("The Winner is: O ");
//                move=10;
//            }
//            if(s.equals("001020")||s.equals("011121")||s.equals("021222")){
//                System.out.println("You Win");
//                label.setText("The Winner is: O");
//                move=10;
//            }
//            if(s.equals("001122")||s.equals("201102")){
//                System.out.println("You Win");
//                label.setText("The Winner is: O");
//                move=10;
//            }
//
//
//
//        }
//
//    }
//    void reset(){
//        move=0;
//        player="X";
//        label.setText("The Winner is: ");
//        boolean playerVsComputer=true;
//        List<Button> buttons = grid.getChildren().stream()
//                .filter(node -> node instanceof Button)
//                .map(node -> (Button) node)
//                .filter(node -> node.getText().equals("X") || node.getText().equals("O") ||
//                        node.getText().equals("--"))
//                .collect(Collectors.toList());
//
//        for(int i=0; i<=buttons.size()-1; i++){
//            buttons.get(i).setText("--");
//        }
//
//    }
//
//
//
//    @Override
//    public void start(Stage primaryStage) {
//
//
//        Scene scene = new Scene(grid, 1200, 1000);
//        primaryStage.setTitle("TicTacToe Game");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        primaryStage.setResizable(false);
//        Scale scale = new Scale(3, 3);
//        scale.setPivotX(0);
//        scale.setPivotY(0);
//        scene.getRoot().getTransforms().setAll(scale);
//        label.setText("The Winner is");
//
//       //game
//        for (int i = 0; i <= 2; i++) {
//            for (int n = 0; n <= 2; n++) {
//                Button button = new Button();
//                button.setText("--");
//                button.setOnMouseClicked(event -> {
//                    System.out.println("Buttonclicked" );
//
//                    //X or Y depends or player
//                    if (move%2==0) {
//                        player = "O";
//                    }
//
//                    if(move%2!=0){
//                        player="X";
//                    }
//                            if(button.getText().equals("--")&&move<=9){
//                                move++;
//                                System.out.println(move);
//                                button.setText(player);
//                                player1win();
//                                player2win();
//                                computerMove();
//                                player1win();
//                                player2win();
//
//                            }
//                });
//                grid.add(button, i, n);
//            }
//        }
//
//        grid.setMinSize(50, 50);
//        grid.setMaxSize(200, 200);
//        grid.setPadding(new Insets(10, 10, 10, 10));
//        grid.setHgap(10);
//        grid.setVgap(10);
//        Button buttonOnePlayer = new Button();
//        Button buttonTwoPlayer = new Button();
//        Button buttonReset = new Button();
//        buttonOnePlayer.setText("Player vs Computer");
//        buttonOnePlayer.setTextFill(Color.RED);
//        buttonTwoPlayer.setText("Player vs Player");
//        buttonReset.setText("Reset Game");
//        grid.add(buttonOnePlayer,4,0);
//        grid.add(buttonTwoPlayer,5,0);
//        grid.add(buttonReset, 4, 3);
//        grid.add(label, 4,2);
//
//
//
//EventHandler buttonOnePlayerevent = new EventHandler() {
//    @Override
//    public void handle(Event event) {
//        buttonOnePlayer.setTextFill(Color.RED);
//        buttonTwoPlayer.setTextFill(Color.BLACK);
//        playerVsComputer=true;
//
//    }
//};
//EventHandler buttonTwoPlayerevent = new EventHandler() {
//    @Override
//    public void handle(Event event) {
//        buttonTwoPlayer.setTextFill(Color.RED);
//        buttonOnePlayer.setTextFill(Color.BLACK);
//        playerVsComputer=false;
//    }
//};
//EventHandler resetEvent = new EventHandler() {
//    @Override
//    public void handle(Event event) {
//        reset();
//
//    }
//};
//
//
//        buttonOnePlayer.setOnMouseClicked(buttonOnePlayerevent);
//        buttonTwoPlayer.setOnMouseClicked(buttonTwoPlayerevent);
//        buttonReset.setOnMouseClicked(resetEvent);
//
//    }
//    public static void main(String[] args) {
//        launch(args);
//
//    }
//}
//
//
