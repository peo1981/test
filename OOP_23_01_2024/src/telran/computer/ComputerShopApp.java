package telran.computer;

import telran.computer.model.Computer;
import telran.computer.model.Laptop;
import telran.computer.model.SmartPhone;

public class ComputerShopApp {

	public static void main(String[] args) {
		Computer[] shop = new Computer[5];
		printArray(shop);
		shop[0] = new Computer("i5", 12, 512, "HP");
		shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
		shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
		shop[3] = new SmartPhone("Snapdragon", 16, 128, "Samsung", 8, 0.15, 1234567890123l);
		printArray(shop);
		int total = getTotalSSDCapacity(shop);
		System.out.println(total + "-Total SSD CAPACITY");
		total = getTotalSSDLaptopCapacity(shop);
		System.out.println(total + "-Total SSD LAPTOP CAPACITY");
		double hours = getTotalHours(shop);
		System.out.println(hours + "-Total Hours CAPACITY");
		
	}

	private static void printArray(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}

		}
	}

	public static int getTotalSSDCapacity(Computer[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				res += arr[i].getSsd();
			}
		}
		return res;
	}

	public static int getTotalSSDLaptopCapacity(Computer[] arr) {

		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Laptop && !(arr[i] instanceof SmartPhone)) {
				res += arr[i].getSsd();
			}
		}
		return res;
	}

	public static double getTotalHours(Computer[] arr) {
		double res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Laptop) {
				Laptop item = (Laptop) arr[i];
				res += item.getHours();
			}
		}
		return res;
	}

}
