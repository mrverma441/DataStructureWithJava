package recursion;

public class Check_Sorted_Array {

	public static boolean SortedArray(int[]array,int index)
	{
		if(index==array.length-1)
		{
			return true;
		}
		if(array[index]<array[index+1])
		{
			return SortedArray(array,index+1);
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int[]array= {1,3,3};
		System.out.println(SortedArray(array,0));

	}

}
