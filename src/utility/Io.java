package utility;
import java.util.Scanner;


public class Io {
    public static int cin(String message){
        Io.print(message); 
    
        Scanner S=new Scanner(System.in); 
        int result =S.nextInt();
        S.close();
        return result;
    }
    public static void print(String message){
        System.out.println(message); 
    
    
    }

}
