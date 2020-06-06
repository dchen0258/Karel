/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class MidpointFinderKarel extends SuperKarel {
	
	// TODO: write the code to implement this program
	public void run() {
		if (frontIsClear()) {
			putBeepersOnFirstRow();
			removeAllBeepersExceptMiddle();	
		} else {
			oneColumnException();
			}
		
	
		
	}
	
// karel starts at the bottom left, facing east
// karel puts beepers on all the row except the first and last
// starts on next row
	public void putBeepersOnFirstRow() {
		while (frontIsClear()) {
			move();
			putBeeper();
		}
		turnAround();
		pickBeeper();
		move();
	}
// karel ends at the end of the row, p
	
// karel starts at the end of the row, facing east
// goes back and forth between the last beepers until the last
// beeper, and it takes it and moves, so it has to move back and put beepr
	

	public void removeAllBeepersExceptMiddle() {
		
		while (beepersPresent()) {
			while (beepersPresent()) {
				move();
			}
			turnAround();
			move();
			pickBeeper();
			move();
		}
		turnAround();
		move();
		putBeeper();
		turnAround();
	}
// karel ends at the middle of the row facing west, with one beeper
// in middle 

// karel starts at the bottom left, facing east
// regular program will not work for one column
// so I make an exception
	public void oneColumnException() {
		putBeeper();
	}
// karel is in the same place, just with a beeper, facing east
}
