package learnathon.batch15.day4;

public class PaintProgram {
	public static void main(String[] args) {
		Point p = new Point(0,0);
		p.whereIsMyMouse();
		
		p.moveHorizontal(100);
		p.whereIsMyMouse();
		
		p.moveVertical(200);
		p.whereIsMyMouse();
		
		p.moveDiagnol(-25, 45);
		p.whereIsMyMouse();
		
		Point newPoint = Point.addPoints(p, new Point(500,200));
		newPoint.whereIsMyMouse();
		
	}
	
}
