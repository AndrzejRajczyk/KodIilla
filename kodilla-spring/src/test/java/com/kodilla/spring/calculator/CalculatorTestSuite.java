package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
          double   resultadd =   calculator.add(1,2);
        double resultsub = calculator.sub(2,1);
        double resultmul = calculator.mul(2,2);
        double resultdiv = calculator.div(3,1);

        Assertions.assertEquals(3, resultadd);
                Assertions.assertEquals(1, resultsub);
                Assertions.assertEquals(4, resultmul);
                Assertions.assertEquals(3, resultdiv);

    }
}
