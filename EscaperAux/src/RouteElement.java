
public class RouteElement {
	private int id_;
	private int capacity_;
	private int fullness_;
	private boolean hasExit;
	
	public RouteElement() {
		
	}
	
	public int getID() {
		return id_;
	}
	
	public boolean hasExit() {
		return hasExit;
	}
	
	public boolean isFull() {
		return capacity_ <= fullness_;
	}
}
