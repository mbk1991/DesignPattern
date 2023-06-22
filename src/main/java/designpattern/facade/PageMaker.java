package main.java.designpattern.facade;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker(){}
    public static void makeWelcomePage(String mailAddr, String fileName){
        try{
            Properties mailProp = Database.getProperties(fileName);
            String userName = mailProp.getProperty(mailAddr);

            fileName = fileName + ".html";
            File file = new File(fileName);

            if(!file.exists()){
                file.createNewFile();
            }
            HtmlWriter writer = new HtmlWriter(new FileWriter(file));
            writer.title("Welcome to " + userName + " 's Page!");
            writer.paragraph(userName + " 의 페이지입니다.");
            writer.mailTo(mailAddr, userName);
            writer.close();
            System.out.println("html파일이 생성되었습니다.");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
