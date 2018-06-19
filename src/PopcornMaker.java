
public class PopcornMaker {
	public static void main(String[] args) {
		Popcorn pop = new Popcorn("buttery");
		Microwave mic = new Microwave();
		mic.putInMicrowave(pop);
		mic.setTime(2);
		mic.startMicrowave();
		pop.applyHeat();
		pop.eat();
		
	}
}
