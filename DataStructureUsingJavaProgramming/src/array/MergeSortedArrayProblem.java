package array;

import java.util.Scanner;

public class MergeSortedArrayProblem {
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i=m-1;
	        int j=n-1;
	        int k=m+n-1;
	        while(i>=0&&j>=0)
	        {
	            if(nums1[i]>nums2[j])
	            {
	                nums1[k--]=nums1[i--];
	                
	            }
	            else
	            {
	                nums1[k--]=nums2[j--];
	            }
	        }
	        while(i>=0)
	        {
	            nums1[k--]=nums1[i--];
	            
	        }
	        while(j>=0)
	        {
	            nums1[k--]=nums2[j--];
	        }
	    }
	 public static void printarray(int[]arrayres,int n,int m)
	 {
		 for(int i=0;i<n+m;i++)
		 {
			 System.out.println(arrayres[i]+" ");
		 }
	 }
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array1=new int[m];
		for(int i=0;i<m;i++)
		{
			array1[i]=obj.nextInt();
		}
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		int[]array2=new int[n];
		for(int i=0;i<n;i++)
		{
			array2[i]=obj.nextInt();
		}
		merge(array1,m,array2,n);
		int[]arrayres=new int[n+m];
		printarray(arrayres,n,m);
		

	}

}
