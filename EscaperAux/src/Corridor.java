import java.util.*;

public class Corridor extends RouteElement{
	private int length_;
	private Hashtable<Integer,Room> leadingTo_ = new Hashtable<>();
	
	public Corridor() {
		
	}
	
	public Hashtable<Integer,Room> getRooms() {
		return leadingTo_;
	}
	
	public int getLength() {
		return length_;
	}
}
