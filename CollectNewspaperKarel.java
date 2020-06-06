
/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run() {
		moveToNewspaper();
		pickUpNewspaper();
		returnToStartingPoint();

	}

	private void moveToNewspaper() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();

	}

	private void pickUpNewspaper() {
		pickBeeper();
	}

	private void returnToStartingPoint() {
		turnAround();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
		putBeeper();
	}
}
