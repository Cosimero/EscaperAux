import java.util.ArrayList;
import java.util.List;
public class Map {
	private String name_;
	private List<Room> rooms_ = new ArrayList<>();
	
	public Map(String name) {
		name_=name;
	}

	public List<Room> getRooms() {
		return rooms_;
	}

	public void setRooms(List<Room> rooms_) {
		this.rooms_ = rooms_;
	}
	
	public String getName() {
		return name_;
	}
}
