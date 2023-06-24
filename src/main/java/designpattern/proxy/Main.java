package main.java.designpattern.proxy;

public class Main {
    public static void main(String[] args){
        Printable p = new PrinterProxy("프린터대리");
        System.out.println(p.getPrinterName());
        p.setPrinterName("프린터 대리!");
        System.out.println(p.getPrinterName());

        p.print("Hello World");
    }
}
