package hw2;

/**
 * Simplified model of American baseball.
 * THIS CODE WILL NOT COMPILE UNTIL YOU HAVE ADDED STUBS FOR ALL METHODS
 * SPECIFIED IN THE JAVADOC
 * 
 * @Swechha Ghimire YOUR NAME HERE
 */

public class test {
	/**
	 * Constant indicating that a pitch results in a ball.
	 */
	public static final int BALL = 0;
	/**
	 * Number of balls causing a player to walk.
	 */
	public static final int MAX_BALLS = 4;
	/**
	 * Number of outs before the teams switch.
	 */
	public static final int MAX_OUTS = 3;
	/**
	 * Number of strikes causing a player to be out.
	 */
	public static final int MAX_STRIKES = 3;
	/**
	 * Constant indicating that a pitch results in an out from a fly ball.
	 */
	public static final int POP_FLY = 2;
	/**
	 * Constant indicating that a pitch results in a strike.
	 */
	public static final int STRIKE = 1;

	private int numBalls;
	private int numStrikes;
	private int numOuts;

	private boolean firstbase = false;
	private boolean secondbase = false;
	private boolean thirdbase = false;

	private int inningVal = 1;
	private boolean isCurrentlyTop = true;
	private boolean gameOver = false;
	private int totalInnings;
	private int scoreforteam0;
	private int scoreforteam1;

	public test(int givenNumInnings) {

		isCurrentlyTop = true;
		totalInnings = givenNumInnings;
	}

	public void advanceRunners(boolean newPlayerOnFirst) {
		if (newPlayerOnFirst == true) {
			firstbase = true;
		} else if (newPlayerOnFirst == false && firstbase == true && secondbase == false && thirdbase == false) {
			firstbase = false;
			secondbase = true;
		} else if (newPlayerOnFirst == false && firstbase == false && secondbase == true && thirdbase == false) {
			secondbase = false;
			thirdbase = true;
		} else if (newPlayerOnFirst == false && firstbase == false && secondbase == false && thirdbase == true) {
			thirdbase = false;
			if (isCurrentlyTop == true) {
				scoreforteam0++;
			} else {
				scoreforteam1++;
			}
		}
	}

	public int getBalls() {
		return numBalls;

	}

	public int getInning() {
		return inningVal;

	}

	public int getOuts() {
		return numOuts;

	}

	public int getScore(boolean team0) {
		if (team0 == true) {
			return scoreforteam0;
		} else {
			return scoreforteam1;
		}
	}

	public int getStrikes() {
		return numStrikes;

	}

	public boolean isOver() {
		return gameOver;

	}

	public boolean isTop() {
		return isCurrentlyTop;

	}

	public void pitch(int outcome) {

		if (outcome == STRIKE) {
			numStrikes += 1;
			if (numStrikes == MAX_STRIKES) {
				numStrikes = 0;
				numOuts += 1;
				numBalls = 0;
			}
		}
		if (outcome == POP_FLY) {
			numOuts += 1;
			numStrikes = 0;
			numBalls = 0;
		}
		if (outcome == BALL) {
			numBalls += 1;
			if (numBalls == MAX_BALLS) {
				numBalls = 0;
			}
		}
		if (numOuts == MAX_OUTS) {
			numStrikes = 0;
			numBalls = 0;
		}

		if (numOuts >= MAX_OUTS) {

			numOuts = 0;
			numStrikes = 0;
			numBalls = 0;

			if (isCurrentlyTop == true) {
				isCurrentlyTop = false;
			} else {
				isCurrentlyTop = true;
				inningVal += 1;
			}
			/*
			 * If the player gets 4 balls which is the max number of balls then the values
			 * reset
			 */
			if (outcome == MAX_BALLS) {
				numStrikes = 0;
				numBalls = 0;
			}
		}
		if (inningVal > totalInnings) {
			inningVal--;
			gameOver = true;
		}
	}
//check if these values align with the spec doc
	public void pitchWithHit(int numBases) {
		// 1 = single 
		if (numBases == 1) {
			firstbase = true; 
			
		}
		// 2 = double 
		else if (numBases == 2) {
			secondbase = true; 
		}
		//3 = triple
		else if (numBases == 3) {
			thirdbase = true; 
		}
		//4 = homerun 
		else if (numBases == 4) {
			firstbase = false; 
			secondbase = false; 
			thirdbase = false;
			if (isCurrentlyTop == true) {
				scoreforteam0++;
			} else {
				scoreforteam1++;
			}
			
		}
	}
// still have to work on 
	public void pitchWithHitAndOut(int numBases, int whichBaseFielded) {
		if(numBases == 1 && whichBaseFielded < 2) {
			firstbase = true; 
		}
	}

	public boolean playerOnFirst() {
		return firstbase;
	}

	public boolean playerOnSecond() {
		return secondbase;
	}

	public boolean playerOnThird() {
		return thirdbase;
	}

	/**
	 * Returns a three-character string representing the players on base, in the
	 * order first, second, and third, where 'X' indicates a player is present and
	 * 'o' indicates no player. For example, the string "XXo" means that there are
	 * players on first and second but not on third.
	 * 
	 * @return
	 * @return three-character string showing players on base
	 */
	public String getBases() {
		return (playerOnFirst() ? "X" : "o") + (playerOnSecond() ? "X" : "o") + (playerOnThird() ? "X" : "o");
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

}
