package recursion;

public class Moveallxtolast {

	public static void MoveAllX(String str,int index,int count,String newString)
	{
		if(index==str.length())
		{
			for(int i=0;i<count;i++)
			{
				newString+='x';
			}
			System.out.println(newString);
			return;
		}
		char currentchar=str.charAt(index);
		if(currentchar=='x')
		{
			count++;
			MoveAllX(str,index+1,count,newString);
		}
		else
		{
			
			newString+=currentchar;
			MoveAllX(str,index+1,count,newString);

		}
	}
	public static void main(String[] args) {
		String str="axbcxxdefghxijkxlmnxopqx";
		MoveAllX(str,0,0,"");


	}

}
