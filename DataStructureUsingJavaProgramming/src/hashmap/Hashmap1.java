package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {

		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(1,"Monu");
		map.put(2, "Mukul");
		map.put(3, "Shuaib");
		map.put(4, "Sachin");
		
		System.out.println("Iterating the hashmap");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+"->"+m.getValue());
		}
	}

}
