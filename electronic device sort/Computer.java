package p2;

public class Computer extends ElectronicDevice {
	
	Memory m;
	Bluetooth b;
	public Computer() {
		super();
	}
	public Computer(String name, int power, int rating, int price,Memory m, Bluetooth b) {
		super(name, power, rating, price);
		this.m = m;
		this.b = b;
	}
	public Memory getM() {
		return m;
	}
	public void setM(Memory m) {
		this.m = m;
	}
	public Bluetooth getB() {
		return b;
	}
	public void setB(Bluetooth b) {
		this.b = b;
	}
	
	

	
	
	
}
