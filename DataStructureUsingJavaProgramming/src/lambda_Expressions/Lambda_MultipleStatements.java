package lambda_Expressions;

interface int1
{
	String say(String Message);
}
public class Lambda_MultipleStatements {

	public static void main(String[] args) {

		int1 i=(Message)->
		{
			String str1="I would like to say ";
			String str2=str1+Message;
			return str2;
		};
		System.out.println(i.say("Time is precious"));
	}

}
