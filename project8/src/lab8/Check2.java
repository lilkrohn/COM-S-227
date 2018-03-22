package lab8;

import java.util.ArrayList;

public class Check2
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
       // list.add("Bye");
        list.add("Bye");
        list.add(" ");
        //loops through the string list printing the words 
        for(String word: list)
        {
            System.out.println(word);
        }
        removeDuplicates(list);
        for(String word: list)
        {
            System.out.println(word);
        }
    }
    public static void removeDuplicates(ArrayList<String> words)
    {
    	//adds all the words from the arraylist into a new array list if they have not been used
        ArrayList<String> listCopy = new ArrayList<String>();
		
        for(String word: words)
        {
            if(!listCopy.contains(word))
            {
                listCopy.add(word);
            }
        }
        words.clear();
        //copies the new array into the old
        words.addAll(listCopy);
    }
}