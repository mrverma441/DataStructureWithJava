package array;

import java.util.Scanner;

public class PairsOfSong {
	 public static int numPairsDivisibleBy60(int[] time) {
	        int count=0;
	        for(int i=0;i<time.length;i++)
	        {
	            for(int j=i+1;j<time.length;j++)
	            {
	                if((time[i]+time[j])%60==0)
	                {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length=obj.nextInt();
		System.out.println("Enter the elements");
		int[]array=new int[length];
		for(int i=0;i<length;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println(numPairsDivisibleBy60(array));

	}

}
