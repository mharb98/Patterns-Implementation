public class PizzaStore {
	FactoryMethod factoryMethod;
	public PizzaStore(){
		this.factoryMethod=new FactoryMethod();
	}
	public void servePizza(String type) {
		Pizza pizza=this.factoryMethod.createPizza(type);
		System.out.println(pizza.getType());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
