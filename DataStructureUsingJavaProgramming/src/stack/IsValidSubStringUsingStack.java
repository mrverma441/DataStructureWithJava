package stack;
import java.util.Scanner;
import java.util.Stack;
public class IsValidSubStringUsingStack {
	public static int FindMAxLen(String s)
	{
		int ans=0;
		Stack<Integer>S1=new Stack<Integer>();
		S1.push(-1);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				S1.push(i);
			}
			else
			{
				S1.pop();
				if(!S1.isEmpty())
				{
					int temp=i-S1.peek();
					ans=Math.max(ans, temp);
					
				}
				else
				{
					S1.push(i);
				}
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s=obj.next();
		System.out.println(FindMAxLen(s));

	}

}
