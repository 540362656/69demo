package Farm2;

public abstract class Animal {
	//自我介绍
	private String name;
	private int  health;
	private int  love;
	
	public Animal (){
		
	}
	public Animal(String name,int  health,int  love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	
	public void show(){
		System.out.println("我是"+this.getName()+"健康值"+this.getHealth()+"爱好"+this.getLove());
	}
	public void eat(){
		
	}
	
	
	
	//声明动物叫的方法  ,  美个动物叫的都不一样
	public abstract void shout();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int hobby) {
		this.love = hobby;
	}

}
