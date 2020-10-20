import java.util.Date;

/** This class is includes all the price, destiantion and date details on the ticket
 * 
 *
 * @author (Berzin Daruwala)
 * @version (18/10/20)
 */
public class Ticket
{// instance variables - replace the example below with your own
    public String destination;
    
    public int price;
    
    private Date datePurchased = new Date(); 
    

    /**
     * Constructor for objects of class Ticket
     */
    
    public Ticket()
    {
        price = 220;
        destination = "Aylesbury";
        datePurchased = new Date();
        
        price = 300;
        destination = "Amersham";
        datePurchased = new Date();
        
        price = 330;
        destination = "High Wycombe";
        datePurchased = new Date();
    }
    
    
    
    public Ticket(String destination, int price)
    {
        // initialise instance variable
        this.price = price;
        this.destination = destination;
        datePurchased = new Date();
    }
    
    public String getDestination()
    {
        return destination;
    }
    public int getPrice()
    {
        return price;
    }
    public void print()
    { 
        System.out.print("Destination:" + destination);
        System.out.print(" Price " + price + " pence");
    }
}
