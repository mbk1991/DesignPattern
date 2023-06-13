package main.java.javapractice.processbuilder;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args){



        String path = System.getProperty("user.dir");
        String fileName = "test.txt";
        System.out.println(path);
        String command1 = "ipconfig";
        String command2 = " > "+path+"\\"+fileName;
//        String command2 = "dir >> " + path + "\\" + fileName ;
        ProcessBuilder process = new ProcessBuilder(command1,command2);
//        ProcessBuilder process2 = new ProcessBuilder(command2);
        try {
            process.start();
//            process2.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
