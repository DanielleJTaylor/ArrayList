
public class Entry {
	int key, value;
	Entry next;
	
	
    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }

}



/*
public void fullprintTable() {
	System.out.print("Print starting..."+ numberOfEntries);
	System.out.println("");


	for (int i=0; i<TABLE_SIZE;i++) {
	System.out.println("Index: "+ i);
	Entry currentNode = hashTable[i];
	Entry previousNode = null; 
	while (currentNode != null) { 

	System.out.print("[" + "key:" + currentNode.key +", value:" + currentNode.value +" ]");
	System.out.println("");
	previousNode = currentNode;// move to the next node in the chain 
	currentNode = currentNode.next; 
			} 
		}
	}

*/