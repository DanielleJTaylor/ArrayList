/*
 * Danielle Taylor
 * CPS350
 * 
 * Description: 
 * Creates a linked list of double values
 * With methods such as insertFront, insertEnd,insertAtPosition,removeEnd,and printList() 
 * 
 * 
 */



import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class HeadTailList{
	
 private class Node {
 double item;
 Node next;
 
 public Node(double value) {
	 item = value;
	 next = null;
	 size++;
 }
 }
 
 
 private Node head;
 private Node tail;
 private int size;
 
 public HeadTailList() {
 head = null;
 tail = null;
 size = 0;
 }

 public HeadTailList(double value)
 {	
	 Node new_node = new Node(value); 
	 
 }

 public boolean isEmpty() {
 return size == 0;
 }
 public int length() {
 return size;
 }
 // Additional methods to be implemented...
 
 public void insertFront(double value) {
	
	 Node newNode = new Node(value);
	 
	 if(head == null) {
		 head = newNode;
         tail = newNode;
	 }
	 //Node temp will point to head  
     Node temp = head;  
     //newNode will become new head of the list  
     head = newNode;
     //Node temp(previous head) will be added after new head  
     head.next = temp;    
 }	
 
	
 public void insertEnd(double value) {
	 Node newNode = new Node(value);
	 
	 if(head == null) {
		 head = newNode;
         tail = newNode;
	 }
	 
	 if(this.head != null) {
	        this.tail.next = newNode; //creates new node after tail 
	    }
	        
	    this.tail = newNode; //sets the new node as the new tail
	 
 }
 
 
 public void insertAtPosition(double value, int position){

	 Node newNode = new Node(value);

      // Invalid position
      if(position < 1 || position > size + 1)
          System.out.println("Out of bounds");

          // Inserting as first node
      else if(position == 1){
    	  newNode.next = head;
          head = newNode;
      }

      else 
      {
          Node temp = head;

          // traverse until we get to the node we need
          while(--position > 1){
              temp = temp.next;
          }
          newNode.next= temp.next;
          temp.next = newNode;
      }
  } 

 public void removeEnd() {
     if (head == null) {
         throw new NoSuchElementException("Error: List is empty");
     }
    
   
     if (head == tail) {
         head = null;
         tail = null;
     } 
     
     else {
         Node current = head;
         while (current.next != tail) {
             current = current.next;
         }
         current.next = null;
         tail = current;
     }
     size--;
 }
 

	public void printList() {
		//Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
  
        while(current != null) {  
            //Prints each node   
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
	

 

	public static void main(String[] args) {
		
		HeadTailList list = new HeadTailList();
	
		
		try (Scanner scan = new Scanner(new File("double_values.txt"))) {

		    while (scan.hasNextLine()) {
		    	Double i =  Double.valueOf(scan.nextLine());  
					list.insertFront(i);	
			}
		    
		    
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		list.insertEnd(59.5);
		list.insertAtPosition(188.5, 2);
		list.removeEnd();
		
		list.printList();
	}

}