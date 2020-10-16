package zuoye2;
/*
 * 题目2.11
 */
public class Course {
	String courseName;
	int testScore;
	int homeworkScore;
	String teacher;
	String courseNumber;
	double credit;//credit:学分
	String classroom;//classroom:教室
	String classAndGrade;//class and grade:班级
	
	void setCourseName (String courseName) {
		this.courseName = courseName;
	}
	void setTestScore (int testScore) {
		this.testScore = testScore;
	}
	void setHomeworkScore (int homeworkScore) {
		this.homeworkScore = homeworkScore;
	}
	void setTeacher (String teacher) {
		this.teacher = teacher;
	}
	void setCourseNumber (String courseNumber) {
		this.courseNumber = courseNumber;
	}
	void setCredit (double credit) {
		this.credit = credit;
	}
	void setClassroom (String classroom) {
		this.classroom = classroom;
	}
	void setClassAndGrade (String classAndGrade) {
		this.classAndGrade = classAndGrade;
	}
	
	public static void main(String[] args) {
		Course OOP = new Course();
		OOP.setCourseName("面向对象程序设计");
		OOP.setTestScore(60);
		OOP.setHomeworkScore(40);
		OOP.setTeacher("向华");
		OOP.setCourseNumber("000001");
		OOP.setCredit(6);
		OOP.setClassroom("C-218");
		OOP.setClassAndGrade("大数据11901");
		System.out.println("课程名称:	" + OOP.courseName);
		System.out.println("考试成绩占比:	%" + OOP.testScore);
		System.out.println("平时成绩占比:	%" + OOP.homeworkScore);
		System.out.println("任课教师:	" + OOP.teacher);
		System.out.println("课程序号:	" + OOP.courseNumber);
		System.out.println("课程学分:	" + OOP.credit);
		System.out.println("上课教室:	" + OOP.classroom);
		System.out.println("上课班级:	" + OOP.classAndGrade);
	}

}
