package Farm2;

public class Penguin extends Animal {

	private String sex;
	public Penguin(String name,int  health,int  love,String sex){
		super(name,health,love);
		this.sex=sex;

	}
	

	
	@Override
	public void shout() {
		// TODO Auto-generated method stub

	}
	
	//�����е��ж�
	public void swim(){
		System.out.println("�������Ӿ");
	}

}
