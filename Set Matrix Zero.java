public class Main {
	static void changerow(int i,int[][] mat)
	{
		for(int j=0;j<mat[0].length;j++)
		{
			if(mat[i][j]!=0)
			{
				mat[i][j]=-1;
			}
		}
	}
	static void changecol(int j,int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			if(mat[i][j]!=0)
			{
				mat[i][j]=-1;
			}
		}
	}
		
	
public static void main(String[] args) {
		int [][] mat = {{1,0,0},{1,1,1}};
		int row = mat.length;
		int col = mat[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(mat[i][j]==0)
				{
				      changerow(i,mat);
				      changecol(j,mat);
				}
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(mat[i][j]!=1)
				{
					mat[i][j]=0;
				}
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println("");
		}
		
	}
};