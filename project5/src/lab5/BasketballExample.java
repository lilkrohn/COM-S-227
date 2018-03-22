package lab5;

public class BasketballExample
{
  public static void main(String[] args)
  {
    Basketball b = new Basketball(5);
    
    // A newly constructed basketball should not be dribbleable
    System.out.println(b.isDribbleable());
    System.out.println("Expected: false");
    
    // A newly constructed basketball should have the diameter it was constructed with
    System.out.println(b.getDiameter());
    System.out.println("Expected: 5.0");
    
    // After inflating, the basketball should be dribbleable
    b.inflate();
    System.out.println(b.isDribbleable());
    System.out.println("Expected: true");
    
    // After inflating, the basketball should still have the diameter it was constructed with
    System.out.println(b.getDiameter());
    System.out.println("Expected: 5.0");
  }
}