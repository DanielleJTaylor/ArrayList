

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

class TicketQueue {
    Ticket head;
    Ticket tail;
    int size;

    public TicketQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public Ticket enqueue(Ticket t) {
        if (head == null) {
            this.head = t;
            this.tail = t;
            t.next = null;
            t.previous = null;
        } else {
            t.previous = tail;
            this.tail.next = t;
            this.tail = t;
        }
        size++;
        sortList(); // Call sortList after enqueuing
        return t;
    }


    public void sortList() {
        if (size <= 1) return;
        boolean swapped;
        do {
            swapped = false;
            Ticket current = head;
            while (current != null && current.next != null) {
                if (current.priority > current.next.priority) {
                    // Swap the tickets
                    Ticket next = current.next;
                    if (current.previous != null) {
                        current.previous.next = next;
                    } else {
                        head = next;
                    }
                    if (next.next != null) {
                        next.next.previous = current;
                    } else {
                        tail = current;
                    }
                    current.next = next.next;
                    next.previous = current.previous;
                    current.previous = next;
                    next.next = current;

                    swapped = true;
                } else {
                    current = current.next;
                }
            }
        } while (swapped);
    }

    
    public Ticket dequeue() {
        if (head == null) {
            return head;
        }
       

        else if (size == 1) {
            // Case when there's only one element in the list
            head = null;
            tail = null;
            size--;
            return head;
            
        } 
        else {
            head = head.next;
            Ticket temp = head.previous;
            head.previous = null;
            size--;
            return temp;
        }
        
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        Ticket current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.println(current.ticketID + " " + current.customerName + " " + current.issueDescription + " "
                    + current.priority);
            current = current.next;
        }
        System.out.println(" ");
    }
    
}
