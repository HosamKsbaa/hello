import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

class FileDataBase{

String fileName;

void write(String text){
    try {
      File myObj = new File(this.fileName);
      
        if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
        } 

        else {
        System.out.println("File already exists.");
        }

        FileWriter myWriter = new FileWriter(this.fileName);       
        myWriter.write(text);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        } 
    catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
    
    void readData(String text){
        File myObj = new File(this.fileName);
        if (myObj.exists()) {
            Scanner myReader = new Scanner(myObj);
            String data;
            while (myReader.hasNextLine() && myReader.nextLine() != text) {
                data = myReader.nextLine();
            }
            data = myReader.nextLine();
            System.out.println(data);
            myReader.close();
        }
        else
            System.out.println("The file does not exist.");
        }
    void delete() 
    }