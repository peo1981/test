package telran.computer;

import telran.computer.model.Computer;
import telran.computer.model.Laptop;
import telran.computer.model.SmartPhone;

public class CastingAppl {

	public static void main(String[] args) {

		Computer comp1 = new Computer("i5", 12, 512, "HP");
		Computer lap1 = new Laptop("I7", 16, 512, "ASUS", 3, 1.2);
		SmartPhone smart1 = new SmartPhone("Snapdragon", 16, 128, "Samsung", 8, 0.15, 123456789012L);
		System.out.println(comp1);
		System.out.println(lap1.toString());
		System.out.println(smart1.toString());
		if (lap1 instanceof Laptop) {
			Laptop laptop1 = (Laptop) lap1;
			System.out.println(laptop1.getHours());
		}
		if (lap1 instanceof SmartPhone) {
			SmartPhone smartphone1 = (SmartPhone) lap1;
			System.out.println(smartphone1.getHours());
		}

	}

}
