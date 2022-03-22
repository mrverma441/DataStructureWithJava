package recursion;

public class Permutation {

	public static void PrintPermutation(String str,String Permutation)
	{
		if(str.length()==0)
		{
			System.out.println(Permutation);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char currentchar=str.charAt(i);
			String newstr=str.substring(0,i)+str.substring(i+1);
			PrintPermutation(newstr,Permutation+currentchar);
		}
	}
	public static void main(String[] args) {
		String str="abc";
		PrintPermutation(str,"");

	}

}
