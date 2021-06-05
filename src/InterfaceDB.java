import java.io.File;
import java.util.Scanner;

interface InterfaceDB{
    public abstract void write(String text);
    public abstract String readData(String text);
    public abstract Scanner search(String text ,File myObj);
    public abstract void delete(String text);
}