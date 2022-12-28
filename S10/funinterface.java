//S10_Q1
import java.util.*;
interface function
{
	void cube(int n);
}

class demo implements function
{
	public void cube(int n)
	{
		System.out.println("Cube: "+(n*n*n));
	}
}

public class funinterface
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Finding Cube:");
		int n = sc.nextInt();
		demo d = new demo();
		d.cube(n);
		sc.close();
	}
}