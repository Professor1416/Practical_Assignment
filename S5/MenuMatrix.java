import java.util.Scanner;
public class MenuMatrix
{
	public void addition()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of row and column: ");
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			int[][] m1 = new int [r][c];
			int[][] m2 = new int [r][c];
			
			System.out.println("\nEnter values of matrix M1:\n");
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<c; j++)
				{
					System.out.print("Enter element at index "+(i+1)+" and "+(j+1)+" :");
					m1[i][j] = sc.nextInt(); 
				}		
			}
			System.out.println("\nEnter values of matrix M2:\n");
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<c; j++)
				{
					System.out.print("Enter element at index "+(i+1)+" and "+(j+1)+" :");
					m2[i][j] = sc.nextInt(); 
				}		
			}
			System.out.println("\nSum of M1 and  M2:");
			int [][] sum = new int [r][c];
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<c; j++)
				{
					sum[i][j] = m1[i][j] + m2[i][j];
				}		
			}
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<c; j++)
				{
						System.out.print(sum[i][j]+ " ");
				}
				System.out.println("");	
			}
			sc.close();
	}//END OF ADDITION
	public void Multiplication()
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row and column:\t");
		int r =sc.nextInt();
		int c = sc.nextInt();
		
		int[][] m1=new int[r][c];
		int[][] m2=new int [r][c];
		
		System.out.println("\n Enter the value of matrix M1:\n");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("\nEnter element at index "+(i+1)+ " and " +(j+1)+":");
				m1[i][j] = sc.nextInt(); 
			}	
		}
		System.out.println("\n Enter the value of matrix M2:\n");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("\nEnter element at index "+(i+1)+ " and " +(j+1)+":");
				m2[i][j] = sc.nextInt(); 
			}	
		}
		System.out.println("\nMultiplication of M1 and M2:\n");
		int[][] mul= new int[r][c];
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				for(int k=0; k<c; k++)
				{
					mul[i][j] = mul[i][j]+m1[i][k]*m2[k][j];
				}		
			}
		}
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
					System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
}
public static void main(String[] args)
{
	MenuMatrix m = new MenuMatrix();	
	Scanner sc = new Scanner(System.in);
	System.out.println("\n1.Addtion of Matrix.\n2.Multiplication of Matrix. \n3.Exit.");
	System.out.println("Enter Your Choice");
	int choice = sc.nextInt();
	switch(choice)
	{
		case 1: 
				m.addition();
				break;
			case 2: 
				m.Multiplication();
				break;
			case 3: 
				System.exit(0);
				break;
			default: 
				System.out.println("\n>>Wrong Chioce<<");			
	}

}
}