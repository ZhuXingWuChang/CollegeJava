package 设计模式.adapterPattern.向老板的适配器模式;

public class Client
{
    public static void main(String[] args)
    {
        InewJuicer newJuicer;
        MyFruit fruit1, fruit2;
        
        newJuicer = new Adapter();
        fruit1 = new Apple();
        fruit2 = new Banana();
        
        System.out.println(newJuicer.newPort(fruit1, fruit2));
    }
}
