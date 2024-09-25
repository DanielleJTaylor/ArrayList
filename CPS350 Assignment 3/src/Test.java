

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

public class Test {
    public static void main(String[] args) {
        Ticket t1 = new Ticket(101, "John", "Internet connection issue", 1);
        Ticket t2 = new Ticket(102, "Alex", "Request for account update", 3);
        Ticket t3 = new Ticket(103, "John", "Request for account recovery", 2);
        Ticket t4 = new Ticket(104, "John", "Unable access the system", 1);
        Ticket t5 = new Ticket(105, "Sam", "Internet connection issue", 3);
        
        TicketQueue list = new TicketQueue();
        list.enqueue(t1);
        list.enqueue(t2);
        list.enqueue(t3);
        list.enqueue(t4);
        list.enqueue(t5);
        
        list.printList();
        Ticket old = list.dequeue();
        list.printList();
        
        //System.out.println(old.ticketID);
    }
}