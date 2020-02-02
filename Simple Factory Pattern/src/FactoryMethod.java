public class FactoryMethod {
	public Pizza createPizza(String type) {
		Pizza ret=null;
		if(type.equals("Cheese")) {
			ret=new CheesePizza();
		}
		else if(type.equals("Veggie")) {
			ret=new VeggiePizza();
		}
		else if(type.equals("Chicken")) {
			ret=new ChickenPizza();
		}
		return ret;
	}
}
