package p2;


public class ElectronicDevice implements Comparable<ElectronicDevice>{
	
	private String name;
	private int power;
	private int rating;
	private int Price;
	
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicDevice(String name, int power, int rating, int price) {
		super();
		this.name = name;
		this.power = power;
		this.rating = rating;
		this.Price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public void charged() {
		power +=(power/20);
		System.out.println("After charged : "+power);
		
	}
	


	@Override
	public String toString() {
		return "Device Type : "+getClass().getSimpleName()+" ElectronicDevice [name=" + name + ", power=" + power + ", rating=" + rating + ", Price=" + Price + "]";
	}

	@Override
	public int compareTo(ElectronicDevice o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
