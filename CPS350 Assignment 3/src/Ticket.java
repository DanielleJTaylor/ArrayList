

/*
 * Danielle Taylor
 * CPS350
 * 
 * Description: 
 * Creates a linked list of Ticket object in a priority queue.
 * With methods such as dequeue and enqueue.
 * 
 * 
 */

public class Ticket {
    int ticketID;
    String customerName;
    String issueDescription;
    int priority;
    Ticket next;
    Ticket previous;

    public Ticket(int ticketID, String customerName, String issueDescription, int priority) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.issueDescription = issueDescription;
        this.priority = priority;
    }
}


