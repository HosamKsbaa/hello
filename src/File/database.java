package File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

class FileDataBase implements InterfaceDB{

String fileName;



 
@Override
public void write(String text){

   try {
      File myObj = new File(this.fileName);

      
        if (!myObj.exists()){
        myObj.createNewFile();
        System.out.println("File created: " + myObj.getName());
        Io.print("Create file successfully");
    }
        else 
        System.out.println("File already exists.");
        
        FileWriter myWriter = new FileWriter(this.fileName);
        myWriter.append(text);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        } 
    catch (IOException e) {
        System.out.println("An error occurred inside write function"+e.getMessage() );
        }
    }

    @Override
    public String readData(String text){
        File myObj = new File(this.fileName);
        String data ="";
        if (myObj.exists()) {
            Scanner s =search(text);
            data = s.nextLine();
            s.close();
            return data;
        }
        else
            System.out.println("Error file used inside readData function doesn't exist");
            return "";
        }
        
        @Override
        public Scanner search(String text){
            Scanner myReader;
            try{
             myReader= new Scanner(new File(this.fileName));
            while (myReader.hasNextLine() && myReader.nextLine() != text) {
                myReader.nextLine();
        }
    }
    
        catch(Exception e){
            System.out.println("Error file used inside search function doesn't exist");
             myReader = new Scanner("");
        }
        return myReader;
    }
    
    @Override
    public boolean check(String text){
        Scanner s =search(text);
         String t=s.nextLine();
        if(t =="finish")
            return false;
        else
            return true;
        }
    }