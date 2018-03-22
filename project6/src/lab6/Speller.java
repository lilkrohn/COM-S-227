package lab6;

import java.util.Scanner;

public class Speller {

	public static String Sname(String name){
		String result = "";
		System.out.print("Please enter name: ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		char C1 = name.charAt(0);
		result = result + C1;

		for (int i = 1; i < name.length(); i++) {
			char C2 = name.charAt(i);
			char C3 = name.charAt(i - 1);

			if (C3 == ' ') {
				result = result + C2;
			}
		}
		return(result);

	}
	
	public static int Vowel(String word){
		
		int total = 0;
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if("aeiouAEIOU".indexOf(ch) >= 0)
				{
					total++;
				}
		
	
		}
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(Sname("Lily Krohn"));
		System.out.println(Vowel("Lily Krohn"));
	}
}
