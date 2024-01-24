package telran.computer.model;

public class SmartPhone extends Laptop {

	private long imei;

	public SmartPhone(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
		super(cpu, ram, ssd, brand, hours, weight);
		this.imei = imei;
	}

	public long getImei() {
		return imei;
	}
	
	@Override
	public String toString() {
		return super.toString()+" imei: "+imei;
	}
	
}
