
public class Main {

	public static void main(String[] args) {
		// Get map from files
		Parser parser = new Parser();
		Map map = parser.parseMapFile();
		parser.updateFullnesses(map);
		
		// Draw it out
		MapDrawer drawer = new MapDrawer();
		drawer.drawMap(map);
		int location = drawer.getIDOfUsersLocation();
		
		// Compute route
		RouteComputer computer = new RouteComputer(map);
		EscapeRoute bestRoute = computer.computeRoute(location);
		
		// Give the computed route back to the drawer
		
		// Show user the computed route
		
		

	}

}
