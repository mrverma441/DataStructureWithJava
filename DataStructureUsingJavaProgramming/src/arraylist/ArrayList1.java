package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	

	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<Integer>();
		ArrayList<String>list2=new ArrayList<String>();
		ArrayList<Boolean>list3=new ArrayList<Boolean>();
		//Add the elements
		list1.add(1);
		list1.add(2);
		list1.add(3);
		//Get Elements
		System.out.println(list1.get(0));
		
		//Add elements in between
		list1.add(1,5);
		System.out.println(list1);
		//Set the elements
		list1.set(0, 55);
		System.out.println(list1);
		//delete elements
		list1.remove(3);
		System.out.println(list1);
		
		//size of arraylist
		System.out.println(list1.size());
		
		//loops or iteration in the arrayList
		for(int i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i)+" ");
			
			
		}
		//Sorting in the arraylist
		Collections.sort(list1);
		System.out.println(list1);

		
		
		
		

	}

}
