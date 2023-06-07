package main.java.designpattern.abstractfactory1.factory;

public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(classname + " 클래스가 발견되지 않았습니다.");
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
