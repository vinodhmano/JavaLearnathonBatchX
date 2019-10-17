package learnathon.batch15.day4;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public static Point addPoints(Point p1, Point p2) {
		Point newPoint = new Point(0,0);
		newPoint.x = p1.x + p2.x;
		newPoint.y = p1.y + p2.y;
		return newPoint;
	}
	
	public void moveHorizontal(int x) {
		this.x += x;
	}
	
	public void moveVertical(int y) {
		this.y += y;
	}
	
	public void moveDiagnol(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void whereIsMyMouse() {
		System.out.printf("(%d, %d)\n",this.x, this.y);
	}
}
