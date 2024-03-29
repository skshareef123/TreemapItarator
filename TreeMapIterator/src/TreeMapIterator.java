import java.util.*;
public class TreeMapIterator {

	public static void main(String[] args) {
		 TreeMap<String, String> treemap = new TreeMap<String, String>();
		    // Add Key-Value pairs to TreeMap
		    treemap.put("Key1", "Pear");
		    treemap.put("Key2", "Apple");
		    treemap.put("Key3", "Orange");
		    treemap.put("Key4", "Papaya");
		    treemap.put("Key5", "Banana");
		    
		    
		    // Get Set of entries
		    Set set = treemap.entrySet();
		    // Get iterator
		    Iterator it = set.iterator();
		    // Show TreeMap elements
		    System.out.println("TreeMap contains: ");
		    while(it.hasNext()) {
		      Map.Entry pair = (Map.Entry)it.next();
		      System.out.print("Key is: "+pair.getKey() + " and ");
		      System.out.println("Value is: "+pair.getValue());
		    }
		  }

	}

