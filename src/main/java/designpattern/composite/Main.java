package main.java.designpattern.composite;

public class Main {
    public static void main(String[] args){
        try {

            System.out.println("루트 엔트리 생성중...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.printList();

            System.out.println("");
            System.out.println("유저 엔트리 생성중...");
            Directory kim = new Directory("kim");
            Directory park = new Directory("park");
            Directory son = new Directory("son");
            usrDir.add(kim);
            usrDir.add(park);
            usrDir.add(son);
            kim.add(new File("diary.html", 100));
            kim.add(new File("Java.java", 200));
            park.add(new File("memo.txt", 300));
            son.add(new File("son.txt", 500));
            son.add(new File("TodoList.txt", 300));
            rootDir.printList();

        }catch(FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
