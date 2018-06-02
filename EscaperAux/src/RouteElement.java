
public class RouteElement implements Comparable<RouteElement> {
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

	@Override
	public int compareTo(RouteElement o) {
		return id_ - o.getID();
	}
}
