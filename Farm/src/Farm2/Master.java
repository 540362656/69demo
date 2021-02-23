package Farm2;

public class Master  {
	//领养宠物
	//父类的变量作为返回值 创建you参构造方法
	public Animal lingyang(int type,String name,int health,int love,String strain,String sex){
		//创建宠物变量
		Animal animal = null;
		if(type==1){
			animal = new Dog( name, health, love,strain);
		}else if(type==2){
			animal = new Penguin(name, health, love,sex);
		}
		return animal;
	}
	

	
	//让动物吃，但不直到谁值，只能动物吃，传递参数时具体的值，然后去父类找
	public void feed(Animal animal){
		animal.eat();
	}
	//调用狗类和企鹅类之中独有的方法，play产生的结果不一样，需要用到向下转型。
	//小括号里接收测试类里的对象，如果是dog，那就强制转换成DOg的类型，执行dog独有的接飞盘方法。
	public void play(Animal animal){
		if(animal instanceof Dog){
			Dog dog=(Dog)animal;
			dog.flyDisk();
		}else if(animal instanceof Penguin){
			Penguin pen = (Penguin)animal;
			pen.swim();
		}
	}
		
	//赠送给朋友  动物作为礼物
	public Cat sendCat(int type){
		return new Cat();
	}


}
