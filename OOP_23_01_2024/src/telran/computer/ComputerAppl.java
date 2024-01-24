package telran.computer;

import telran.computer.model.Computer;
import telran.computer.model.Laptop;
import telran.computer.model.SmartPhone;

public class ComputerAppl {

	public static void main(String[] args) {
		
		Computer comp1=new Computer("i5", 12, 512, "HP");
		Laptop lap1=new Laptop("I7", 16, 512, "ASUS", 3, 1.2);
		SmartPhone smart1=new SmartPhone("Snapdragon", 16, 128, "Samsung", 8, 0.15, 123456789012L);
       // comp1.printInfo();
        System.out.println();
       // lap1.printInfo();
        System.out.println();
        //smart1.printInfo();
        System.out.println();
        System.out.println(smart1.toString());
		
	}

}
