package zuoye1;

public class Point3d extends Point{
	int z;
	public Point3d (int x, int y, int z) {//Point的构造方法前面没有public，这里加不加都可以
		super (x, y);//说明它的x和y是继承自父类Point的
		this.z = z;
	}
	public Point3d () {//同第五行的注释
		this(0, 0, 0);
	}
	public static void main(String[] args) {
		Point3d point1 = new Point3d();
		System.out.println("point1.x = " + point1.x);
		System.out.println("point1.y = " + point1.y);
		System.out.println("point1.z = " + point1.z);
		
		Point3d point2 = new Point3d(2,3,5);
		System.out.println("point2.x = " + point2.x);
		System.out.println("point2.y = " + point2.y);
		System.out.println("point2.z = " + point2.z);
	}

}
