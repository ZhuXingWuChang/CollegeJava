package zuoye1;
/*
 * 例2-10	抽象类示例
 */
import java.awt.Point;

abstract class Shape {
    abstract void draw();//定义了一个抽象方法"画"
    Point position;//定义了一个点
    Shape (Point p) {//最终，构造Circle的时候，构造方法一路找到这里
        position = p;//因为构造Circle需要一个点p，而这个点p在Shape的构造方法里
    }
}

abstract class Round extends Shape {//抽象类Round是对父类Shape的继承	round:圆形
    final double pi = 3.14159265;//使用final定义了一个常量

    public Round(Point p) {//因为构造Circle对象时，Circle的构造函数需要一个super的p，它会找到它父类的构造函数里，来找这个p
        super (p);//而事实上Round的构造函数里没有自己的p，所以它还需要说明它的这个p事实上是它父类的p
    }

    abstract void draw();//这里没有具体实现弗雷的抽象方法，而是在子类中继续定义为抽象的，然后在下一层的子类中实现
    abstract double area();//自己再定义了一个area抽象方法		area:面积
}

class Circle extends Round {//抽象类Circle是对父类Round的继承	circle:圆
    int radius;//radius:半径
    void draw() {//实现父类的父类 的 抽象方法
        drawCircle(position);//用了一个drawCirlce的方法
    }

    private void drawCircle(Point position) {
    	//至于具体怎么draw这个Circle，有待实现
    }

    double area() {//实现父类 的 抽象方法
        return pi*radius*radius;
    }
    Circle (Point p, int radius) {//构造函数
        super (p);//super指代父类，意思是p是父类的p，那么我们在构造Circle对象时需要找到Round的构造方法里的那个p
        this.radius = radius;
    }
    void showCircle(){
        System.out.println(this.radius);
        System.out.println(this.position);
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Point p =new Point(2,3);
        Circle c =new Circle(p,3);//把点p和半径3传过去
        c.showCircle();
    }
}