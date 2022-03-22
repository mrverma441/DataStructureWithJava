package practice;
//Time Complexity is O(n^2)
public class Selectionsort {
	public static void main(String[]args)
	{
		int[]array= {6,4,2,3,5,1,13};
		for(int i=0;i<array.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[smallest]>array[j])
				{
					smallest=j;
				}
			}
			int temp=array[smallest];
			array[smallest]=array[i];
			array[i]=temp;
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
