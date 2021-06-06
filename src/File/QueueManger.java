package File;

import java.io.IOException;

public class QueueManger {
    public int currentCounter;
    public Stuff stuff=new Stuff();
    public Customers customers=new Customers();

    public void StrartTheAPp() throws IOException {
        int theOptions = 1;
        Io.print("welcome to the ticket app");
       // Io.print(theOptions);

        while (theOptions != 4) {
            Io.print("====================================");
            Io.print("====================================");

            Io.print("to reserve Ticket press 1 ");
            Io.print("to cancel reserveation press 2 ");
            Io.print("to take a client press 3  ");
            Io.print("to end an app press 4   ");
            
            theOptions = Integer.parseInt(Io.cin("Your choies >>"));
            Io.print("                                           ");
            Io.print("                                           ");
            Io.print("                                           ");
            Io.print("                                           ");


            if (theOptions == 1) {
                customers.reserveTicket("Lamia");
                stuff.notifyStaffWithNewCustomer();
            } else if (theOptions == 2) {
                customers.cancelReservation();
                stuff.notifyStaffwithcancelCustomer();

            } else if (theOptions == 3) {
                stuff.processAClient();
                customers.notifyStaffwithcancelCustomer(1);

            } else if (theOptions == 4) {
                System.exit(1);
            } else {
                Io.print("Wrong number please choose between 1 to 4");
            }
            


        }

    }

   
}
