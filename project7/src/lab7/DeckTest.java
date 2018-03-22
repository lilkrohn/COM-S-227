package lab7;
public class DeckTest
{
  public static void main(String[] args)
  {
    Deck deck = new Deck();
    Card[] hand = deck.select(51);
    System.out.println(Card.toString(hand));
  }
}