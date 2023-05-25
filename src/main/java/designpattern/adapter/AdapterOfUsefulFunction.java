package main.java.designpattern.adapter;

public class AdapterOfUsefulFunction extends UsefulFunction implements A{

    @Override
    public void a() {
        b();
    }

    @Override
    public void b() {
        super.b();
    }
}
