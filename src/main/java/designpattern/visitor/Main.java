package main.java.designpattern.visitor;

import main.java.designpattern.composite.FileTreatmentException;

public class Main {
    public static void main(String[] args){
        try{
            System.out.println("루트 엔트리 생성중...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(usrDir);
            rootDir.add(tmpDir);
            binDir.add(new File("vi",10000));
            binDir.add(new File("latex", 20000));
            rootDir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("유저 엔트리 생성중...");
            Directory kim = new Directory("kim");
            Directory lee = new Directory("lee");
            Directory kwon = new Directory("kwon");
            usrDir.add(kim);
            usrDir.add(lee);
            usrDir.add(kwon);
            kim.add(new File("diary.html",100));
            kim.add(new File("composite.java", 200));
            lee.add(new File("memo.txt",400));
            kwon.add(new File("game.exe",1000));
            rootDir.accept(new ListVisitor());

        }catch(FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
