package File;

import utility.Io;

public class QueueManger {
    public int currentCounter;
    public Stuff stuff;
    public Customers customers;

    public void StrartTheAPp(){
        int theOptions=1;
        Io.print("welcome to the ticket app");
        while (theOptions!=4) {
            theOptions=options();
            if(theOptions==1){
                customers.reserveTicket();
                stuff.notifyStaffWithNewCustomer();
            }
            else if(theOptions==2){
                customers.cancelReservation();
                stuff.notifyStaffwithcancelCustomer();
    
            }
            else if(theOptions==3){
                stuff.processAClient();
                customers.cancelReservation();
    
                
            }
            else if(theOptions==4){
                System.exit(1);
            }
            else{
                Io.print("Wrong number please choose between 1 to 4");
            }   
           }
        
    }
    static int options(){
        Io.print("to reserve Ticket press 1 ");
        Io.print("to cancel reserveation press 2 ");
        Io.print("to take a client press 3  ");
        Io.print("to end an app press 4   ");
        return Io.cin("Your choies >>");
    }
}


