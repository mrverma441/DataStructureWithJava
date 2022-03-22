package string;

public class Strings {

	public static void main(String[] args) {
		String fname="Monu";
		String lname="Verma";
		String fullname=fname+"@"+lname;
		System.out.println("fullname is "+fullname);
		System.out.println("Length of the string is "+fullname.length());
		for(int i=0;i<fullname.length();i++)
		{
			System.out.println("at "+i+" location="+fullname.charAt(i));
		}
        String st1="Monu";
        String st2="Monu";
        if(st1.compareTo(st2)==0)
        {
        	System.out.println("Strings are equal");
        }
        else
        {
        	System.out.println("Strings are not equal");
        }
        if(st1==st2)
        {
        	System.out.println("Strings are equal");

        }
        else
        {
        	System.out.println("Strings are not equal");

        }
        if(new String("Monu")==new String("Monu"))
        {
        	System.out.println("Strings are equal");

        }
        else
        {
        	System.out.println("Strings are not equal");

        }
        String sentence="My name is verma monu";
        String sen=sentence.substring(17,sentence.length());
        System.out.println(sen);
        int a=12;
        String s=String.valueOf(a);
        String b="24";
        System.out.println(s+b);
        double s1=Double.parseDouble(s);
        System.out.println(s1);
	}

}
