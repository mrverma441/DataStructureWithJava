package array;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum_Or_KeyPair_ByUsingHashMap {
static boolean hasArrayTwoCandidates(int[]array,int n,int x)
{
	HashMap<Integer,Integer>map=new HashMap<>();
	for(int i=0;i<n;i++)
	{
		if(map.containsKey(array[i]))
		{
			map.put(array[i], array[i]+1);
		}
		else
		{
			map.put(array[i],1);
		}
	}
	for(int i=0;i<n;i++)
	{
		int temp=x-array[i];
		if(map.containsKey(temp))
		{
//			if(temp!=array[i]||map.get(array[i]>1))
//			{
//				return true;
//			}
		}
	}
	return false;
}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println("Enter the target value");
		int x=obj.nextInt();
		System.out.println(hasArrayTwoCandidates(array,n,x));
	}

}
