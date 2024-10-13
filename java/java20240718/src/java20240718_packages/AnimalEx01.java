package java20240718_packages;

public class AnimalEx01 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.move();
		
		Humam humam = new Humam();
		humam.move();
		
		Animal animal = new Eagle();
		animal.move();
		animal = new Humam();
		animal = new Tiger();
		animal.move();
		animal = new Eagle();
		Eagle eagle = (Eagle)animal;
		
		animal = new Humam();
		Humam humam2 = (Humam)animal;
		humam2.readBook();
		
	}

}
