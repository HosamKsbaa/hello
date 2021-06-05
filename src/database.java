import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class FileDataBase implements InterfaceDB{

String fileName;

void write(String text){
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
        System.out.println("An error occurred."+e.getMessage() );
        }
    }
    
    Stirng readData(String text){
        File myObj = new File(this.fileName);
        if (myObj.exists()) {
            Scanner s =search(text);
            String data= s.nextLine();
            myReader.close();
            return data;
        }
        else
            System.out.println("The file does not exist.");
        }

    Scanner search(String text){
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine() && myReader.nextLine() != text) {
                myReader.nextLine();
            }
            return myReader;
    }
    
    void delete(String text){
        Scanner s = search(String text);
        
        }

    }