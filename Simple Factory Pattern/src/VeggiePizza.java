public class VeggiePizza extends Pizza{
	public VeggiePizza() {
		this.type="Veggie Pizza";
	}
	public String getType() {
		return this.type;
	}
	public void prepare() {
		System.out.println("Preparing Veggie pizza");
	}
	public void bake() {
		System.out.println("Baking Veggie pizza");
	}
	public void cut() {
		System.out.println("Cutting Veggie pizza");
	}
	public void box() {
		System.out.println("Boxing Veggie pizza");
	}
}
