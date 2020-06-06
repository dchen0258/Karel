
/*
 * TODO: comment this program	
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		if (frontIsClear()) {
			putBeeper();
			placeBeepersInCheckerboardFormation();
		} else {
			oneColumnException();
		}

	}
// karel starts at the bottom left corner facing east
	// karel puts a beeper every two blocks checking each time it moves
	//it also places a beeper at the very start
	public void placeBeepersInCheckerboardFormation() {
		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();

			}
			turnOnRightSide();
			turnOnLeftSide();
		}

	}
	// karel ends at the top left corner facing north 
	
	//karel starts of the end of a row facing east
	//this is to turn on the right side and it checks
	//if there is a beeper on the last square 
	public void turnOnRightSide() {
		if (frontIsBlocked() && facingEast()) {
			if (beepersPresent()) {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnLeft();
					move();
					putBeeper();
				}
// Karel ends at the start of the row facing west 
// and places beeper down on the second block of the row

			} else {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnLeft();
					putBeeper();
				}

			}
// places beeper down on the first block of the row
			
// Karel starts at the end of a row facing west
// Karel turning left, checks if there is a beeper on the last one
		}
	}

	public void turnOnLeftSide() {
		if (frontIsBlocked() && facingWest()) {
			if (beepersPresent()) {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
					move();
				}
// karel ends at the start of the row facing east
			} else {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
					putBeeper();
				}

			}
//karel ends at the start of the row facing east
//karel places beeper on the first block of the row 
		}
	}
// karel starts at the bottom facing east
// if there is one column, then the program won't work
// so I made one just for one column
	public void oneColumnException() {
		putBeeper();
		turnLeft();
		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}
		}

	}
// karel finishes at the top facing north
}
