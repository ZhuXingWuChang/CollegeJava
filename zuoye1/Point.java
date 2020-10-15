package zuoye1;
/*
 * 例2-12	定义平面中的一个二维点Point
 */
public class Point {
	int x, y;
	Point(int x1, int y1) {//构造方法，用于创建类的实例时，给它值的情况
		x = x1;
		y = y1;
	}
	Point() {//又重载了一个构造方法，用于创建类的实例时，未给它值的情况
		this (0, 0);//这里第一个0会给x，第二个0会给y，与第七行对应
	}
	void moveTO(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public static void main(String[] args) {
		Point point1 = new Point();
		System.out.println("point1.x = " + point1.x);
		System.out.println("point1.y = " + point1.y);
		
		Point point2 = new Point(2,3);
		System.out.println("point2.x = " + point2.x);
		System.out.println("point2.y = " + point2.y);
	}
}
