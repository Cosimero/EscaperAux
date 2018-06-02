import java.util.ArrayList;
import java.util.List;
public class Map {
	private String name_;
	private List<Room> rooms_ = new ArrayList<>();
	
	public Map(String name) {
		name_=name;
	}

	public List<Room> getRooms_() {
		return rooms_;
	}

	public void setRooms_(List<Room> rooms_) {
		this.rooms_ = rooms_;
	}
	
	
}
