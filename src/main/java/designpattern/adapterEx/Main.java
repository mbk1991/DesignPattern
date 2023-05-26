package main.java.designpattern.adapterEx;

import java.io.IOException;

public class Main {


    public static void main(String[] args){

        FileIO fileIO = new FileProperties();

        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year","2023");
            fileIO.setValue("month","3");
            fileIO.setValue("day","6");
            fileIO.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
