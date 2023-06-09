package main.java.designpattern.mediator;

import java.awt.*;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements Colleague {
    private Mediator mediator;
    public ColleagueTextField(String text, int columns){
        super(text,columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }
    public void textValueChanged(TextEvent e){
        mediator.colleagueChanged();
    }
}
