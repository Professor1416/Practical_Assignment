import java.util.Scanner;
public class transpose
{

	public void transpose()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of row and column: ");
	int r= sc.nextInt();
	int c = sc.nextInt();
	
	int[][] m = new int[r][c];
	System.out.println("Enter value of matrix:\n");
	for(int i=0; i<r; i++)
	{
		for(int j=0; j<c; j++)
		{
				System.out.print("Enter element at index "+(i+1)+" and "+(j+1)+" :");
				m[i][j]=sc.nextInt();
		}
	}
	System.out.println("\nEntered Matrix..\n");
	for(int i=0; i<r; i++)
	{
		for(int j=0; j<c; j++)
		{
				System.out.print(m[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("\nTranspose Matrix..\n");
	for(int i=0; i<r; i++)
	{
		for(int j=0; j<c; j++)
		{
				System.out.print(m[j][i]+" ");
		}
		System.out.println();
	}
	sc.close();
	}
	public static void main(String[] args)
	{
		transpose t = new transpose(); 
		t.transpose();
}
}