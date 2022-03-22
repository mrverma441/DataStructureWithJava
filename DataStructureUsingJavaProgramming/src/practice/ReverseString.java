package practice;

public class ReverseString {
	public static void ReversString(String str,int index)
	{
		if(index==0)
		{
			System.out.print(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		ReversString(str,index-1);
	}

	public static void main(String[] args) {
		String str="ABCDEFGH";
		ReversString(str,str.length()-1);

	}

}
