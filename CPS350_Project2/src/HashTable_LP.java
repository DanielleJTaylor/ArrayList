
public class HashTable_LP {
	private Entry[] hashTable; 
	private int numberOfEntries; 
	private static final int TABLE_SIZE = 11; 
	public HashTable_LP() {
	hashTable = new Entry[TABLE_SIZE]; 
	numberOfEntries = 0; 
	} 

	
	
	private int getHashIndex(Object key) { 
	int hashIndex = key.hashCode() % TABLE_SIZE; 
	return hashIndex; 
	}
	
	public int search (int key) {
		//System.out.println("Search starting...");
 
		for (int i=0; i<TABLE_SIZE;i++) {
			Entry currentNode = hashTable[i];
		
		while (currentNode != null) { 
			if (currentNode.key==key) { 
				//currentNode.value = value; 
				System.out.println("Search for "+ key+ " successful at index "  + i  );
				System.out.println("");
				return i; 
				} 
			currentNode = currentNode.next; 
				} 
		}
		System.out.println("Key " + key + " does not exist within the table");
		System.out.println("");
		return -1;
		
	
	}
	
	public void add(int key, int value) {  
			int initialPos = getHashIndex(key); 
			int pos = initialPos; 
			while (hashTable[pos] != null) { 
				pos = (pos + 1) % TABLE_SIZE; 
				if (pos == initialPos) { 
					// table is full 
					System.out.println("Hash table is full"); 
					return; 
					} 
		} 
		hashTable[pos] = new Entry(key, value); 
		}
	

	public void remove(int key) { 
		int initialPos = getHashIndex(key); 
		int pos = initialPos; 
		while (hashTable[pos] != null) { 
			if (hashTable[pos].key == key) { 
				hashTable[pos] = null; 
				// delete key 
				// rehash all keys in the same cluster 
				pos = (pos + 1) % TABLE_SIZE; 
				while (hashTable[pos] != null) { 
					int keyRehash = hashTable[pos].key; 
					int valueRehash = hashTable[pos].value; 
					hashTable[pos] = null; 
					add(keyRehash, valueRehash); 
					pos = (pos + 1) % TABLE_SIZE; 
					} 
				return; 
					} pos = (pos + 1) % TABLE_SIZE; 
	if (pos == initialPos) {
		break;
		} 
	} 
	System.out.println("Key not found: " + key); 
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