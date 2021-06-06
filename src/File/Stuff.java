package File;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


//import utility.Io;

public class Stuff {
   
     String processAClient(){
        String currentGuy="";

        FileDataBase doneF = new FileDataBase();
        doneF.fileName="done.txt";
        
        if(!doneF.exists()){
            Io.print("File f line f");
                doneF.createNewFile();
                System.out.println("File created: " + myObj.getName());            
            currentGuy=FileDataBase.readFromLast("text.txt", 1);

        }else if(doneF.length()<1){
            Io.print("File t line f");
            currentGuy=FileDataBase.readFromLast("text.txt", 1);
        } 
        else{
            Io.print("File t line T");
            String prevuiosGuy=FileDataBase.readFromLast("done.txt", 0);
            FileDataBase f = new FileDataBase();
            Io.print("prevuiosGuy "+prevuiosGuy);
           //================================
            f.fileName="text.txt";
            currentGuy =f.readData(prevuiosGuy);
            Io.print("currentGuy "+currentGuy);

            
        }        
        doneF.write( currentGuy);
        return currentGuy;
    }

    public void notifyStaffWithNewCustomer(){
        Io.print("to Staff >> new Customer is Wating!");
    }
 
}
