import java.util.*;
public class Room extends RouteElement{
	private String name;
	private Coordinates coordinates_;
	private List<Corridor> connectedBy_ = new ArrayList<>(); 
	
	public Room() {
		
	}
}
