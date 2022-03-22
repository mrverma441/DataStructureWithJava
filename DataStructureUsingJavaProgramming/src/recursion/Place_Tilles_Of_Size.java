package recursion;

public class Place_Tilles_Of_Size {
	public static int PlaceTiles(int n,int m)
	{
		if(n==m)
		{
			return 2;
		}
		if(n<m)
		{
			return 1;
		}
		//vertical placements
		int vertical=PlaceTiles(n-m,m);
		
		//Horizontal Placement
		int horizontal=PlaceTiles(n-1,m);
		
		return vertical+horizontal;
		
		
	}

	public static void main(String[] args) {
		int n=4,m=3;
		System.out.println(PlaceTiles(n,m));

	}

}
