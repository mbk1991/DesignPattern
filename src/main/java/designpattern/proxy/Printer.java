package main.java.designpattern.proxy;

public class Printer implements Printable{
    public String name;
    public Printer(){
        heavyjob("Printer의 인스턴스 생성중");
    }
    public Printer(String name){
        this.name = name;
        heavyjob("Printer의 인스턴스 생성중");
    }

    @Override
    public void setPrinterName(String name){
        this.name = name;
    }
    @Override
    public String getPrinterName(){
        return name;
    }
    @Override
    public void print(String string){
        System.out.println("---"+name+"---");
        System.out.println(string);
    }
    private void heavyjob(String msg){
        System.out.print(msg);
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(". ");
        }
        System.out.println("완료");
    }
}
