package Clock;

public class Display {
	private int value = 0;//value：值
	private int limit = 0;//limit：限制
	
	public Display(int limit) {//构造函数不需要定义函数类型
		this.limit = limit;
	}
	
	public void increase() {//increase：增加
		value++;
		if (value == limit) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Display d = new Display(24);
		for( ;; ) {
			d.increase();
			System.out.println(d.getValue());
		}
	}

}
