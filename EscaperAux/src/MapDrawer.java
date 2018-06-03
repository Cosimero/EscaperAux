import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class MapDrawer {
	
	private JFrame frame;
	private Map map;
	
	
	
	public MapDrawer(Map m){
		map = m; 
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
	}
	
	public void updateMap(Map m) {
		map = m;
		drawMap();
	}
	
	void drawMap() {	
		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		
		Iterator<Entry<Integer, Room>> roomIterator = map.getRooms().entrySet().iterator();
		
		
		graph.getModel().beginUpdate();
		try {
			
			Hashtable<Integer,Object> rooms = new Hashtable<>();
			
			//createVertices
			while (roomIterator.hasNext()) {
				Room room = roomIterator.next().getValue();
				
				Object o = graph.insertVertex(parent, null, room.getName(), 
						room.getCoordinates().getX(), room.getCoordinates().getY(), 20, 20);
				
				rooms.put(room.getID(), o);
					
				
			}
			
//			Object v1 = graph.insertVertex(parent, null, "Room1", 20, 20, 80, 60);
//			Object v2 = graph.insertVertex(parent, null, "Room2", 200, 150, 80, 60);
//			Object v3 = graph.insertVertex(parent, null, "Room3", 200, 20, 80, 30);
//			Object e1 = graph.insertEdge(parent, null, "", v1, v2);
//			Object e2 = graph.insertEdge(parent, null, "", v1, v2);
//			Object e3 = graph.insertEdge(parent, null, "", v1, v1);
		} finally {
			graph.getModel().endUpdate();
		}
		
		
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		graphComponent.getViewport().setOpaque(true);
		graphComponent.setBackgroundImage(new ImageIcon("resources/plan.png"));
		
		frame.getContentPane().add(graphComponent);
		frame.setVisible(true);
		
	}
	

//	
//	int getIDOfUsersLocation() {
//		
//		return -1;
//	}
	
	
	
	//---------TESTING--------------------------
	public static void main(String[] args) {
		
		
		
		//-----test map------
		Map map = new Map("Test");

		Coordinates cord = new Coordinates(10, 10);
		
		for(int i = 0; i < 5; i++) {
			if(i > 2) map.addRoom(new Room(i+"",cord,i,10,0,true));
			else map.addRoom(new Room(i+"",cord,i,10,0,false));
		}
		Corridor c1 = new Corridor(1, 5, 10, 0, false);
		Corridor c2 = new Corridor(5, 6, 10, 0, false);
		Corridor c6 = new Corridor(9, 10, 10, 0, false);
		
		// Create graph
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(1), c1);
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(2), c2);
		map.linkRoomsByCorridor(map.getRooms().get(1), map.getRooms().get(3), c6);
		//-----test map------
		
		
		
		//Call to drawMap()
		
		MapDrawer drawer = new MapDrawer(map);
		drawer.drawMap();
		
		
		
		
		
		
	
		
		
//		System.out.println("repaint");
//		frame.getContentPane().remove(0);
//		frame.getContentPane().add(graphComponent2);
//		frame.setVisible(true);
//		frame.revalidate();
//		frame.repaint();
		
		
		
		
		
	}
	
	//---------TESTING----------
}
