package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

import java.io.File;
import java.nio.file.Path;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile("fileName");
           // fileReader().readFile;
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}