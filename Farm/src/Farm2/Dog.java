package Farm2;

public class Dog extends Animal {
	private String strain;

	public Dog(String name,int  health,int  love,String strain){
		super(name,health,love);
		this.strain=strain;

	}
	
	public void show(){
		super.show();
		System.out.println("Ʒ����"+strain);
	
	}
	
	public void eat(){
		System.out.println("��");
			this.setHealth(this.getHealth()+10);
			this.setLove(this.getLove()+10);	
	}
	
	
	//������еĽӷ��̵��ж�
	public void flyDisk(){
		System.out.println(this.getName()+"�ӷ���");
	}
	
	public void shout(){
		System.out.println("������");
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	

}
