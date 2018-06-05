import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Parser parser = new Parser("database2.txt","database3.txt"); // TODO load from GUI
		Map map = parser.getMap();
		// Draw it out and wait for users' selection then provide computed route
		MapDrawer drawer = new MapDrawer(map);
		drawer.drawMap();
	}

}
