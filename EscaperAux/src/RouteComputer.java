
public class RouteComputer {
	private Map map_;
	
	public RouteComputer(Map map) {
		map_ = map;
	}
	
	public Map computeRoute(int fromLocation) {
		// Get the starting room
		Room currentRoom = null;
		for (Room room : map_.getRooms()) {
			if (room.getID() == fromLocation) {
				currentRoom = room;
				break;
			}
		}
		
		assert currentRoom != null;
		
		// Empty map to fill and provide as output
		Map resultMap = new Map();
		
		
		
		 
		return resultMap;
	}
	
}
