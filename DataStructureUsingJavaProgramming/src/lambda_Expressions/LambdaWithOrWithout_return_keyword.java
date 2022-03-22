package lambda_Expressions;

interface addable
{
	int add(int a,int b);
}
public class LambdaWithOrWithout_return_keyword {

	public static void main(String[] args) {

		addable a1=(a,b)->(a+b);
		System.out.println("Addition without return keywword "+a1.add(20, 10));
		addable a2=(a,b)->
		{
			return a+b;
		};
		System.out.println("Addition with return keyword is "+a2.add(10, 10));
	}

}
