package hw2;

/**
 * Simplified model of American baseball.
 * 
 * THIS CODE WILL NOT COMPILE UNTIL YOU HAVE ADDED STUBS FOR ALL METHODS
 * SPECIFIED IN THE JAVADOC
 * 
 * @author Lillian Krohn
 */
public class CS227Baseball {
	/**
	 * Constant indicating that a pitch results in a ball.
	 */
	public static final int BALL = 0;

	/**
	 * Constant indicating that a pitch results in a strike.
	 */
	public static final int STRIKE = 1;

	/**
	 * Constant indicating that a pitch results in an out from a fly ball.
	 */
	public static final int POP_FLY = 2;

	/**
	 * Number of strikes causing a player to be out.
	 */
	public static final int MAX_STRIKES = 3;

	/**
	 * Number of balls causing a player to walk.
	 */
	public static final int MAX_BALLS = 4;

	/**
	 * Number of outs before the teams switch.
	 */
	public static final int MAX_OUTS = 3;

	// instance variables

	private int innings; //current number of innings

	private int totalInnings; //total updated number of innings

	private int balls; //current number of balls

	private int strikes; //current number of strikes

	private int outs; //current number of outs

	private int team0score = 0; //score begins at 0 for a new game

	private int team1score = 0; //score begins at 0 for a new game

	private boolean positionTB = true; // tracks whether it is the top or bottom of the inning

	private boolean first; //first base

	private boolean second; //second base

	private boolean third; //third base

	// Constructor:

	/**
	 * Constructs a game that has the given number of
	 * innings and starts at the top of inning 1.
	 * @param givenNumInnings
	 */
	public CS227Baseball(int givenNumInnings) {
		positionTB = true; //game starts at the top of the inning
		totalInnings = givenNumInnings;
		innings = 1; // innings begin at 1
	}

	/**
	 * Returns true if the game is over, false otherwise.
	 * 
	 * @return innings > totalInnings
	 */
	public boolean isOver() {
		return innings > totalInnings;
	}

	/**
	 * Returns whether there is a player on first base.
	 * 
	 * @return first
	 */
	public boolean playerOnFirst() {
		return first;
	}

	/**
	 * Returns whether there is a player on second base.
	 * 
	 * @return second
	 */
	public boolean playerOnSecond() {
		return second;

	}

	/**
	 * Returns whether there is a player on third base.
	 * 
	 * @return third
	 */
	public boolean playerOnThird() {
		return third; //
	}

	/**
	 * switches the teams and resets the balls, strikes and outs
	 */
	private void switchTeam() {
		strikes = 0;
		outs = 0;
		balls = 0;
		if (positionTB) {
			positionTB = false;
		} else {
			positionTB = true;
			innings++; // adds an inning
		}
	}

	/**
	 * Returns the current inning. Innings are numbered starting at 1. When the game
	 * is over, this method returns the games total number of innings, plus one.
	 * 
	 * @return innings
	 */
	public int getInning() {
		return innings;
	}

	/**
	 * Returns true if it's the first half of the inning (team 0 is at bat).
	 * 
	 * @return positionTB
	 */
	public boolean isTop() {
		return positionTB;
	}

	/**
	 * Returns the number of outs for the current batter.
	 * 
	 * @return outs
	 */
	public int getOuts() {
		return outs;
	}

	/**
	 * Returns the number of strikes for the current batter.
	 * 
	 * @return strikes
	 */
	public int getStrikes() {
		return strikes;
	}

	/**
	 * Returns the number of balls for the current batter.
	 * 
	 * @return balls
	 */
	public int getBalls() {
		return balls;
	}

	/**
	 * Returns the score of the indicated team, where an argument of true indicates
	 * team 0 (batting in the top of the inning) and an argument of false indicates
	 * team 1 (batting in the bottom of the inning). If game is a CS227Baseball
	 * object, the call game.getScore(game.isTop()) always returns the score for the
	 * team that is currently at bat.
	 * 
	 * @param teamO
	 * @return
	 */
	public int getScore(boolean teamO) {
		if (teamO) {
			return team0score;
		} else {
			return team1score;
		}
	}

	/**
	 * Pitch not resulting in a hit. The argument for outcome should be one of the
	 * three predefined constants BALL, STRIKE, or POP_FLY. A detailed description
	 * of these values is described in the section entitled "Balls, strikes, and
	 * outs" in the assignment pdf. This method may update the count of balls,
	 * strikes, and/or outs, and may cause existing players on base to advance in
	 * the case of a walk, and causes the teams to switch if the number of outs
	 * reaches MAX_OUTS. This method does nothing if the game is over or if the
	 * argument is not one of the values BALL, STRIKE, or POP_FLY.
	 * 
	 * @param outcome
	 */
	public void pitch(int outcome) {
		if (isOver())
			return;
		if (outcome == STRIKE) {
			strikes++;
			if (strikes == MAX_STRIKES) {
				outs++;
				strikes = 0;
				balls = 0;
			}
		} else if (outcome == BALL) {
			balls++;
			if (balls == MAX_BALLS) {
				advanceRunners(true);
				balls = 0;
				strikes = 0;
			}
		} else if (outcome == POP_FLY) {
			outs++;
			strikes = 0;
			balls = 0;
		}

		if (outs == MAX_OUTS) {
			switchTeam();
			first = false;
			second = false; third = false;

		}
	}

