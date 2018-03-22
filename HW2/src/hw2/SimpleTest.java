package hw2;

import static hw2.CS227Baseball.*;

public class SimpleTest {
	public static void main(String[] args) {
		CS227Baseball game = new CS227Baseball(3);
		System.out.println(game);
		System.out.println(game.toDisplayString());
		game.advanceRunners(true);
		System.out.println(game.toDisplayString());
		game.advanceRunners(true);
		System.out.println(game.toDisplayString());
		game.advanceRunners(false);
		System.out.println(game.toDisplayString());
	}
}