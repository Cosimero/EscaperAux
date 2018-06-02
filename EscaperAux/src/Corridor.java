import java.util.*;

public class Corridor extends RouteElement{
	private int length_;
	private Hashtable<Integer,Room> leadingTo_ = new Hashtable<>();
	
	public Corridor(int length, int ID, int capacity, int fullness, boolean hasExit) {
		super(ID,capacity,fullness,hasExit);
		length_ = length;
	}
	
	public Hashtable<Integer,Room> getRooms() {
		return leadingTo_;
	}
	
	public int getLength() {
		return length_;
	}
}
