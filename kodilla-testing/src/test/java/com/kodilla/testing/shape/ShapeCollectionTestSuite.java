package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test ....")

public class ShapeCollectionTestSuite {
    private static int testCounter=0;

    @BeforeAll
    public static void beforeAllTest (){
        System.out.println("All Shape Test begin....");
    }
    @AfterAll
    public static void afterAllTest(){
        System.out.println("All Shape's test ended....");
    }
    @BeforeEach
    public void beforeEachTest(){
        testCounter  ++;
        System.out.println("Begining test no: " + testCounter);
    }
    @AfterEach

    public void afterEachTest(){
      System.out.println("End of test no :"+ testCounter);
    }
    @Nested
    @DisplayName("Tests for changing List")
    class ChangingList {
        @Test
        void testAddFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new  Triangle( "Figure1",1);
            shapeCollector.addFigure(shape);
           //When
            shapeCollector.getFigure(0);
            // Then
            Assertions.assertEquals(shape, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            ShapeCollector expected = new ShapeCollector();
            Shape shape = new Triangle("Figure 1", 1);
            shapeCollector.addFigure(shape);

            //When
            shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertNotEquals(shape, shapeCollector.getFigure(0));
        }

    }
    @DisplayName("Tests for operations Shape")
    class OperationsShape {
        @Test
        void testGetFigure(){
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Figure 1", 1);
            shapeCollector.addFigure(shape);
             //When
            Shape resolt=shapeCollector.getFigure(0);
            //Then

            Assertions.assertNotNull(resolt);
            Assertions.assertEquals("Figure1", resolt.getName());
        }
        @Test
        void testGetFigureBelow(){
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Figure 1", 1);
            shapeCollector.addFigure(shape);
            //When
            Shape resolt=  shapeCollector.getFigure(-1);
            //Then
            Assertions.assertNotEquals(shape, resolt.getName());
        }
        @Test

            void testGetFigureUpOn(){
                //given
                ShapeCollector shapeCollector = new ShapeCollector();
                Shape shape = new Triangle("Figure 1", 1);
                shapeCollector.addFigure(shape);
                //When
                Shape resolt= shapeCollector.getFigure(10);
                //Then
                Assertions.assertNotEquals(shape, resolt.getName());

        }


    }
    @Test
    void testShowFigures (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape =new Triangle("Figure 1", 1);
        shapeCollector.addFigure(shape);
        //When
        shapeCollector.showFigures();

        //Then
        Assertions.assertFalse(shape.toString()==shapeCollector.showFigures());


    }
}