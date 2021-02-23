package Farm2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Éê¹«±ª",60,80,"ºÚÈ®");
		dog.show();
		Master master = new Master();
		master.feed(dog);
		dog.show();
		master.play(dog);
		
		Penguin Ppenguin = new Penguin("", 0, 0, "");
		master.play(Ppenguin);
		
		
	}

}
