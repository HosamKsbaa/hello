package File;

public class Customers {
    
    public  void reserveTicket(String text){
        FileDataBase f = new FileDataBase();
        f.fileName="text.txt";
        f.write(text);
        
        //Io.print("<newTicket code>");
    }


    public void notifyStaffwithcancelCustomer(int currentCustomer){
        Io.print("up next Customer number");
        Io.print(String.valueOf(currentCustomer));
        }
}
