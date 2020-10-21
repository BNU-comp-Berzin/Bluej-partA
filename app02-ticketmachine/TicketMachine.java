/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Berzin Daruwala
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket ticketToAylesbury;
    
    private Ticket ticketToAmersham;
    
    private Ticket ticketToHighWycombe;
    
    

    
    
    private String issuedTicket;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        total = 0;
        balance = 0;
        createTickets();
    }
    /**
     * creates a ticket with it's destination and price included
     */
    private void createTickets()
    {
       ticketToAylesbury = new Ticket("Aylesbury", 220);
       
       ticketToAmersham = new Ticket("Amersham", 300);
       
       ticketToHighWycombe = new Ticket("High Wycombe", 330);
    }
    /**
     * Returns The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Allows the user to insert 10p coins to the machine
     */
    public void insertTenP()
    {
        balance = balance + 10;
        
        System.out.println("Amount added: 10 pence");
        System.out.println("balance: " + balance);
    }
    
    /**
     * Allows the user to insert 20p coins to the machine
     */
    public void insertTwentyP()
    {
        balance = balance + 20;
        
        System.out.println("Amount added: 20 pence");
        System.out.println("balance: " + balance);
    }
    
    /**
     * Allows the user to insert £1.00 (100 pence) to the machine
     */
    public void insertHundredP()
    {
        balance = balance + 100;
        
        System.out.println("Amount added: 100 pence");
        System.out.println("balance: " + balance);
    }
    
    /**
     * Allows the user to insert £2.00 (200 pence) to the machine
     */
    public void insertTwoHundredP()
    {
        balance = balance + 200;
        
        System.out.println("Amount added: 200 pence");
        System.out.println("balance: " + balance);
    }
    
    

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    } 
    /**
     * Allows the user to set the destination of the ticket to create a price.
     */
    public void destination(String destination)
    {
       if (destination == "Aylesbury")
       {
           issuedTicket = ticketToAylesbury.destination;
           price = ticketToAylesbury.price;
       }
       else if (destination == "Amersham")
       {
           issuedTicket = ticketToAmersham.destination;
           price = ticketToAmersham.price;
       }
       else if (destination == "High Wycombe")
       {
           issuedTicket = ticketToHighWycombe.destination;
           price = ticketToHighWycombe.price;
       }
       else
       {
           System.out.println("You must choose an available ticket.");
       }
    }

    /**
     * Prints a ticket if enough money is there, prints an error message if there is not enough money
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket:" + issuedTicket); 
            System.out.println("# " + price + " pence, ");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    /**
     * Prints the tickets with a cohesive display, has to be done separately for each ticket
     */
    public void printAllTickets()
    {
       printHeading();
       System.out.print("Destination " + ticketToAylesbury.destination + " , ");
       System.out.println("Price: " + ticketToAylesbury.price + " pence");
        
       System.out.print("Destination " + ticketToAmersham.destination + " , ");
       System.out.println("Price: " + ticketToAylesbury.price + " pence");
       
       System.out.print("Destination " + ticketToHighWycombe.destination + " , ");
       System.out.println("Price: " + ticketToHighWycombe.price + " pence");
    }
    
    /**
     * Prints out the heading of the ticket with the borders included
     */
    public void printHeading()
    {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("##################");
        System.out.println();
    }
}

