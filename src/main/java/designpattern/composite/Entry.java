package main.java.designpattern.composite;

public abstract class Entry {
    protected Entry parent;
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public void printList(){
        printList(" ");
    }
    protected abstract void printList(String prefix);
    @Override
    public String toString(){
        return getName() + " (" + getSize() + ") ";
    }
    public String getFullName(){
        StringBuffer fullName = new StringBuffer();
        Entry entry = this;
        do{
            fullName.insert(0,"/"+entry.getName());
            entry = entry.parent;
        } while(entry != null);
        return fullName.toString();
    }
}
