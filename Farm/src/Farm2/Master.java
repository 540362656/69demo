package Farm2;

public class Master  {
	//��������
	//����ı�����Ϊ����ֵ ����you�ι��췽��
	public Animal lingyang(int type,String name,int health,int love,String strain,String sex){
		//�����������
		Animal animal = null;
		if(type==1){
			animal = new Dog( name, health, love,strain);
		}else if(type==2){
			animal = new Penguin(name, health, love,sex);
		}
		return animal;
	}
	

	
	//�ö���ԣ�����ֱ��˭ֵ��ֻ�ܶ���ԣ����ݲ���ʱ�����ֵ��Ȼ��ȥ������
	public void feed(Animal animal){
		animal.eat();
	}
	//���ù���������֮�ж��еķ�����play�����Ľ����һ������Ҫ�õ�����ת�͡�
	//С��������ղ�������Ķ��������dog���Ǿ�ǿ��ת����DOg�����ͣ�ִ��dog���еĽӷ��̷�����
	public void play(Animal animal){
		if(animal instanceof Dog){
			Dog dog=(Dog)animal;
			dog.flyDisk();
		}else if(animal instanceof Penguin){
			Penguin pen = (Penguin)animal;
			pen.swim();
		}
	}
		
	//���͸�����  ������Ϊ����
	public Cat sendCat(int type){
		return new Cat();
	}


}
