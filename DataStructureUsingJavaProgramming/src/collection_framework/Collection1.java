package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection1 {
	

	public static void main(String[] args) {
		int []array1= {25,80,4,21,60,90,100,2,44,14};
		ArrayList<String>list=new ArrayList<String>();
		list.add("Dog");
		list.add("Cat");
		list.add("Ball");
		list.add("Apple");
		//list.add(null);
		
		
		
		Arrays.sort(array1);
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.println(list);

	}

}
