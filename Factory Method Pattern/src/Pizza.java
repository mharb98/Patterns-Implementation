public abstract class Pizza {
	private String description;
	private double price;
	Pizza(String description,double price){
		this.description=description;
		this.price=price;
	}
	public double getPrice() {
		return this.price;
	}
	public String getDescription() {
		return this.description;
	}
}
