import java.util.*;
import java.util.Map.Entry;

public class hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashing Technique
		
		//Hashset
		//HashMap
		//LinkedHashSet
		//LinkedHashMap
		//HashTable
		//Properties
		//Key Value
		
		
		//Has Set - No Repetetions 
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(12);
		hs.add(11);
		hs.add(1);
		hs.add(12);
		
		System.out.println(hs);
		
		//Tree Set
		//No repetetions
		//Will not maintain order of insertion
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		TreeSet<String> ts1= new TreeSet<>();
		
		ts1.add("One");
		
		System.out.println(ts1);
		
		ts.add(1);
		ts.add(12);
		ts.add(11);
		ts.add(1);
		ts.add(12);
				
		System.out.println(ts);
		
		
		//HashMap
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "ONE");
		hm.put(2, "TWO");

		
		System.out.println(hm);
		
		
		//TreeMap | HashMap
		
		TreeMap<Integer,String> tm = new TreeMap<>(Map.of(1,"ONE",2,"TWO",3,"THREE"));
		
		//For Each Loop 
		
		System.out.println(tm.size());
		for(Entry<Integer, String> x: tm.entrySet())
		{
			System.out.println("Key is " + x.getKey() + " Value is "+ x.getValue());

		}
		
	}

}
