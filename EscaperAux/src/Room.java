import java.util.*;
public class Room extends RouteElement{
	private String name_;
	private Coordinates coordinates_;
	private List<Corridor> connectedBy_ = new ArrayList<>(); 
	
	public Room() {
		
	}
	
	public List<Corridor> getCorridors() {
		return connectedBy_;
	}
	
	public String getName() {
		return name_;
	}
	
	public Coordinates getCoordinates() {
		return coordinates_;
	}
}
