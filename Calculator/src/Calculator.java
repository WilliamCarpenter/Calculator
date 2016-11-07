import java.util.Scanner;

public class Calculator
	{

		public static void main(String[] args)
			{
				calculateNumber();
			}
		public static double add(double a, double b)
		{
			return a + b;
		}
		public static double subtract(double a, double b)
		{
			return a - b;
		}
		public static double multiply(double a, double b)
		{
			return a*b;
		}
		public static double divide(double a, double b)
		{
			return a/b;
		}
		public static void calculateNumber()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Choose number 1");
			double a = userInput.nextInt();
			System.out.println("Choose number 2");
			double b = userInput.nextInt();
			System.out.println("What operation would you like to do? Enter the number.");
			System.out.println("1. Addition");
//			"\n1. Addition" + "\n2. Subtraction" + "/n3. Multiplication" + "/n4. Division");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			
			int operation = userInput.nextInt();
			if (operation == 1)
				{
					System.out.println("Your answer is " + add(a,b));
				}
			else if (operation == 2)
			{
				System.out.println("Your answer is " + subtract(a,b));
			}
			else if (operation == 3)
				{
					System.out.println("Your answer is " + multiply(a,b));
				}
			else if (operation == 4)
				{
					System.out.println("Your answer is " + divide(a,b));
				}
			
		}

	}
