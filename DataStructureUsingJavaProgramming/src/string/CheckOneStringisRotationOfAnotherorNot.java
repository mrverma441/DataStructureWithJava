package string;

public class CheckOneStringisRotationOfAnotherorNot {

	public static void main(String[] args) {
		String str1="abcde",str2="deabc";
		if(str1.length()!=str2.length())
		{
			System.out.println("Second string is not a rotation of first string");
			
		}
		else
		{
			str1=str1.concat(str2);
			if(str1.contains(str2))
			{
				System.out.println("Second string is a rotation of first string");
			}
			else
			{
				System.out.println("Second string is not a rotation of first string");
			}
		}

	}

}
