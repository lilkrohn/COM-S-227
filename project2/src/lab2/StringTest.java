package lab2;

public class StringTest 
{

	public static void main(String[] args)
	{
		String message;
		message = "Hello, world!";
		System.out.println(message);
		
		String result1;
		result1 = message.toUpperCase();
		
		String result2;
		result2 = message.substring(0, 5);
		
		String result3;
		result3 = message.replace("o", "*");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	
	}
}
