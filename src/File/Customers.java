package File;

public class Customers {
    
    public  void reserveTicket(String text){
        FileDataBase f = new FileDataBase();
        f.fileName="text.txt";
        f.write(text);
        
        //Io.print("<newTicket code>");
    }


    public void notifyStaffwithcancelCustomer(){
        Io.print("up next Customer number ");
        }
}
