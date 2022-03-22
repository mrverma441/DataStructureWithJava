package stringbuilder;

public class SB {

	public static void main(String[] args) {
		StringBuilder obj=new StringBuilder("Monu");
		System.out.println(obj);
		System.out.println(obj.charAt(0));
		obj.setCharAt(0, 'P');
		System.out.println(obj);
		obj.insert(2, 'n');
		System.out.println(obj);
		obj.delete(2, 3);
		System.out.println(obj);
		obj.append("verma");
		System.out.println(obj);

	}

}
