/*

The WESPath class.  An WESPath object has three ends.

 */

public class WESPath extends SwitchPath {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4283767017166560122L;
	/**
	 * Construct a WESPath in a specified location
	 * @param loc the loctaion that this path should be placed
	 * @param map A Map object is made up of Paths, and has zero or more people in it.
	 */
	public WESPath(GridLocation loc, Map map) {
		super(Direction.WEST, Direction.EAST, Direction.SOUTH, loc, map);
		startAngle = 0;
	}

	@Override
	protected void initCoordinates() {
		x1 = 0.0;
		y1 = 0.5;
		x2 = 1.0;
		y2 = 0.5;
		x3 = -0.5;
		y3 = 0.5;
	}
	/**
	 * 	Return true if d is valid for a TreasureHunter to this Path, return false and
	 * 	print an error otherwise.
	 * @param newTreasureHunter a TreasureHunter
	 * @return if the exit exists at a certain direction
	 */
	@Override
	public synchronized boolean enter(TreasureHunter newTreasureHunter) {
		DirEnum nextDir = getNextDirEnum(newTreasureHunter);

		if (goingStraight) {
			if (nextDir == DirEnum.WEST || nextDir == DirEnum.EAST) {
				return super.enter(newTreasureHunter);
			}
		} else {
			if (nextDir == DirEnum.SOUTH || nextDir == DirEnum.WEST) {
				return super.enter(newTreasureHunter);
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "WESPath";
	}

}
