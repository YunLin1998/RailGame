/*

The SEPath class.  A SEPath object has ends at the south
and east.

 */
public class SEPath extends CornerPath {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6754241322561311322L;
	/**
	 * Construct a SEPath in a specified location
	 * @param loc the loctaion that this path should be placed
	 * @param map A Map object is made up of Paths, and has zero or more people in it.
	 */
	public SEPath(GridLocation loc, Map map) {
		super(Direction.SOUTH, Direction.EAST, loc, map);
		startAngle = 90;
	}

	@Override
	protected void initCoordinates() {
		x1 = 0.5;
		y1 = 0.5;
	}

	@Override
	public String toString() {
		return "SEPath";
	}

}
