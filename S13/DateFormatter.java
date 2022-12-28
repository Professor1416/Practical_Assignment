//S13_Q2
import java.text.SimpleDateFormat;
import  java.util.Date;
public class DateFormatter
{	
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(date);
		System.out.println("Current Date is:"+str);

		sdf  = new SimpleDateFormat("MM-dd-yyyy");
		str = sdf.format(date);
		System.out.println("Current Date is:"+str);

		sdf  = new SimpleDateFormat("EEEE MMMM dd yyyy");
		str = sdf.format(date);
		System.out.println("Current Date is:"+str);

		sdf  = new SimpleDateFormat("E MMMM dd HH:MM:ss z yyyy");
		str = sdf.format(date);
		System.out.println("Current Date and Time is :"+str);

		sdf  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a Z");
		str = sdf.format(date);
		System.out.println("Current Date and Time is:"+str);
	}
}	