import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import File.Io;
import File.QueueManger;

public class App {
    
    public static void main(String[] args) throws Exception {
        // Hashtable<String,Hashtable <String , String>> my_dict = new Hashtable<String, Hashtable <String , String>>();
        // my_dict.put(
        //     "hello",{"boyy":"boyy2"}
        // );
         
       // Io.print(Search(null, null, 0));
        QueueManger queueManger=new QueueManger();
        queueManger.StrartTheAPp();
    }
    public static String Search(String filePath,String keyword,int length){
        Scanner scanner=new Scanner(filePath);
        List<String> list=new ArrayList<>();
        String line="";
        while(scanner.hasNextLine()){
            list.add(scanner.nextLine()); 
            if(list.contains(keyword)){
               line=list.get(list.size()-1);
              for (int i = 0; i < length; i++) {
                line=scanner.nextLine();
              }
              return line; 
      
             
            }
        }
        return line; 
      
      }
   }

