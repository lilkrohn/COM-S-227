package lab5;

import java.util.Scanner;
public class CopyCenter {

	public static int findCopyCost(int numCopies) {
		
		int copy1 = 0;
		int copy2 = 0;
		int copy3 = 0;

		if (numCopies <= 10 && numCopies > 0) {
			copy1 = (int)(numCopies * .15);
		}
		else if(numCopies > 10 && numCopies <= 110){
			copy2 = (int)(numCopies * .12);
		}
		else if(numCopies > 110){
			copy3 = (int)(numCopies * .08);
		}
		
		int priceCopy = copy1 + copy2 + copy3;
		return priceCopy;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of copies: ");
		int x = s.nextInt();
		System.out.print("Price: ");
	}

}
