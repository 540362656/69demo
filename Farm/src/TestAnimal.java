import java.util.Scanner;


public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Master master = new  Master();
		System.out.println("��ϲ��ʲô��� 1��è 2���� 3��Ѽ��");
		int  type = input.nextInt();
		Animal animal = master.sendAnimal(type);//�û�����type  ���ܲ��� animal
		animal.shout();//ʹ�ø���֮�еķ�����ϵͳ��Ĭ��ִ����д�����෽����

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
	System.out.println("�Բ���ũ��û���������");
	break;
}*/