
/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		fillColumn();
		moveAndFillNextColumns();
	}

	
	
// karel starts facing East in the bottom left Corner
// goes up column checking if there is beeper,
// if there isn't it puts one, goes back to start of row
	
	public void fillColumn() {
		turnLeft();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}

		if (noBeepersPresent()) {
			putBeeper();
		}
		turnAround();
		while (frontIsClear()) {
			move();
		}
	}
	// Karel ends at the end of the first column facing east
	
	// Karel starts at the end of the first column facing east
	// moves four times to next column
	// fills it out and moves back and repeats it until it ends
	public void moveAndFillNextColumns() {
		turnLeft();
		while (frontIsClear()) {
			moveToNextColumn();
			turnLeft();
			
	

			while (frontIsClear()) {
				if (noBeepersPresent()) {
					putBeeper();
				}
				move();
			}

			if (noBeepersPresent()) {
				putBeeper();
			}
			turnAround();
			while (frontIsClear()) {
				move();
			}
			turnLeft();

		}
	}
	//karel ends at the end of the last column facing east
	
	//karel starts at the end of a column facing east
	//moves four times
	public void moveToNextColumn() {
		for (int j = 0; j < 4; j++) {
			move();
		}
	}
	// karel ends at the bottom of the next column 
}
