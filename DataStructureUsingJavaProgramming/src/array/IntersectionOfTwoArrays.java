package array;
import java.util.HashSet;
import java.util.Scanner;
public class IntersectionOfTwoArrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
    	int count=0;
    	HashSet<Integer>Set1=new HashSet<Integer>();
    	HashSet<Integer>Set2=new HashSet<Integer>();
    	for(int i=0;i<n;i++)
    	{
    		Set1.add(a[i]);
    	}
    	for(int i=0;i<m;i++)
    	{
    		Set2.add(b[i]);
    	}
    	for(int ans:Set1)
    	{
    		if(Set2.contains(ans))
    		{
    			count++;
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n and m");
		int n=obj.nextInt();
		int m=obj.nextInt();
		System.out.println("Enter the first array");
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the second array");
		int[]b=new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=obj.nextInt();
		}
		System.out.println(NumberofElementsInIntersection(a,b,n,m));
	}
}