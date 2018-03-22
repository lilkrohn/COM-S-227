package lab8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordNumberer
{
  public static void main(String[] args) throws FileNotFoundException
  {
	  File f1 = new File("story.txt");
	  Scanner s1 = new Scanner(f1);
	  int count = 0;
	  Scanner line = null;
	  
	  while(s1.hasNextLine()){
	  	line = new Scanner( s1.nextLine());
	  	while (line.hasNext()){
	  		line.next();
	  		count +=1;
	  	}
	  	System.out.println(count);
	  	count = 0;
	  }
	
    s1.close();
   System.out.print("Done");
   
  }
}

