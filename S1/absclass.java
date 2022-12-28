//S1_Q2
import java.util.*;
abstract class  Staff
{
	protected int id;
	protected String name;
	Staff(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	abstract public void display();
}

class OfficeStaff extends Staff
{
	String dept;
	OfficeStaff(int id, String name, String dept)
	{
		super(id,name);	
		this.dept = dept;
	}
	public void display()
	{
		System.out.println("\t"+id+"\t"+name+"\t"+dept);
		System.out.println("--------------------------------------------");
	}
}

public class absclass
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Number of Employee:");
		int n = sc.nextInt();

		OfficeStaff s[] = new OfficeStaff[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("\nEnter Number-"+(i+1)+"Emplyoee Details\n");
			
			System.out.println("Enter ID");
			int id = sc.nextInt();			
			
			System.out.println("Enter Employee Name:");
			String name = sc.next();

			System.out.println("Enter Dept Name:");
			String dept = sc.next();

			s[i] = new OfficeStaff(id, name, dept);
		}
		System.out.println("\t\t\tEmpolyee Details");
		System.out.println("-------------------------------------");
		System.out.println("\tID\tName\tDept");
		System.out.println("-------------------------------------");

		for(int i=0; i<n; i++)
		{
			s[i].display();
		}
		sc.close();
	}
}