package File;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

class FileDataBase implements InterfaceDB {

  String fileName;

  public static String readFromLast(String fileName, int t) {
    File file = new File(fileName);
    int lines = 0;
    StringBuilder builder = new StringBuilder();
    RandomAccessFile randomAccessFile = null;
    try {
      randomAccessFile = new RandomAccessFile(file, "r");
      // Io.print(Long.toString(file.length() - 1));

      if (t == 1) {
        long fileLength = 0;
        randomAccessFile.seek(fileLength);
        char c;
        long pointer = fileLength;
        randomAccessFile.seek(pointer);
        c = (char) randomAccessFile.read();

        while (c != '\n') {

          builder.append(c);
          pointer++;

          randomAccessFile.seek(pointer);
          c = (char) randomAccessFile.read();

        }

      } else {
        long fileLength = file.length() - 1;

        randomAccessFile.seek(fileLength);
        for (long pointer = fileLength; pointer >= 0; pointer--) {
          randomAccessFile.seek(pointer);
          char c;
          // read from the last one char at the time
          c = (char) randomAccessFile.read();
          // break when end of the line
          if (c == '\n') {
            break;
          }
          builder.append(c);
        }
      }
      // https://www.netjstech.com/2016/02/how-to-read-file-from-last-line-in-java.html
      // long fileLength = 100;
      // Set the pointer at the last of the file

      // Since line is read from the last so it
      // is in reverse so use reverse method to make it right
      builder.reverse();
      randomAccessFile.close();

      if (t == 1) {
        String x = builder.toString();
        String y = new StringBuilder(x).reverse().toString();
        return y;
        // System.out.println("Line - " + y);

      } else {
        return builder.toString();
        // System.out.println("Line - " + builder.toString());

      }

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return "dg 7amobika";
    } catch (IOException e) {
      // TODO Auto-generated catch block

      e.printStackTrace();
      return "dg 7amobika";
    } finally {
      if (randomAccessFile != null) {
        try {
          randomAccessFile.close();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      //
    }
  }

  @Override
  public void write(String text) {

    try {
      File myObj = new File(this.fileName);

      if (!myObj.exists()) {
        myObj.createNewFile();
        System.out.println("File created: " + myObj.getName());
        Io.print("Create file successfully");
      } else
        System.out.println("File already exists.");

      FileWriter myWriter = new FileWriter(this.fileName, true);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      LocalDateTime now = LocalDateTime.now();
      myWriter.append("{DateTime:");

      myWriter.append(dtf.format(now));
     
      myWriter.append(",UserName:");
      myWriter.append(text);
      myWriter.append(",");
      myWriter.append("sex:null,age:null,waitingFor:null,VIPness:null,regulerCustomer:null,fName:null,LastName:null,phoneNumber:null,Email:null,}");

      myWriter.append("\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred inside write function" + e.getMessage());
    }
  }

}