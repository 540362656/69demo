//创建子类Dog，行为是叫声
public class Dog extends Animal {

	@Override
	public void shout() {     //        系统自动生成了抽象方法，必须使用到，每个动物叫声不一样
	System.out.println("汪汪汪");//模拟狗的叫声

	}

}
