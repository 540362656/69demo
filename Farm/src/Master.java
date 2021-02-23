//主人类。。代表农场的主人
public class Master {
	//赠送给朋友动物作为礼物，这一个方法,朋友喜欢什么就赠送什么
	//将主人类的3种方法 合成一种方法
	public Animal sendAnimal(int type){//用户键入type  接受为animal
		//将父类类型作为返回值
		Animal animal = null; //不知道选声明动物所以先给animal赋空值，然后选择完返回值返回选择的animal
		switch(type){//判断  选择
		case 1:
			animal = new Cat();//如果选择1，那么new一个Cat，就调用Cat子类中的 方法。系统会默认执行重写后子类方法。
			break;
		case 2:
			animal = new Dog();
			break;
		case 3:
			animal = new Duck();
			break;
			default:
				System.out.println("对不起，农场没有这个动物");
				break;
		}
		//返回的是animal   这个animal就是type；
		return animal;
	}

}





/*//朋友喜欢猫的
	public Cat  sendCat(){  // 赠送方法
		return new Cat();
	}
	//喜欢狗的
	public Dog  sendDog(){
		return new Dog();
	}
	//喜欢鸭子的
	public Duck  sendDuck(){
		return new Duck();
	}*/