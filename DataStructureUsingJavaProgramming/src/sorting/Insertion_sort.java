package sorting;
public class Insertion_sort {
	public static void printarray(int[]array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		int []array= {7,8,3,1,2};
		for(int i=1;i<array.length;i++)
		{
			int current=array[i];
			int j=i-1;
			while(j>=0 &&current<array[j])
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=current;
		}
		printarray(array);

	}

}
