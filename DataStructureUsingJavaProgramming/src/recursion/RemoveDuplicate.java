package recursion;

public class RemoveDuplicate {
	public static boolean[]map=new boolean[26];
	public static void RemoveDuplicates(String str,int index,String newString)
	{
		if(index==str.length())
		{
			System.out.print(newString);
			return;
		}
		char currentchar=str.charAt(index);
		if(map[currentchar-'a'])
		{
			RemoveDuplicates(str,index+1, newString);
		}
		else
		{
			newString+=currentchar;
			map[currentchar-'a']=true;
			RemoveDuplicates(str,index+1, newString);

		}
		
		
	}

	public static void main(String[] args) {
		String str="abbccda";
		RemoveDuplicates(str,0,"");

	}

}
