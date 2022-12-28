//S11_Q2
class InvalidUsernameException extends Exception
{
	String msg = "Invalid Username";
	public String toString()
	{
		return msg;
	}
}
class InvalidPasswordException extends Exception
{
	String msg = "Invalid Password";
	public String toString()
	{
		return msg;
	}
}
class user
{
	String username;
	String password;
	
	user()
	{
		username = "dsk";
		password = "dsk@123";
	}
	user(String u, String p)
	{
		username = u;
		password = p;
	}
}

class password
{
	public static void main(String[] args)
	{
		user u1 = new user(args[0], args[1]);
		user u2 = new user();
		String s1 = u1.username;
		String s2 = u2.username;
		String s3 = u1.password;
		String s4 = u2.password;
		try
		{
			if(s1.equals(s2))
			{
				System.out.println("Username Match...!");
			}
			else
			{
				throw new InvalidUsernameException();
			}
		}
		catch (InvalidUsernameException e)
		{
			System.out.println(e);
		}
		try
		{
			if(s3.equals(s4))
			{
				System.out.println("Password Matched..!");
			}
			else
			{
				throw new InvalidPasswordException();
			}
		}
		catch (InvalidPasswordException e)
		{
			System.out.println(e);
		}
	}
}
