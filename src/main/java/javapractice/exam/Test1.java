package main.java.javapractice.exam;

import java.util.*;

public class Test1 {
    public static void main(String[] args){
        String sample ="1622025201 REQUEST 10001 192.168.0.1/" +
                "1622025202 REQUEST 10002 192.168.0.2/" +
                "1622025203 REQUEST 10003 192.168.0.1/" +
                "1622025211 RESPONSE 10003/" +
                "1622025212 RESPONSE 10002/" +
                "1622025213 RESPONSE 10001/" +
                "1622025221 REQUEST 10004 192.168.0.2/" +
                "1622025223 REQUEST 10005 192.168.0.2/" +
                "1622025230 RESPONSE 10004/" +
                "1622025231 REQUEST 10006 192.168.0.3/" +
                "1622025236 RESPONSE 10006/" +
                "1622025333 RESPONSE 10005";
        String[] logs = sample.split("/");

        List<Command> list = new ArrayList<>();
        for(String str: sample.split("/")){
            String t = str.split(" ")[0];
            String c = str.split(" ")[1];;
            String d = str.split(" ")[2];;
            String p = str.split(" ")[3];;
            list.add(new Command(t,c,d,p));
        }
    }

    public static void getRqstCntIP(List<Command> list, String ip){
        Iterator<Command> it = list.iterator();
        StringBuilder builder = new StringBuilder();
        while(it.hasNext()){
            Command cmd = it.next();
            if(cmd.getIp().equals(ip)){

            }
        }
    }


}

class Command{
    private Command response;
    private String time;
    private String com;
    private String id;
    private String ip;

    public Command(String time, String com, String id, String ip){
        this.time = time;
        this.com = com;
        this.id = id;
        this.ip = ip;
    }

    public String getTime(){
        return time;
    }
    public String getCom(){
        return com;
    }
    public String getId(){
        return id;
    }
    public String getIp(){
        return ip;
    }
    public String getSpentTime(){
        int rqstTime = Integer.parseInt(this.getTime());
        int rspsTime = Integer.parseInt(response.getTime());
        return rqstTime-rspsTime + "";
    }

    public void getCntRqstIP(){
        if(this.ip != null){

        }
    }

}
