package main.java.designpattern.state;

public class DayState implements State{
    private static DayState day = new DayState();
    private DayState(){}

    public static State getInstance(){
        return day;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(9 > hour || hour >= 17){
            context.changeState(NightState.getInstance());
        }
    }
    @Override
    public void doUse(Context context) {
        context.recordiLog("금고사용(주간)");
    }
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }
    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반통화(주간)");
    }
    public String toString(){
        return "[주간] ";
    }
}
