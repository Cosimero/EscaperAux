import java.util.*;

public class EscapeRoute {
	List<RouteElement> route_ = new ArrayList<>();
	
	public EscapeRoute(RoomWrapper exit) {
		RoomWrapper current = exit;
		while(current.getPreviousRoom() != null) {
			route_.add(current.getRoom());
			route_.add(current.getPreviousCorridor());
			current = current.getPreviousRoom();
		}
		Collections.reverse(route_);
	}
	
	// When exiting through corridor
	public EscapeRoute(RoomWrapper last, Corridor exit) {
		this(last);
		route_.add(exit); // Append one more corridor to the end
	}
}
