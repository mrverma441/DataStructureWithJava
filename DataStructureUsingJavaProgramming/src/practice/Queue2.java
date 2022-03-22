package practice;
public class Queue2 {
	
	static class Queue
	{
		static int array[];
		static int size;
		static int rear;
		Queue(int size)
		{
			this.size=size;
			array=new int[size];
			rear=-1;
		}
		public static boolean isEmpty()
		{
			return rear==-1;
			
		}
		public static boolean isFull()
		{
			return rear==size-1;
		}
		public static void add(int data)
		{
			if(isFull())
			{
				System.out.println("Queue is full");
				return;
			}
			rear++;
			array[rear]=data;
		}
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return -1;
			}
			int front=array[0];
			for(int i=0;i<rear;i++)
			{
				array[i]=array[i+1];
				
			}
			rear--;
			return front;
			
		}
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("queue is empty");
				return -1;
			}
			return array[0];
		}
	}
	public static void main(String[]args)
	{
	  Queue q=new Queue(5);
	  q.add(1);
	  q.add(2);
	  q.add(3);
	  while(!q.isEmpty())
	  {
		  System.out.println(q.peek());
		  q.remove();
	  }
	  
	  
	}

}
