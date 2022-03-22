package lambda_Expressions;
@FunctionalInterface
interface Drawable
{
	public void draw();
	
}
public class Lambda1 {

	public static void main(String[] args) {
		int width=10;
		//With lambda
		Drawable d2=()->{
			System.out.println("Drawing "+width);
		};
		d2.draw();
		

	}

}
