import java.util.ArrayList;
import java.util.List;
public class Map {
	private String name_;
	private List<Room> rooms_ = new ArrayList<>();
	
	public Map() {
		
	}
	
	public List<Room> getRooms() {
		return rooms_;
	}
}
