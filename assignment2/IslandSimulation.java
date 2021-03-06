// Simulate people running around a path.

import java.awt.*;

// class IslandSimulation
// ----------------------------------------------------------------------
// The class IslandSimulation contains all the methods and instance variables
// neccessary to keep track of and run the island simulation.

public class IslandSimulation {
	// The Paths on which the Persons run.
	private Map map;

	/**
	 * Initialize IslandSimulation
	 */
	public IslandSimulation() {
		map = new Map();
		map.setSize(540, 400);
		map.setLocation(0, 0);
		map.setBackground(Color.WHITE);
	}

	/**
	 * Add a Person to the game
	 * @param player the Peron to be added
	 * @param dir the direction
	 * @param loc the location
	 */
	public void addPlayer(Person player, Direction dir, GridLocation loc) {
		player.addIntoMap(map, dir, loc);
	}

	public void play() {
		map.setVisible(true);
	}

	// main
	// ------------------------------------------------------------------
	// This is where it all starts.
	public static void main(String[] args) {
		Person playerA = new Person("Person 1", 1, 620);
		Person playerB = new Person("Person 2", 2, 350);

		IslandSimulation island = new IslandSimulation();
		island.addPlayer(playerA, Direction.EAST, new GridLocation(2,
				2));
		island.addPlayer(playerB, Direction.SOUTH, new GridLocation(
				1, 5));
		island.play();
	}

}
