package sorting;

public class MergeSort {
	public static void divide(int array[],int si,int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int mid=si+(ei-si)/2;
		divide(array,si,mid);
		divide(array,mid+1,ei);
		conquer(array,mid,si,ei);
		
		
	}
	public static void conquer(int array[],int mid,int si,int ei)
	{
		int merged[]=new int [ei-si+1];
		int index1=si;
		int index2=mid+1;
		int x=0;
		while(index1<=mid&&index2<=ei)
		{
			if(array[index1]<=array[index2])
			{
				merged[x++]=array[index1++];
				
			}
			else
			{
				merged[x++]=array[index2++];
			}
		}
		while(index1<=mid)
		{
			merged[x++]=array[index1++];

		}
		while(index2<=ei)
		{
			merged[x++]=array[index2++];

		} 
		for(int i=0,j=si; i<merged.length;i++,j++)
		{
			array[j]=merged[i];
		}
	}

	public static void main(String[] args) {
		int []array= {6,3,9,5,2,8};
		int n=array.length;
		divide(array,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();

	}

}
