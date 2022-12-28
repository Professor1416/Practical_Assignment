//Assignment 4 set A a
import java.util.*;
class HealthException extends Exception
{
	String msg = "I'm sorry..! Your Covid Positive(+)\nNeed To Hpspital italized\n";
	public String toString()
	{
		return msg;
	}
}

class patient
{
	String pname;
	byte page;
	int p_oxy_level;
	int p_HRTC_report;
	
	patient(String p, byte a, int ol, int pr)
	{
		pname = p;
		page = a;
		p_oxy_level = ol;
		p_HRTC_report = pr;
	}
	
	public void display()
	{
		System.out.println("\n\t\tPatitent Details\n");
		System.out.println("Patitent Name\t Patitent Age \t Oxygen_Level\tHRTC_Report");
		System.out.println(pname+"\t\t"+page+"\t\t"+p_oxy_level+"\t\t"+p_HRTC_report);
	}
}

public class Hospital
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter Patitent Name:");
			String pn = sc.next();
			System.out.println("Enter Patitent Age:");
			Byte pa = sc.nextByte();
			System.out.println("Enter Oxygen Level:");
			int ol = sc.nextInt();
			System.out.println("Enter HRTC Report:");
			int pr = sc.nextInt();

			patient p = new patient(pn, pa, ol, pr);
			if(p.p_oxy_level < 95 && p.p_HRTC_report > 10)
			{
				throw new HealthException();
			}
			p.display();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}
}

