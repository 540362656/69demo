//�����ࡣ������ũ��������
public class Master {
	//���͸����Ѷ�����Ϊ�����һ������,����ϲ��ʲô������ʲô
	//���������3�ַ��� �ϳ�һ�ַ���
	public Animal sendAnimal(int type){//�û�����type  ����Ϊanimal
		//������������Ϊ����ֵ
		Animal animal = null; //��֪��ѡ�������������ȸ�animal����ֵ��Ȼ��ѡ���귵��ֵ����ѡ���animal
		switch(type){//�ж�  ѡ��
		case 1:
			animal = new Cat();//���ѡ��1����ônewһ��Cat���͵���Cat�����е� ������ϵͳ��Ĭ��ִ����д�����෽����
			break;
		case 2:
			animal = new Dog();
			break;
		case 3:
			animal = new Duck();
			break;
			default:
				System.out.println("�Բ���ũ��û���������");
				break;
		}
		//���ص���animal   ���animal����type��
		return animal;
	}

}





/*//����ϲ��è��
	public Cat  sendCat(){  // ���ͷ���
		return new Cat();
	}
	//ϲ������
	public Dog  sendDog(){
		return new Dog();
	}
	//ϲ��Ѽ�ӵ�
	public Duck  sendDuck(){
		return new Duck();
	}*/