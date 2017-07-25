import java.util.*;
class Program3
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the year");
		int num = sc.nextInt();
		if(num >= 1000 || num <= 9999)
		{
			if((num % 400) == 0)
			{
				System.out.println("The given year is leap year");
			} 
			else if((num % 100) == 0)
			{
				System.out.println("The given year is not leap year");
			}
			else if ((num % 4) == 0)
			{
				System.out.println("The given year is leap year");

			}
			else
			{
				System.out.println("The given year is not leap year");
			}
		}
		else
		{
			System.out.println("Invalid number");
		}
        }

}
