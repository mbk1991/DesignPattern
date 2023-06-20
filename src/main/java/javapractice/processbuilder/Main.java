package main.java.javapractice.processbuilder;

import jdk.internal.util.xml.impl.ReaderUTF8;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder procBuilder;
        Process process;
        BufferedReader cmdReader;
        BufferedWriter logWriter;

        String path = System.getProperty("user.dir");
        String fileName = "day.log";
        String saveFile = path+"\\"+fileName;
        System.out.println(saveFile);
        File file = new File(saveFile);
        if(!file.exists()){
            try {
                file.createNewFile();
                Writer writer = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] cmdArr = {"ipconfig"};
        List<String> cmdList = new ArrayList<>(Arrays.asList(cmdArr));

        procBuilder = new ProcessBuilder(cmdList);

        try {
            process = procBuilder.start();
            InputStream is = process.getInputStream();
            cmdReader = new BufferedReader( new InputStreamReader(is) );
            String str;
            while((str = cmdReader.readLine()) != null){
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
