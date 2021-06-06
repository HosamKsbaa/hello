package File;
import java.util.Scanner;

interface InterfaceDB{
    String filename ="";
    public abstract void write(String text);
    public abstract String readData(String text);
    public abstract Scanner search(String text);
    public abstract boolean check(String text);
}