package File;

public class Customers {
    
    public  void reserveTicket(String text){
        FileDataBase f = new FileDataBase();
        f.fileName ="check.txt";
        if(f.check(text)){
            f.fileName="text.txt";
            Io.print(f.readData(text));
        }
        else
        Io.print("your ticket ha expired");
        
        //Io.print("<newTicket code>");
    }

    public   void cancelReservation(){

    }

    public void notifyStaffwithcancelCustomer(int currentCustomer){
        Io.print("up next Customer number");
        Io.print(String.valueOf(currentCustomer));
        }
}
