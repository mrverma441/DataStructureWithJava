package recursion;

public class Count_Total_Path_In_A_Maze {
public static int CountPaths(int i,int j,int n,int m)
{
	if(i==n||j==m)
	{
		return 0;
	}
	if(i==n-1&&j==m-1)
	{
		return 1;
		
	}
	//move downwords
	int downpaths=CountPaths(i+1,j,n,m);
	//move right
	int rightpaths=CountPaths(i,j+1,n,m);
	return downpaths+rightpaths;
}

	public static void main(String[] args) {
		int n=3,m=3;
		System.out.println(CountPaths(0,0,n,m));

	}

}
