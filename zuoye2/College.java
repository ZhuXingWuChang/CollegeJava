package zuoye2;
/*
 * 题目2.10
 */
public class College {
	Birthday birth1 = new Birthday(2001, 6, 7);
	Student stu1 = new Student("郑惟霖", "男", birth1, "201906409", "计算机科学学院");
	public static void main(String[] args) {
		College yangtze_university = new College();
		System.out.println("Name:		" + yangtze_university.stu1.name);
		System.out.println("Gender:		" + yangtze_university.stu1.gender);
		System.out.printf("Birthday:	%4d,%02d,%02d\n", 
				yangtze_university.stu1.birthday.year, 
				yangtze_university.stu1.birthday.month, 
				yangtze_university.stu1.birthday.day);
		System.out.println("StudentNumber:	" + yangtze_university.stu1.studentNumber);
		System.out.println("Faculty:	" + yangtze_university.stu1.faculty);
	}
}

class Birthday {
	int year = 0;
	int month = 0;
	int day = 0;
	Birthday (int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	Birthday () {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}
	void setBirthday (int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}

class Teacher {
	String name = null;
	String gender = null;//gender:性别
	Birthday birthday = new Birthday();
	String salaryNumber = null;//salary:工资
	String faculty = null;//faculty:科，系
	void setName (String name) {
		this.name = name;
	}
	void setGender (String gender) {
		this.gender = gender;
	}
	void setBirthday (Birthday birthday) {
		this.birthday = birthday;
	}
	void setSalaryNumber (String salaryNumber) {
		this.salaryNumber = salaryNumber;
	}
	void setFaculty (String faculty) {
		this.faculty = faculty;
	}
	Teacher (String name,  String gender, Birthday birthday, String salaryNumber, String faculty) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.salaryNumber = salaryNumber;
		this.faculty = faculty;
	}
}

class Student {
	String name = null;
	String gender = null;//gender:性别
	Birthday birthday = new Birthday();
	String studentNumber = null;
	String faculty = null;//faculty:科，系
	void setName (String name) {
		this.name = name;
	}
	void setGender (String gender) {
		this.gender = gender;
	}
	void setBirthday (Birthday birthday) {
		this.birthday = birthday;
	}
	void setStudentNumber (String studentNumber) {
		this.studentNumber = studentNumber;
	}
	void setFaculty (String faculty) {
		this.faculty = faculty;
	}
	Student (String name,  String gender, Birthday birthday, String studentNumber, String faculty) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.studentNumber = studentNumber;
		this.faculty = faculty;
	}
}
