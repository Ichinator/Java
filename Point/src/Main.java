
public class Main {

	public static void main(String[] args) {
		/*PointClass point = new PointClass("Test", 10, 50);
		point.display();
		point.translate();
		point.display();*/
		
		Drawer draw = new Drawer(0, 0);
		
		draw.dimension();
		draw.rectangle();
		draw.triangle();
		draw.triangleInverse();
		
	}
}
