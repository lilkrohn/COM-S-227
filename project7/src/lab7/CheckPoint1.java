package lab7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class CheckPoint1 {

	public static void main(String[] args){
		
		 //String s = "3 5 7 9 12";
		 //int[] result = readNumbers(s);
		 //System.out.println(Arrays.toString(result));
		 
		 int[] arr = {-1, 5, -2, -4, 6, 3}; 
		 int[] end = getPositiveNumbers(arr);
		 System.out.println(Arrays.toString(getPositiveNumbers(end)));
		 System.out.println(Arrays.toString(randomExperiment(10, 10)));
	}
	/**public static int[] readNumbers(String text)
		  {
		    Scanner scanner = new Scanner(text);
		    int count = 0;
		    while (scanner.hasNextInt())
		    {
		      scanner.nextInt();
		      count +=1;
		    }
		    
		    int[] nums = new int[count];
		    scanner = new Scanner(text);
		    int index = 0;
		    while (scanner.hasNextInt())
		    {
		      int num = scanner.nextInt();
		      nums[index] = num;
		      index += 1;
		    }
		    return nums;
		  }**/
	
	
	public static int[] getPositiveNumbers(int[] numbers) {
		int count = 0;
	    for (int i = 0; i < numbers.length; i += 1)
	    {
	      if (numbers[i] > 0)
	      {
	        count += 1;
	      }
	    }
	    
	    int[] newArray = new int[count];
	    int i = 0;
	    for(int k = 0; k < numbers.length; k += 1 )
	    {
	    	if(numbers[k] > 0)
	    	{
	    		newArray[i] = numbers[k];
	    		i++;
	    	}
	    }
	    return newArray;    
	  }
	
	
	public static int[] randomExperiment(int max, int iters){
		max = 10;
		iters = 1000;
		Random rand = new Random();
		int[] counter = new int[max];
		for(int i = 0; i < iters; i += 1)
		{
			counter[rand.nextInt(max)] +=1;
		}
			return counter;
		}
		
	}
