package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
//Reverse of a linked list using Collections framework function
public class LL3 {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.reverse(list);
		System.out.println(list);

	}

}
