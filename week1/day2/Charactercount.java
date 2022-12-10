package week1.day2;

public class Charactercount {

	public static void main(String[] args) {
		String company ="hexaware";
		char expected = 'e';
		int count = 0;
		//print how many times expected character present
char[] charArray = company.toCharArray();
for (int i = 0; i <charArray.length; i++)
{
	if (charArray[i]==expected)
		count++;
			
}
System.out.println(count);			

	}

}
