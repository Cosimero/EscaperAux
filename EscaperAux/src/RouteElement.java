
public class RouteElement implements Comparable<RouteElement> {
	private int id_;
	private int capacity_;
	private int fullness_;
	private boolean hasExit_;
	
	public RouteElement(int ID, int capacity, int fullness, boolean hasExit) {
		id_ = ID;
		capacity_ = capacity;
		fullness_ = fullness;
		hasExit_ = hasExit;
	}
	
	public int getID() {
		return id_;
	}
	
	public boolean hasExit() {
		return hasExit_;
	}
	
	public boolean isFull() {
		return capacity_ <= fullness_;
	}

	@Override
	public int compareTo(RouteElement o) {
		return id_ - o.getID();
	}
}
