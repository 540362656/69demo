package Farm2;

public class Cat extends Animal {
	
	public void show(){
		System.out.println("我是"+this.getName()+"健康值"+this.getHealth()+"爱好"+this.getLove());
	}
	public void eat(){
		
	}
	public void shout(){
		System.out.println("喵喵");
	}

}
