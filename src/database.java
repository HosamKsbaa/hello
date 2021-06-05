import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



import java.io.File;

class FileDataBase implements InterfaceDB{

String fileName;

@Override
public void write(String text){
    try {
      File myObj = new File(this.fileName);
      FileWriter myWriter = new FileWriter(this.fileName);

        if (myObj.createNewFile()) 
        System.out.println("File created: " + myObj.getName());

        else 
        System.out.println("File already exists.");
        

        myWriter.write(text);
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
            Scanner s =search(text,myObj);
            data = s.nextLine();
            s.close();
                
        }
        else
            System.out.println("Error file used inside readData function doesn't exist");
        return data;
        }
        
        @Override
        public Scanner search(String text ,File myObj){
            Scanner myReader;
            try{
             myReader= new Scanner(myObj);
            while (myReader.hasNextLine() && myReader.nextLine() != text) {
                myReader.nextLine();
        }
    }
    
        catch(Exception e){
            System.out.println("Error file used inside search function doesn't exist"+e.getMessage());
             myReader = new Scanner("");
        }
        return myReader;
    }
    @Override
    public void delete(String text){
        File myObj =new File(this.fileName);
        Scanner s = search(text,myObj);
    
        }

    }