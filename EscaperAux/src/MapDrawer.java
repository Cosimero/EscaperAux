import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class MapDrawer {

	public static void main(String[] args) {
		//---------TESTING----------
		mxGraph graph = new mxGraph();
		
		Object parent = graph.getDefaultParent();

		graph.getModel().beginUpdate();
		try {
			Object v1 = graph.insertVertex(parent, null, "Room1", 20, 20, 80, 60);
			Object v2 = graph.insertVertex(parent, null, "Room2", 200, 150, 80, 60);
			Object v3 = graph.insertVertex(parent, null, "Room3", 200, 20, 80, 30);
			Object e1 = graph.insertEdge(parent, null, "", v1, v2);
			Object e2 = graph.insertEdge(parent, null, "", v1, v2);
			Object e3 = graph.insertEdge(parent, null, "", v1, v1);
		} finally {
			graph.getModel().endUpdate();
		}
		
		
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		graphComponent.getViewport().setOpaque(true);
		graphComponent.setBackgroundImage(new ImageIcon("resources/plan.png"));
		
		
		
		
		mxGraph graph2 = new mxGraph();
		
		Object parent2 = graph2.getDefaultParent();

		graph.getModel().beginUpdate();
		try {
			Object v1 = graph2.insertVertex(parent2, null, "Room1", 20, 20, 80, 60);
		} finally {
			graph2.getModel().endUpdate();
		}
		
		
		mxGraphComponent graphComponent2 = new mxGraphComponent(graph2);
		graphComponent2.getViewport().setOpaque(true);
		graphComponent2.setBackgroundImage(new ImageIcon("resources/plan.png"));
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
	
		frame.getContentPane().add(graphComponent);
		frame.setVisible(true);
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("repaint");
		frame.getContentPane().add(graphComponent2);
		frame.setVisible(true);
//		frame.revalidate();
//		frame.repaint();
		
		
		
		
		//---------TESTING----------
	}
	
	void drawMap(Map map) {
		
	}
	
	int getIDOfUsersLocation() {
		
		return -1;
	}
}
