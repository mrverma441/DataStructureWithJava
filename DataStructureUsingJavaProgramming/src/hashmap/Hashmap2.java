package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {

	public static void main(String[] args) {
		HashMap<Integer,String>mymap=new HashMap<Integer,String>();
		mymap.put(101, "Mango");
		mymap.put(102, "apple");
		mymap.put(103, "banana");
		mymap.put(104, "grapes");
		
		System.out.println("Iterate the hashmap");
		for(Map.Entry m:mymap.entrySet())
		{
			System.out.println(m.getKey()+"->"+m.getValue());
		}
			
		

	}

}
