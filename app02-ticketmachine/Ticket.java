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
    
    
    
    /**
     * This constructs the details for the destination of the tickets and the price as an integer
     */
    public Ticket(String destination, int price)
    {
        // initialise instance variable
        this.price = price;
        this.destination = destination;
        datePurchased = new Date();
    }
    
    /**
     * This is a function that returns the destination value as a string after the task is performed.
     */
    public String getDestination()
    {
        return destination;
    }
    /**
     * This is a function that returns the price value as an integer after the task is performed.
     */
    public int getPrice()
    {
        return price;
    }
    /**
     * This prints out the ticket details in a coherent order
     */
    public void print()
    { 
        System.out.print("Destination:" + destination);
        System.out.print(" Price " + price + " pence");
    }
}
