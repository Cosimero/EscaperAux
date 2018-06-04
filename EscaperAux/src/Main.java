import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parser input file room: "); //allows for different files to be read in
        String file = sc.nextLine();
		Parser parser = new Parser(file);
		Map map = parser.getMap();
		parser.updateFullnesses(map);
		// Draw it out and wait for users' selection then provide computed route
		MapDrawer drawer = new MapDrawer(map);
		drawer.drawMap();
		
		

	}

}
