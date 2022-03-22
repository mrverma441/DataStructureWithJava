package lambda_Expressions;
interface Drawable1
{
	public void draw();
	
}
public class InterfaceWithoutUsingLambda {

	public static void main(String[] args) {

		int width=10;
		//Without lambda,Drawable implementation using anonymous class
		Drawable1 d=new Drawable1()
				{
			public void draw()
			{
				System.out.println("Drawing "+width);
			}
				};
		d.draw();
	}

}
