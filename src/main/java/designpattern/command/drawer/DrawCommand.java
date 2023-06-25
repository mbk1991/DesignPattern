package main.java.designpattern.command.drawer;

import main.java.designpattern.command.command.Command;

import java.awt.Point;

public class DrawCommand implements Command {
    protected Drawable drawble;
    private Point position;

    public DrawCommand(Drawable drawable, Point position){
        this.drawble = drawable;
        this.position = position;
    }
    @Override
    public void execute() {
        drawble.draw(position.x, position.y);
    }
}
