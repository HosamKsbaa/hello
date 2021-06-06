import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class App {
    
    public static void main(String[] args) throws Exception {
        readFromLast("text.txt",0);
        // QueueManger queueManger=new QueueManger();
        // queueManger.StrartTheAPp();
    }
   
    public static String  readFromLast(String fileName,int t){  
        File file = new File(fileName);
        int lines = 0;
        StringBuilder builder = new StringBuilder();
        RandomAccessFile randomAccessFile = null;
        try {
          randomAccessFile = new RandomAccessFile(file, "r");
          //Io.print(Long.toString(file.length() - 1));

          if(t==1){
            long fileLength = 0;
            randomAccessFile.seek(fileLength);
            char c;
            long pointer = fileLength;
            randomAccessFile.seek(pointer);
            c = (char)randomAccessFile.read(); 

            while (c != '\n'){

                builder.append(c);
                pointer++;

                randomAccessFile.seek(pointer);
                c = (char)randomAccessFile.read(); 

                
            }
            
          }
          else{
            long fileLength = file.length() - 1;

            randomAccessFile.seek(fileLength);
            for(long pointer = fileLength; pointer >= 0; pointer--){
              randomAccessFile.seek(pointer);
              char c;
              // read from the last one char at the time
              c = (char)randomAccessFile.read(); 
              // break when end of the line
              if(c == '\n'){
                break;
              }
              builder.append(c);
            }
          }
          //https://www.netjstech.com/2016/02/how-to-read-file-from-last-line-in-java.html
         //long fileLength = 100;
          // Set the pointer at the last of the file
          
          // Since line is read from the last so it 
          // is in reverse so use reverse method to make it right
          builder.reverse();
          randomAccessFile.close();

          if(t==1){
           String x = builder.toString();
           String y =new StringBuilder(x).reverse().toString();
            return y;
            // System.out.println("Line - " + y);

            }
            else{
                return builder.toString();
                // System.out.println("Line - " + builder.toString());

            }
                            
        } catch (FileNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }finally{
          if(randomAccessFile != null){
            try {
              randomAccessFile.close();
            } catch (IOException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
          }
          return "dg 7amobika";

        }
      }
}

