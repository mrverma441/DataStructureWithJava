package stringbuilder;

public class Reverse {

	public static void main(String[] args) {
		StringBuilder obj=new StringBuilder("Hello");
		for(int i=0;i<obj.length()/2;i++)
		{
			int front=i;
			int back=obj.length()-1-i;
			char frontchar=obj.charAt(front);
			char backchar=obj.charAt(back);
			obj.setCharAt(front, backchar);
			obj.setCharAt(back, frontchar);
		}
		 System.out.println(obj);
	}

}
