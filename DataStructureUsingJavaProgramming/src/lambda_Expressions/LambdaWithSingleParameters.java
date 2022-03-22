package lambda_Expressions;

public class LambdaWithSingleParameters {
interface Sayable1
{
	public String say(String name);
	
}
	public static void main(String[] args) {

		//Lambda Expression with single parameter
		Sayable1 s1=(name)->
		{
			return "Hello "+name;
		};
		System.out.println(s1.say("Monu"));
		Sayable1 s2=name->
		{
			return "Hello "+name;
		};
		System.out.println(s2.say("Mukul"));
		
	}

}
