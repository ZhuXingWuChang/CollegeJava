package myawt.myevent;

import java.util.*;

public class Teacher {
	private String name;
	private List<String> homeworks;
	//这个列标用于存放作业
	/*
	 * 教师类要维护一个自己监听器（学生）的列表，为什么？
	 * 在观察者模式中，教师是被观察者，继承自java.util.Observable，Observable中含了这个列表
	 * 现在我们没有这个列表了，所以要自己创建一个
	 */
	private Set<HomeworkListener> homeworkListenerList;
	//这个列表用于存放监听器（学生）

	public String getName() {
		return this.name;
	}

	public Teacher(String name) {
		this.name = name;
		//每个老师有一个名字
		this.homeworks = new ArrayList<String>();
		//每个老师还有一个作业列表
		this.homeworkListenerList = new HashSet<HomeworkListener>();
		//每个老师也有一个学生列表
	}

	public void setHomework(String homework) {
		System.out.printf("%s布置了作业%s \n", this.name, homework);
		homeworks.add(homework);
		//将老师布置的作业添加到作业列表里去
		HomeworkEventObject event = new HomeworkEventObject(this);
		//并且将此次布置作业设置为一个“作业事件”
		/*
		 * 在观察者模式中，我们直接调用Observable的notifyObservers来通知被观察者 现在我们只能自己通知了~~
		 */
		for (HomeworkListener listener : homeworkListenerList) {
			//遍历学生列表里所有的监听器（学生）
			listener.update(event, homework);
			//并且通知每个监听器（学生）“作业事件”和“作业”
		}
	}

	//此方法用于添加监听器（学生）到监听器列表里
	public void addObserver(HomeworkListener homeworkListener) {
		homeworkListenerList.add(homeworkListener);
	}
}