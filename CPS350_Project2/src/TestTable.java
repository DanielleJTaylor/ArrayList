
public class TestTable {
	    public static void main(String[] args) {
	    	
	    	System.out.println("Separate Chaining");
	    	System.out.println("");
	    	
	        HashTable_SC Separate_Chaining  = new HashTable_SC();
	        Separate_Chaining.add(54, 54);
	        Separate_Chaining.add(19, 19);
	        Separate_Chaining.add(23, 23);
	        Separate_Chaining.add(34, 34);
	        Separate_Chaining.add(125, 125);
	        Separate_Chaining.add(37, 37);
	        Separate_Chaining.add(45, 45);
	        Separate_Chaining.add(42, 42);
	        
	        Separate_Chaining.printTable();
	        

	        Separate_Chaining.remove(125);
	      
	        Separate_Chaining.printTable();
	        
	        Separate_Chaining.search(45);
	        
	        Separate_Chaining.printTable();
	        
	        Separate_Chaining.add(68,68);
	        
	        Separate_Chaining.printTable();
	        
	        
	        System.out.println("Linear Probing");
	        System.out.println("");
	        
	        
	        HashTable_LP Linear_probing  = new HashTable_LP();
	        Linear_probing.add(54, 54);
	        Linear_probing.add(19, 19);
	        Linear_probing.add(23, 23);
	        Linear_probing.add(34, 34);
	        Linear_probing.add(125, 125);
	        Linear_probing.add(37, 37);
	        Linear_probing.add(45, 45);
	        Linear_probing.add(42, 42);
	        
	        Linear_probing.printTable();
	        

	        Linear_probing.remove(125);
	      
	        Linear_probing.printTable();
	        
	        Linear_probing.search(45);
	        
	        Linear_probing.printTable();
	        
	        Linear_probing.add(68,68);
	        
	        Linear_probing.printTable();
	        
	    }
	}
