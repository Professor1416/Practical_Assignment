/*S1Q1.Write a Program to print all Prime numbers in an array of ‘n’ elements. (use command line
arguments)*/
class prime
{
	public static int isPrime(int i)
	{
		int j;
		for (j = 2; j < i / 2 + 1; j++) 
		{
			if (i % j == 0) 
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args)
	{
		if (args.length == 1) 
		{
			int n = Integer.parseInt(args[0]);
			for (int i = 2; i <= n; i++) 
			{
				if (isPrime(i) == 1)
					System.out.print(i + ", ");
			}
			System.out.println();
			//findPrimes(n);
		}
		else
			System.out.println("Operation Can't Perform..!");
	}
}
