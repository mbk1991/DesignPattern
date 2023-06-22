package main.java.designpattern.facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {
    private Database(){}
    public static Properties getProperties(String dbname){
       String fileName = dbname + ".txt";
       File file = new File(fileName);
       if(!file.exists()){
           System.out.println("파일이 존재하지 않습니다. 새롭게 생성합니다.");
           try {
               file.createNewFile();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }else{
           //System.out.println("파일이 존재합니다.");
           //System.out.println("경로 : " + file.getAbsolutePath());
       }
       Properties prop = new Properties();
       try{
           prop.load(new FileInputStream(file));
       }catch(IOException e){
           System.out.println("Warning: " + fileName + "is not found.");
       }
       return prop;
    }
}
