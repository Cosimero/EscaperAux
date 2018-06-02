import java.util.*;

public class Corridor extends RouteElement{
	private int length_;
	private List<Room> leadingTo_ = new ArrayList<>();
	
	public Corridor() {
		
	}
	
	public List<Room> getRooms() {
		return leadingTo_;
	}
	
	public int getLength() {
		return length_;
	}
}
