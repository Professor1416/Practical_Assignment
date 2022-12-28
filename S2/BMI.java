/*S2Q1.Write a program to read the First Name and Last Name of a person, his weight and height using
command line arguments. Calculate the BMI Index which is defined as the individual's body mass
divided by the square of their height. (Hint : BMI = Wts. In kgs / (ht)2
 )*/
public class BMI
{
   public static void main(String args[])
   {
      if (args.length <= 4) 
      {
         String fname = args[0];
         String lname = args[1];
         int weight = Integer.parseInt(args[2]);
         Float height = Float.parseFloat(args[3]);
         Float BMI = weight / (height * height);
         //System.out.println("Name:"+fname+" "+lname);
         System.out.print("BMI of "+fname+" "+lname +" is "+BMI + " kg/m2");

      }
      else
         System.out.println("Operation Can't Perform..!");
   }   
}