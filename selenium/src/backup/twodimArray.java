package backup;

public class twodimArray {

	public static void main(String[] args) 
	{
		int[][] sal=new int[2][3];
		//to get the length of the rows
		System.out.println(sal.length);
		//to get the length of the columns
		System.out.println(sal[1].length);
		
		sal[0][0]=1243;
		sal[0][1]=1243;
		sal[1][0]=1243;
		sal[1][1]=1243;
		//to read the values from 2 dimentional arrays
		for (int i = 0; i < sal.length; i++)
		{
			for (int j = 0; j < sal[i].length; j++)
			{
				System.out.println(sal[i][j]);
				
			}
			
		}

	}

}
