import java.util.*;
public class Room extends RouteElement{
	private String name_;
	private Coordinates coordinates_;
	private Hashtable<Integer,Corridor> connectedBy_ = new Hashtable<>(); 
	
	public Room() {
		
	}
	
	public Hashtable<Integer,Corridor> getCorridors() {
		return connectedBy_;
	}
	
	public String getName() {
		return name_;
	}
	
	public Coordinates getCoordinates() {
		return coordinates_;
	}
}
