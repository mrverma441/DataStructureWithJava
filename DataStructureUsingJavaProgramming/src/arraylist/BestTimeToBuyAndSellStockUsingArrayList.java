//package arraylist;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BestTimeToBuyAndSellStockUsingArrayList {
//	static ArrayList<ArrayList<Integer>>StockBuySell(int[]array,int n){
//	   ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
//	   int buy=0,sell=0;
//	   int flag=0;// to check stock is buy or not
//	   for(int i=0;i<n-1;i++)
//	   {
//		   if(flag==0)
//		   {
//			   if(array[i]<array[i+1])
//			   {
//				   buy=i;
//				   flag=1;
//			   }
//			   
//		   }
//		   else
//		   {
//			  // if(array[buy]<array[i]&&array[i]>array[i+1])
//		   }
//	   }
//	
//		
//	}
//
//	public static void main(String[] args) {
//		Scanner obj=new Scanner(System.in);
//		System.out.println("Enter the length of the array");
//		int n=obj.nextInt();
//		System.out.println("Enter the elements in the array");
//		int[]array=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			array[i]=obj.nextInt();
//		}
//
//	}
//
//}
