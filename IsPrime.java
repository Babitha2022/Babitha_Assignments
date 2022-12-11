package week1.day1;

public class IsPrime 
{

	public static void main(String[] args) 
	{
		int n=18,count=0;
		/*if (n<=1)
		{
			System.out.println("It is not a Prime number");
			return;
		}*/
		for (int i = 2; i < n; i++) 
		{
			if (n%i==0)
			{
				count++;
			}
		}

		if (count>0)
			System.out.println("It is not a Prime number");
		else 
			System.out.println("It is a Prime Number");
	}
}
