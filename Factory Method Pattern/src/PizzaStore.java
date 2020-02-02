public abstract class PizzaStore {
	public abstract Pizza factoryMethod(String type);
	public void prepare(String type) {
		Pizza dummy=factoryMethod(type);
		System.out.println(dummy.getDescription());
		System.out.println(dummy.getPrice());
	}
}
