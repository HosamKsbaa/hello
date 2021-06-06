package File;

import java.util.Scanner;


public class Io {
    static Scanner S=new Scanner(System.in); 

    public static String cin(String message){
            Io.print(message);

        String result =S.nextLine();

        return result;
    }
    public static void print(String message){
        System.out.println(message); 
    
    
    }

}
