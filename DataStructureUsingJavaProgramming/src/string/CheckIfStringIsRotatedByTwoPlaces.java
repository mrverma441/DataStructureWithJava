package string;

public class CheckIfStringIsRotatedByTwoPlaces {

	public static boolean isRotated(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		if(l1!=l2)
		{
			return false;
		}
		if((s1.substring(2)+s1.substring(0,2)).equals(s2))
		{
			return true;
		}
		return (s1.substring(l1-2)+s1.substring(0, l1-2)).equals(s2);
	}
	public static void main(String[] args) {

		String s1="amazon";
		String s2="azonam";
//		System.out.println(s1.substring(2));
//		System.out.println(s1.substring(0, 2));
//		System.out.println(s1.substring(s1.length()-2));
//		System.out.println(s1.substring(0,s1.length()-2));
		System.out.println(isRotated(s1,s2));
		
		
	}

}
