package zuoye1;
/*
 * 例2-9	静态变量访问示例
 */
public class OtherClass {
	private int x;
	public void mathod() { // mathod:方法
		x = StaticVar.number;
	}
	
	public static void main(String[] args) {
		OtherClass otherclass1 = new OtherClass();
		otherclass1.mathod();
		System.out.println(otherclass1.x);
	}
}