package array;

import java.util.Scanner;

public class SortedAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      int size = sc.nextInt();
	      int numbers[] = new int[size];
	 
	      //input
	      for(int i=0; i<size; i++) {
	          numbers[i] = sc.nextInt();
	      }
	 
	      boolean order=true;
	      for(int i=0;i<numbers.length-1;i++)
	      {
	    	  if(numbers[i]>numbers[i+1])
	    	  {
	    		  order=false;
	    	  }
	      }
	      if(order)
	      {
	    	  System.out.println("Ascending");
	      }
	      else
	      {
	    	  System.out.println("Descending");
	      }
	     

	}

}
