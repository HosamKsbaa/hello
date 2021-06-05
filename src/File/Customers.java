package File;

import utility.Io;

public class Customers {
    
    public  void reserveTicket(){
        
        //Io.print("<newTicket code>");
    }
    public   void cancelReservation(){
       // String code =Io.cin("add your code");
         
    }
    public void notifyStaffwithcancelCustomer(int currentCustomer){
        String x=String.format("A string %s ", currentCustomer+1 ," get ready ");
        Io.print(x);
    }
}
