package practice;

public class SubsequencesOfString {
	public static void sub(String str,int index,String newString)
	{
		if(index==str.length())
		{
			System.out.println(newString);
			return;
		}
		char currentchar=str.charAt(index);
		
		// to be 
		sub(str,index+1,newString+currentchar);
		
		//not to be
		sub(str,index+1,newString);
	}

	public static void main(String[] args) {
		String str="abc";
		sub(str,0,"");

	}

}
