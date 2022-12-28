//S14_Q2
import java.util.*;
import SY.SYMarks;
import TY.TYMarks;
public class Student
{
		int rollno;
		String studentname, grade;
		SYMarks sym;
		TYMarks tym;
		Student(int r, String name, SYMarks s, TYMarks t)
		{
			rollno = r;
			studentname = name;
			sym = s;
			tym = t;
		}
		public String toString()
		{
			return  rollno+"\t"+studentname+"\t"+sym+"\t"+tym+"\t";
		}
		void calculategrade()
		{
			int total = sym.ComputerTotal + tym.Theory + tym.Practicals;
			double per = total / 3;
			if(per >= 70)
			{
					System.out.println("\tA");
			}
			else			
			if(per >= 60)
			{
					System.out.println("\tB");
			}
			else
			if(per >= 50)
			{
					System.out.println("\tC");
			}
			else
			if(per >= 40)
			{
					System.out.println("\tPass");
			}
			else
					System.out.println("\tFail");
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("How Many Students:");
			int n = sc.nextInt();

			Student[] stud = new Student[n];
			
			for(int i=0; i<n; i++)
			{
				System.out.println("Enter "+(i+1)+"Student data:");
				System.out.println("Enter roll_no:\t");
				int roll_no = sc.nextInt();
				System.out.println("Enter Student Name:\t");
				String name = sc.next();
				
				System.out.println("Enter SY Marks (Comp Total, Maths Total, Elec Total)");
				int ct = sc.nextInt();
				int mt = sc.nextInt();
				int et = sc.nextInt();
				SYMarks sym = new SYMarks(ct,mt,et);
				
				System.out.println("Enter TY Marks(Theory and Practicals)");
				int th = sc.nextInt();
				int pr = sc.nextInt();
				TYMarks tym = new TYMarks(th,pr);

				stud[i] = new Student(roll_no, name, sym,tym);
			}	
			System.out.println("\n>>SUDENT DETAILS<<");
			System.out.println("R.no\tName\tCompTotal\tMathsTotal\tElecTotal\tTheory\tPracticals\t\tGrade");
			for(int i=0; i < n; i++)
			{
				System.out.print(stud[i]);
				stud[i].calculategrade();
			}
			sc.close();	
		}
}


