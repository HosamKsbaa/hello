package File;

import java.io.IOException;

public class QueueManger {
    public int currentCounter;
    public Stuff stuff=new Stuff();
    public Customers customers=new Customers();

    public void StrartTheAPp() throws IOException {
        // init file 
  
        int theOptions = 1;
        Io.print("welcome to the ticket app");
       // Io.print(theOptions);
              while (theOptions != 3) {
            
            Io.print("====================================");

            Io.print("to reserve Ticket press 1 ");
            Io.print("to process A client press 2  ");
            Io.print("to end an app press 3   ");
            
            theOptions = Integer.parseInt(Io.cin("Your choies >>"));
            Io.print("                                           ");
            Io.print("                                           ");
            
            Io.print("====================================");
            Io.print("                                           ");
            Io.print("                                           ");
 

            if (theOptions == 1) {
                customers.reserveTicket(Io.cin("enter your name"));
                stuff.notifyStaffWithNewCustomer();
            }  else if (theOptions == 2) {
                stuff.processAClient();
                customers.notifyStaffwithcancelCustomer();

            } else if (theOptions == 3) {
                System.exit(1);
            } else {
                Io.print("Wrong number please choose between 1 to 4");
            }
            


        }

    }

   
}
