public class CheesePizza extends Pizza{
	public CheesePizza() {
		this.type="Cheese Pizza";
	}
	public String getType() {
		return this.type;
	}
	public void prepare() {
		System.out.println("Preparing cheese pizza");
	}
	public void bake() {
		System.out.println("Baking cheese pizza");
	}
	public void cut() {
		System.out.println("Cutting cheese pizza");
	}
	public void box() {
		System.out.println("Boxing cheese pizza");
	}
}
