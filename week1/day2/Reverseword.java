package week1.day2;

public class Reverseword {

	public static void main(String[] args) {
		String name = "Amazon development center, Chennai";
		String lowercase = name.toLowerCase();
		String[] words = lowercase.split(" ");
		for (int i = words.length-1; i >=0; i--) {
			System.out.print(words[i]);

		}
	}

}
