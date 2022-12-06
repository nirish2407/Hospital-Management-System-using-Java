package age_exception2;
import java.lang.Exception;
import java.util.Scanner;

class MyException extends Exception
{
	MyException(String message)
	{
		super(message);
	}
}
public class TestMyException
{
	Scanner sc=new Scanner(System.in);
	int age2;
	public int catch_age(int x)
	{
		age2=x;
		try
		{
			if(x>100)
			{
				throw new MyException("Invalid Age");
			}
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Please enter the correct age");
			age2=sc.nextInt();
		}
		return age2;
	}
}
