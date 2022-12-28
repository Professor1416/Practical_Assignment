/*S3Q1.Write a program to accept ‘n’ name of cities from the user and sort them in ascending
 order.*/
import java.util.*;
public class City
{
	String a[];
	int n;
	City()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many city you want to enter : ");
		n = sc.nextInt();
		a = new String[n];
        for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+" City Name: ");
			a[i]=s.next();
		}		
	}
	void display()
	{
		String temp="";
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("\nSorted Cities are ");
		for(int i=0;i<n;i++)
		{
			System.out.println((i+1)+"."+a[i]);	
		}	
	}

	public static void main(String args[])
	{
		City c = new City();
		c.display();
	}
}
