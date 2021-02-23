package Farm2;

public class Dog extends Animal {
	private String strain;

	public Dog(String name,int  health,int  love,String strain){
		super(name,health,love);
		this.strain=strain;

	}
	
	public void show(){
		super.show();
		System.out.println("品种是"+strain);
	
	}
	
	public void eat(){
		System.out.println("吃");
			this.setHealth(this.getHealth()+10);
			this.setLove(this.getLove()+10);	
	}
	
	
	//宠物独有的接飞盘的行动
	public void flyDisk(){
		System.out.println(this.getName()+"接飞盘");
	}
	
	public void shout(){
		System.out.println("汪汪汪");
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	

}
