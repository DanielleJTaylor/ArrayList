

public class HashTable_SC { 
	private Entry[] hashTable; 
	private int numberOfEntries; 
	private static final int TABLE_SIZE = 11; 
	public HashTable_SC() {
	hashTable = new Entry[TABLE_SIZE]; 
	numberOfEntries = 0; 
	} 
	
	private int getHashIndex(Object key) { 
	int hashIndex = key.hashCode() % TABLE_SIZE; 
	return hashIndex; 
	}
	
	public int search (int key) {
		//System.out.println("Search starting...");
		int index = getHashIndex(key); 
		Entry currentNode = hashTable[index]; 
			
		while (currentNode != null) { 
			if (currentNode.key==key) { 
				//currentNode.value = value; 
				System.out.println("Search for "+ key+ " successful at index "  + index );
				System.out.println("");
				return index; 
				} 
			currentNode = currentNode.next; 
				} 
		
	
		System.out.println("Key " + key + " does not exist within the table");
		System.out.println("");
		return -1;
		
	}
	
	public void add(int key, int value) { 
		int index = getHashIndex(key); 
	if (hashTable[index] == null) { 
		hashTable[index] = new Entry(key, value); 
		numberOfEntries++; 
		} 
	else {
		// updating the value for an existing key 
		Entry currentNode = hashTable[index]; 
		while (currentNode != null) { 
			if (currentNode.key==key) { 
				currentNode.value = value; 
				return; 
				} 
			currentNode = currentNode.next; 
				} 
		// If the key DOES NOT exist, insert new node at the beginning of the chain 
		Entry newNode = new Entry(key, value); 
		newNode.next = hashTable[index]; 
		hashTable[index] = newNode; 
		numberOfEntries++; 
		}
	}
	

public void remove(int key) { 
int index = getHashIndex(key); 
Entry currentNode = hashTable[index]; 
Entry previousNode = null; 


while (currentNode != null) { 
	if (currentNode.key==key) 
	{// Key is found 
		if (previousNode == null) {
		// the first node in the chain 
		hashTable[index] = currentNode.next; } 
	else {
		//not the first node 
		previousNode.next = currentNode.next; 
		} 
	numberOfEntries--; 
	return; 
		} previousNode = currentNode;
	// move to the next node in the chain 
	currentNode = currentNode.next; 
	}
}


public void printTable() {
//System.out.print("Print starting..."+ numberOfEntries);

for (int i=0; i<TABLE_SIZE;i++) {

Entry currentNode = hashTable[i];
Entry previousNode = null; 
while (currentNode != null) { 

System.out.print("[" + "key:" + currentNode.key +", value:" + currentNode.value +" ]");

previousNode = currentNode;// move to the next node in the chain 
currentNode = currentNode.next; 
		} 
	}
System.out.println("");
System.out.println("");

}

}

