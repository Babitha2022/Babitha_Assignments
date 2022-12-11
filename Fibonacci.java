package week1.day1;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		int a=0, b=1; //a=First-number, b=Second-Number
		System.out.println(a);
		System.out.println(b);
	
		for (int c=0;c<145;c++)//c=sum
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
		
	}

}
