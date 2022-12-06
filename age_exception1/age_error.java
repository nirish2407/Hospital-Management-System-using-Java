package age_exception1;
import java.util.Scanner;

public class age_error
{
	public int age_check(String a)
	{
		Scanner n=new Scanner(System.in);
		int age1;
		try
		{
			age1=Integer.parseInt(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Age : "+a);
			System.out.println("Please enter the correct age");
			age1=n.nextInt();
		}
		return age1;
	}
}
