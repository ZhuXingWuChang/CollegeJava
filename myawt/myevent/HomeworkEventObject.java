package myawt.myevent;

public class HomeworkEventObject extends java.util.EventObject {

	public HomeworkEventObject(Object source) {
		super(source);
	}

	public HomeworkEventObject(Teacher teacher) {
		super(teacher);
	}

	public Teacher getTeacher() {
		return (Teacher) super.getSource();
	}

}
