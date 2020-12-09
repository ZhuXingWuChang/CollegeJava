package myawt.myevent;

public class Student implements HomeworkListener {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void update(HomeworkEventObject o, Object arg) {//学生被通知以后
		Teacher teacher = o.getTeacher();
		/*会得到布置作业的老师的信息
		 *而这个arg则对应的是homework
		 */
		System.out.printf("学生%s观察到（实际是被通知）%s布置了作业《%s》 \n", this.name, teacher.getName(), arg);
	}
}