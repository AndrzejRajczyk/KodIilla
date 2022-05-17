package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
     public void testGetBooks(){
        //Given
        Library library = new Library("Library for test");
        library.getBooks().add(new Book("JS od podstaw", "M Moskala", LocalDate.of(2020,1,13)));
        library.getBooks().add(new Book("J Duckett", "HTML I CSS", LocalDate.of(2011, 12, 17)));
        Library shCopy = null;
        try{
            shCopy=library.shallowCopy();
            shCopy.setName("Shallow test Library");

        }
        catch(CloneNotSupportedException e){
            System.out.println("shallow copy" + e);
        }
        Library deepCopy = null;
        try{
            deepCopy=library.deepCopy();
            deepCopy.setName("deep test Library");

        }
        catch(CloneNotSupportedException e){
            System.out.println("deep copy" + e);
        }

        //When
        library.getBooks().add(new Book("Kubuś Puchatek", "A Milne", LocalDate.of(2022,01,01)));
        //Then
        System.out.println(library);
        System.out.println(shCopy);
        System.out.println(deepCopy);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, shCopy.getBooks().size());
        Assert.assertEquals(2, deepCopy.getBooks().size());





    }
}