	/**
	 * Pitch resulting in a hit where no player is out. The argument for numBases
	 * should be 1, 2, 3, or 4, indicating a single, double, triple, or home run.
	 * The batter and all players currently on base must advance the given number of
	 * bases (possibly resulting in one or more runs). This method does nothing if
	 * the game is over or if the argument is not one of the values 1, 2, 3, or 4.
	 * 
	 * @param numBases
	 */
	public void pitchWithHit(int numBases) {
		if (isOver())
			return;
		advanceRunners(true);
		if (numBases > 1) {
			advanceRunners(false);
		}
		if (numBases > 2) {
			advanceRunners(false);
		}
		if (numBases > 3) {
			advanceRunners(false);
		}

		strikes = 0;
		balls = 0;
	}

	/**
	 * Pitch resulting in a hit and a possible out. Advancement of runners is the
	 * same as pitchWithHit() except that it might cause a player to be out. The
	 * argument for whichBaseFielded indicates the base to which the ball is fielded
	 * (1, 2, 3, or 4). If the batter or one of the players on base arrives at the
	 * base whichBaseFielded after advancing exactly numBases, then that player is
	 * out. That is, we assume that the time it takes to field the ball to the
	 * indicated base is the same as the time it takes the runners to advance
	 * numBase bases. If a player is put out when advancing to home, that run is not
	 * counted. (Note that at most one out is possible, i.e. there are no double or
	 * triple plays. Also, there are no special exceptions for counting runs when
	 * it's the third out.) This method does nothing if the game is over or if
	 * either argument is not one of the values 1, 2, 3, or 4.
	 * 
	 * @param numBases
	 * @param whichBaseFielded
	 */
	public void pitchWithHitAndOut(int numBases, int whichBaseFielded) {
		boolean homeOut = false; // tells whether there is an out at home or not
		if (isOver())
			return;

		if (whichBaseFielded == 4) {
			homeOut = (numBases == 1 && third) || (numBases == 2 && second) || (numBases == 3 && first)
					|| (numBases == 4);
		}
		pitchWithHit(numBases);

		if (whichBaseFielded == 1 && first) {
			first = false;
			outs++;
		} else if (whichBaseFielded == 2 && second) {
			second = false;
			outs++;
		} else if (whichBaseFielded == 3 && third) {
			third = false;
			outs++;
		} else if (whichBaseFielded == 4 && homeOut) {
			outs++;
			updateScore(-1);
		}

		if (outs == 3) {
			switchTeam();
		}

	}

	/**
	 * Advances all players on base by one base, updating the score if there is
	 * currently a player on third.
	 * 
	 * @param newPlayerOnFirst
	 */
	public void advanceRunners(boolean newPlayerOnFirst) {
		int runs = 0; // keeps track of the runs in order to then update score
		if (third) {
			third = false;
			runs++; //indicates a run which will then increase the score
		}
		if (second) {
			second = false;
			third = true;
		}
		if (first) {
			first = false;
			second = true;
		}
		if (newPlayerOnFirst) {
			first = true;
		}
		updateScore(runs);
	}

	/**
	 * updates the teams's scores by a certan amount of runs
	 * @param amount
	 */
	private void updateScore(int scoreValue) {
		if (positionTB) {
			team0score += scoreValue;
		} else {
			team1score += scoreValue;
		}
	}

	/**
	 * Returns a three-character string representing the players on base, in the
	 * order first, second, and third, where 'X' indicates a player is present and
	 * 'o' indicates no player. For example, the string "XXo" means that there are
	 * players on first and second but not on third.
	 * 
	 * @return three-character string showing players on base
	 */
	public String getBases() {
		return (playerOnFirst() ? "X" : "o") + (playerOnSecond() ? "X" : "o") + (playerOnThird() ? "X" : "o");
	}

	/**
	 * Returns a one-line string representation of the current game state. The
	 * format is:
	 * 
	 * <pre>
	 *    ooo Inning:1 (T) Score:0-0 Balls:0 Strikes:0 Outs:0
	 * </pre>
	 * 
	 * The first three characters represent the players on base as returned by the
	 * <code>getBases()</code> method. The 'T' after the inning number indicates
	 * it's the top of the inning, and a 'B' would indicate the bottom.
	 * 
	 * @return one-line string representation of the game state
	 */
	public String toString() {
		String bases = getBases();
		String topOrBottom = (isTop() ? "T" : "B");
		String fmt = "%s Inning:%d (%s) Score:%d-%d Balls:%d Strikes:%d Outs:%d";
		return String.format(fmt, bases, getInning(), topOrBottom, getScore(true), getScore(false), getBalls(),
				getStrikes(), getOuts());
	}

	/**
	 * Returns a multi-line string representation of the current game state. The
	 * format is:
	 * 
	 * <pre>
	 *     o - o    Inning:1 (T)
	 *     |   |    Score:0-0
	 *     o - H    Balls:0 Strikes:0 Outs:0
	 * </pre>
	 * 
	 * The 'T' after the inning number indicates it's the top of the inning, and a
	 * 'B' would indicate the bottom.
	 * 
	 * @return multi-line string representation of current game state
	 */
	public String toDisplayString() {
		String firstChar = (playerOnFirst() ? "X" : "o");
		String secondChar = (playerOnSecond() ? "X" : "o");
		String thirdChar = (playerOnThird() ? "X" : "o");
		String topOrBottom = (isTop() ? "T" : "B");
		String firstLine = String.format("%s - %s    Inning:%d (%s)\n", secondChar, firstChar, getInning(),
				topOrBottom);
		String secondLine = String.format("|   |    Score:%d-%d\n", getScore(true), getScore(false));
		String thirdLine = String.format("%s - H    Balls:%d Strikes:%d Outs:%d\n", thirdChar, getBalls(), getStrikes(),
				getOuts());
		return firstLine + secondLine + thirdLine;
	}

}