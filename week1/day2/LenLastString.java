package week1.day2;

public class LenLastString {

	public static void main(String[] args) {
	
		String name = "Hi Class";
		String[] split = name.split(" ");//split the string
		int length = split[split.length-1].length();
		
		System.out.println(length);
		}


	}

