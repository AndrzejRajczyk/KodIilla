package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        }
            else{
                System.out.println("Error!");
        }

       Calculator calculator = new Calculator(2,5);


       if(calculator.calculatorAdd()==7){
        System.out.print("CalculatorAdd OK \n");
       }
        else{
            System.out.println("CalculatorAdd Error! \n");
        }

        if(calculator.calculatorSubstract()==-3){
            System.out.print("CalculatorSubstract OK\n ");
        }
        else{
            System.out.println("CalculatorSubstract Error! \n ");
        }
    }
}
