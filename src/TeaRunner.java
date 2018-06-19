
public class TeaRunner {
	public static void main(String[] args) {
		 TeaBag tea = new TeaBag("Green");
		 Kettle ket = new Kettle();
		 Cup cup = new Cup();
		 ket.boil();
		 cup.makeTea(tea, ket.getWater());
		 
	}
}
