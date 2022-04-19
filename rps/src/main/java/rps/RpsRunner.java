package rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    int aiMovie=0;
    int userMove=0;
    int round=0;
    int userScore=0;
    int aiscore=0;
    int gameNo=0;
    boolean End;

    String userName;
    Random generator = new Random();
    String string1 = "You choose stone";
    String string11 = "Ai choose sotone";
    String string2 = "You choose paper";
    String string22 = "Ai choose paper";
    String string3 = "You coose scizors";
    String String33 = "Ai choose scizors";
    String user;
    String ai;
    String playerdecide="a";

    public RpsRunner(int round, String userName) {
        this.round = round;
        this.userName = userName;
    }

    void main (String[] args){



        if (userMove ==1){
             user = string1;
        }
        if (userMove ==2){
            user =string2;
        }
        if (userMove==3){
            user=string3;
        }



        while(!=End){
            Scanner scanner = new Scanner(System.in);
        while(userName==null) {
            // Wczytywanie danych

            System.out.println("What is your name?:");
            userName = scanner.nextLine();
            userScore=0;
            aiscore=0;
            gameNo=0;
            System.out.println("Hello" + userName + "/n" + "how many round would you like choose from 0 to 100?");
            round = scanner.nextInt();
            if (round < 1 || round > 100) {
                System.out.println("No more then 100, no less then 0...., try another...");
                round = scanner.nextInt();
            }
        }



        /////Początek pętli
        gameNo++;
        System.out.println("x - stone"+"/n"+"2 - paper"+"/n"+ "3 - scisors");
        System.out.println("Your move");
        userMove =  scanner.nextInt();
        aiMovie=generator.nextInt(2);


        // zabezpieczenie dla właściwego wyboru
        while(userMove != 1  || userMove!= 2  || userMove!=3){
            System.out.println("Dont chat, choose well");
            System.out.println("Your move");
             userMove =  scanner.nextInt();
        }

        System.out.println(ai);
       // wyznaczanie zwycięzcy

        if (userMove == aiMovie){
            System.out.println("Remis no point");
        }
        if (userMove==aiMovie+1){
            System.out.println("Tou win. Your score:"+userScore + "my score:" + aiscore);
            userScore++;
        }
        if(aiMovie==userMove+1){
            aiscore++;
            System.out.println("I Win m score is now:" + aiscore+ "Your score:" +userScore);
        }

        if (gameNo==round){
            System.out.println("Ai Score" + aiscore );
        System.out.println(userName + userScore);
            System.out.println("Press n for New Game, or x for exit");
        playerdecide= scanner.next();

        if(playerdecide == "x"){
        System.out.println("Are you sure? press x for exit, other key for play ");
            playerdecide= scanner.next();
            for(playerdecide=="x"|| playerdecide="n"){

            if(playerdecide=="x"){
                System.out.println("Closing Game");
            }
            if(playerdecide=="n"){
                System.out.println("New Game")
            }

            }
        }
        }

        }

    }

}
