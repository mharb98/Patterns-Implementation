public class ChickenPizza extends Pizza{
	public ChickenPizza() {
		this.type="Chicken Pizza";
	}
	public String getType() {
		return this.type;
	}
	public void prepare() {
		System.out.println("Preparing chicken pizza");
	}
	public void bake() {
		System.out.println("Baking chicken pizza");
	}
	public void cut() {
		System.out.println("Cutting chicken pizza");
	}
	public void box() {
		System.out.println("Boxing chicken pizza");
	}
}
