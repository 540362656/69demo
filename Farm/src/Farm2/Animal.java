package Farm2;

public abstract class Animal {
	//���ҽ���
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
		System.out.println("����"+this.getName()+"����ֵ"+this.getHealth()+"����"+this.getLove());
	}
	public void eat(){
		
	}
	
	
	
	//��������еķ���  ,  ��������еĶ���һ��
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
