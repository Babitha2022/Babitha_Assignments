package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String Ftext = "Thing";
		String Stext = "Night";

		int length1 = Ftext.length();
		int length2 = Stext.length();
		System.out.println(length1);
		System.out.println(length2);

		if (length1==length2)
		{
			System.out.println("Length of the strings are same");
			char[] charArray = Ftext.toCharArray();
			char[] charArray2 = Stext.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			if (Arrays.equals(charArray, charArray2)) {
				System.out.println("String is an anagram");
			}
		}
		}
	}

	
