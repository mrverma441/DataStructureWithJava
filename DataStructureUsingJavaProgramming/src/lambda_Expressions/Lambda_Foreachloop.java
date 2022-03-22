package lambda_Expressions;

import java.util.ArrayList;
import java.util.List;

public class Lambda_Foreachloop {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Monu");
		list.add("Mayank");
		list.add("Mukul");
		list.add("Jai");
		System.out.println(list);
		list.forEach((n)->System.out.println(n));
		

	}

}
