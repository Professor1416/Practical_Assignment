import java.util.*;
class continent
{
	String Cname;
}

class country extends continent
{
	String Couname;
}

class state extends country
{
	String Sname;
	String Pname;

	state(String c1, String c2, String c3, String c4)
	{
		Cname = c1;
		Couname = c2;
		Sname = c3;
		Pname = c4;
	}
	void display()
	{
		System.out.println("Continent\tCountry\t\tState\tPlace");
		System.out.println(Cname+"\t\t"+Couname+"\t\t"+Sname+"\t"+Pname);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Continent Name");
		String c1 = sc.next();

		System.out.println("Enter Country Name");
		String c2 = sc.next();

		System.out.println("Enter State Name");
		String c3 = sc.next();

		System.out.println("Enter Place Name:");
		String c4 = sc.next();

		state s = new state(c1, c2, c3, c4);
		s.display();
		sc.close(); 
	}
}