package hashmap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEntry {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "Monu");
		map.put(2, "Mukul");
		map.put(3, "Shuaib");
		map.put(1,"Sachin");
		System.out.println("Iteration of hashmap ");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
