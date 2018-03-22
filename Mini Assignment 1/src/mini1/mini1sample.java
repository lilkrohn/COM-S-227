package mini1;

/**
 * Try saying that five times fast.
 */
//public class LoopTheLoopyLoopingLoopers
{

  /**
   * Private constructor means this class cannot be instantiated.
   */
 // private LoopTheLoopyLoopingLoopers()
  {  
    // do nothing
  }
  
  
  /**
   * Determines the number of iterations of Newton's method
   * required to approximate the square root of x within
   * the given bound.  Newton's method starts out by 
   * setting the initial approximate <em>answer</em> to x.  
   * Then in each iteration, <em>answer</em> is replaced by 
   * the quantity <em>(answer + x / answer) / 2.0</em>.
   * The process stops when the difference between 
   * x and <em>(answer * answer)</em> is strictly less than
   * the given bound <code>err</code>.  The method
   * returns the number of iterations required.
   * The given value x must be non-negative.
   * <p>
   * For example, given x = 10 the first three iterations
   * of Newton's method produce the approximate values 
   * 5.5, 3.66, and 3.20. Those three values squared are
   * 30.29, 13.39, and 10.21, respectively.
   * Therefore <code>countIterations(10, 1.0)</code>
   * returns 3, since it takes 3 iterations to get the result 10.21
   * that is within 1.0 of x.  
   * On the other hand, <code>countIterations(10, 200)</code> returns 0,
   * since 10 * 10 = 100 is already within 200 units of x = 10.
   * @param x
   *   value whose square root is to be approximated
   * @param err
   *   given bound for the approximation
   * @return
   *   number of iterations required to get an approximation
   *   whose square is within the given bound of x
   */
  public static int countIterations(double x, double err)
  {
	  	double x = 
    		double err = 
    return 0;
  }

  /**
   * Returns a string with runs of consecutive characters removed.
   * For example, <code>eliminateRuns("abbbccbbd")</code> returns 
   * the string "abcbd".
   * @param s
   *   given string (possibly empty)
   * @return
   *   string similar to s but with runs removed
   */
  public static String eliminateRuns(String s)
  {
    // TODO
    return null;
  }
  
  /**
   * Returns the second largest value in a list of numbers,
   * where the list is given as a string of text containing integer
   * values separated by arbitrary whitespace.  Duplicates are allowed, so
   * the largest and second largest numbers may be the same; for example,
   * given the string "17  137  42  137", the method returns 137. 
   * The behavior is undefined if the provided string contains any 
   * non-numeric values or contains fewer than two numbers.
   * @param text
   *   string of text containing at least two numbers separated by whitespace
   * @return
   *   second largest value in the string
   */ 
  public static int findSecondLargest(String text)
  {
    // TODO
    return 0;
  }
  
  /**
   * Determines whether the given string of text represents a 
   * <em>Lucas sequence</em>, where the given text consists of integer
   * values separated by arbitrary whitespace.  A Lucas sequence
   * is any sequence of numbers in which each value (other than
   * the first and second) is the sum of the previous two values.
   * The Fibonacci sequence is one example of a Lucas sequence.
   * Another one would be "-2 1 -1 0 -1 -1 -2 -3 -5 -8".
   * This method returns true if the sequence has fewer than 3 numbers.
   * The behavior is undefined if the provided string contains any non-numeric
   * values.
   * @param text
   *   string of text (possibly empty) containing numbers separated by whitespace
   * @return
   *   true if the given sequence of numbers is a Lucas sequence, 
   *   false otherwise
   */
  public static boolean isLucasSequence(String text)
  {
    // TODO
    return false;
  }

  /**
   * Returns the character that occurs most frequently in 
   * the given string.  If several characters occur with 
   * the same maximum frequency, returns the one that
   * occurs first in the string.  The string must be nonempty.
   * <p>
   * For example, given the string "banana" the method returns 'a'.
   * Given the string "abcbcbbcca" the method returns 'b'.
   * @param s
   *   nonempty string
   * @return
   *   most frequently occurring character in s
   */
  public static char findMostFrequentCharacter(String s)
  {
    // TODO
    return 0;
  }

  /**
   * Counts the number of times that one string occurs as a substring in
   * another, optionally allowing the occurrences to overlap.  For
   * example:
   * <ul>
   * <li><code>countOccurrences("aa", "aaaaa", false)</code> returns 2
   * <li><code>countOccurrences("aa", "aaaaa", true)</code> returns 4
   * <li><code>countOccurrences("aa", "ababab", true)</code> returns 0
   * </ul>
   * 
   * @param t
   *   string we are looking for ("target")
   * @param s
   *   string in which we are looking ("source")
   * @param allowOverlap
   *   true if occurrences of t are allowed to overlap
   * @return
   *   number of times t occurs in s as a substring
   */
  public static int countOccurrences(String t, String s, boolean allowOverlap)
  {
    // TODO
    return 0;
  }
  
  /**
   * Merges two strings together, using alternating characters from each,
   * except that runs of the same character are kept together.  For example,
   * <ul>
   * <li><code>mergePreservingRuns("abcde", "xyz") returns "axbyczde"
   * <li><code>mergePreservingRuns("abbbbcde", "xyzzz") returns "axbbbbyczzzde"
   * </ul>
   * Either or both of the strings may be empty.  If the first string
   * is nonempty, its first character will be first in the returned string.
   * @param t
   *   first string
   * @param s
   *   second string
   * @return
   *   string obtained by merging characters from t and s, preserving runs
   */
  public static String mergePreservingRuns(String t, String s)
  {
    // TODO
    return null;
  }
  
  /**
   * Separates s into two strings, each made of alternating characters
   * from s, except that runs of the same character are kept together.
   * The two strings are concatenated with a space between them to make
   * a single returned string. If the given string is empty, the returned 
   * string is a single space.
   * For example,
   * <ul>
   * <li><code>takeApartPreservingRuns("abcdefa")</code> returns "acea bdf"
   * <li><code>takeApartPreservingRuns("aabcccddddefa")</code> returns "aaccccea bddddf"
   * </ul>
   * @param s
   *   any string
   * @return
   *   pair of strings obtained by taking alternating characters from s, 
   *   keeping runs of the same character together, concatenated with 
   *   one space between them into a single string 
   */
  public static String takeApartPreservingRuns(String s)
  {
    // TODO
    return null;
  }

}