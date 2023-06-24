package main.java.javapractice.exam;

import java.util.Arrays;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args){
        Object[][] records = new Object[][] {
                {"AAA", 1.23456, 123456},
                {"BBBBB", 12.3, 123},
                {"CCCC", 123.4, 1234}
        };

        Data d1 = new Data(records[0]);
        Data d2 = new Data(records[1]);
        Data d3 = new Data(records[2]);


    }

    public static int[] getLongLength(Data ... d){
        int[] tmp = new int[3];



        return tmp;
    }

    public static int getMaxLength(String...s){
        int max;

        int[] arr = new int[s.length];
        for(int i=0; i<s.length; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static String printStr(){
        return "";
    }

    public static String printNum(){
        return "";
    }

}

class Data{
    private String str;
    private double dbl;
    private int num;

    public Data(Object[] obj){
        this.str = (String)obj[0];
        this.dbl = (double)obj[1];
        this.num = (int)obj[2];
    }
    public String getStr(){
        return str;
    }
    public double getDbl(){
        return Math.round(dbl * 100) / 100.0;
    }
    public int getNum(){
        return num;
    }
}
