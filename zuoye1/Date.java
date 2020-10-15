package zuoye1;
/*
 * 例2-11	类的说明
 */
public class Date {
	int day;
	int month;
	int year;
	//该定义告诉系统Date类型是一个类类型，现在可以说明Date类型的变量了，也成为类的实例
	public static void main(String[] args) {
		Date mybirth = new Date();
		Date yourbirth = new Date();
		mybirth.day = 26;
		mybirth.month = 11;
		yourbirth.year = 1960;
	}
}
