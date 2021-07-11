package p2;

public class Memory {
	
	String brand;
	int size;
	public Memory() {
		super();
	}
	public Memory(String brand, int size) {
		super();
		this.brand = brand;
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
