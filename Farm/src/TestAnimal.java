import java.util.Scanner;


public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Master master = new  Master();
		System.out.println("你喜欢什么动物？ 1、猫 2、狗 3、鸭子");
		int  type = input.nextInt();
		Animal animal = master.sendAnimal(type);//用户键入type  接受参数 animal
		animal.shout();//使用父类之中的方法，系统会默认执行重写后子类方法。

	}

}

/*switch(type){
case 1:
	Cat cat = master.sendCat();
	cat.shout();
	break;
case 2:
	Dog dog = master.sendDog();
	dog.shout();
	break;
case 3:
	Duck duck = master.sendDuck();
	duck.shout();
	break;
default:
	System.out.println("对不起，农场没有这个动物");
	break;
}*/