package practice;

import java.util.Stack;

public class Stack5 {
	public static void pushatbottom(int data,Stack<Integer>s)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		int temp=s.pop();
		pushatbottom(data,s);
		s.push(temp);
	}
	public static void reverse(Stack<Integer>s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int top=s.pop();
		reverse(s);
		pushatbottom(top,s);
	}
	public static void main(String[]args)
	{
		Stack<Integer>s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		reverse(s);
		
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}

}
