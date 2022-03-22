package lambda_Expressions;
interface addition
{
	public int add(int a,int b);
}
interface multiplication
{
	public int mul(int a,int b);
}
public class LambdaWithMultipleParameters {

	public static void main(String[] args) {
		addition s1=(a,b)->
		{
			return a+b;
		};
		int c=s1.add(5, 5);
		System.out.println("Summation is "+c);
		
		addition s2=(a,b)->(a+b);
		System.out.println("summation is "+s2.add(10, 20));
		
		addition s3=(a,b)->(a*b);
		System.out.println("Multiplication is "+s3.add(10, 30));
		
		multiplication m1=(a,b)->(a*b);
		System.out.println("Multiplicaation is "+m1.mul(20, 30));
		
		

	}

}
