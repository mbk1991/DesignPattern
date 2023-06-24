package main.java.designpattern.decorator;

public class FullBorder extends Border{

    protected FullBorder(Display display) {
        super(display);
    }
    @Override
    public int getColumn() {
        return 1 + display.getColumn() + 1;
    }
    @Override
    public int getRows() {
        return 1+ display.getRows() + 1;
    }
    @Override
    public String getRowText(int row) {
        if(row == 0){
            return "+" + makeLine('-',display.getColumn())  + "+";
        }else if(row == display.getRows() + 1){
            return "+" + makeLine('-',display.getColumn())  + "+";
        }else{
            return "|" + display.getRowText(row-1) + "|";
        }
    }
    private String makeLine(char ch, int cnt){
        StringBuffer buffer = new StringBuffer();
        for( int i=0; i<cnt; i++){
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
