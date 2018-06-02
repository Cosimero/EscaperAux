import java.util.*;
public class RouteElement {
	private int id_;
	private int capacity_;
	private int fullness_;
	private List<Exit> exits_ = new ArrayList<>();
	
	public RouteElement() {
		
	}
	
	public int getID() {
		return id_;
	}
}
