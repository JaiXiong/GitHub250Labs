import java.util.Scanner;

public class Lab05
{
	public static void main(String [] args)
	{
		double singleP = 40;
		double doubleP = 25;
		double anti = 12.5;
		double tint = 9.99;
		Scanner stdIn = new Scanner(System.in);
		int option1;
		int option2;
		double cost = 0;

		do
		{
			System.out.print("What kind of glasses would you like? Single(1) or Double(2)? ");
			option1 = stdIn.nextInt();
		}
		while (option1 < 0 || option1 >= 2);

		do 
		{
			System.out.print("what kind of coating would you like? Anti(1) or Tint(2)? ");
			option2 = stdIn.nextInt();
		}
		while (option2 < 0 || option2 >= 2);

		if (option1 == 1)
		{
			if (option2 == 1)
			{
				cost = singleP + anti;
			}
			else 
			{
				cost = singleP + tint;
			}
		}
		else if (option1 == 2)
		{
			if (option2 == 1)
			{
				cost = doubleP + anti;
			}
			else
			{
				cost = doubleP + tint;
			}
		}
		
		System.out.println("Your total cost is $"+cost);
		stdIn.close();
	}
}
