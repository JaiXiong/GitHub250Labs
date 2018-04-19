import java.util.Scanner;

public class Lab06 {

	public static void main(String [] args)
	{
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Enter a number to start:");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= (n-i); j++)
			{
				System.out.print(" ");
			}
			for (int a = i; a >= 1; a--)
				System.out.print(a);
			System.out.println();
		}
		stdIn.close();
	}
	

}
