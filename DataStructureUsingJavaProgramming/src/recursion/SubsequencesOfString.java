package recursion;

public class SubsequencesOfString {
	public static void Subsequences(String str,int index,String newString)
	{
		if(index==str.length())
		{
			System.out.println(newString);
			return;
		}
		char currentchar=str.charAt(index);
		//   to be
		Subsequences(str,index+1,newString+currentchar);
		
		//or not to be
		
		Subsequences(str,index+1,newString);

	}

	public static void main(String[] args) {
		String str="abc";
		Subsequences(str,0,"");

	}

}
