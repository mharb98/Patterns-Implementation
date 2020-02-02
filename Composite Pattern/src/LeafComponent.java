public abstract class LeafComponent extends MenuComponent{
	private double price;
	LeafComponent(String name,String description,double price){
		super(name,description);
		this.price=price;
	}
	public void print() {
		System.out.println(this.getName());
		System.out.println(this.getDescription());
		System.out.println(this.price);
	}
}
