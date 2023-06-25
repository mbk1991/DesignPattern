package main.java.designpattern.interpreter;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try{
            File file = new File("program.txt");
            BufferedWriter bf = new BufferedWriter(new FileWriter(file));
            if(!file.exists()){
                file.createNewFile();
            }
            bf.write("program end\n");
            bf.write("program go end\n");
            bf.write("program go right go right go right go right end\n");
            bf.write("program repeat 4 go right end end end\n");
            bf.write("program repeat 4 repeat 3 go right go left end right end end\n");
            bf.close();

            BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
            String text;
            while((text = reader.readLine()) != null ){
                System.out.println("text = \""+text+"\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node =  " + node);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
