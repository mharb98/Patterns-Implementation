public class ChicagoPizzaStore extends PizzaStore{
	public Pizza factoryMethod(String type) {
		Pizza ret=null;
		if(type.equals("Cheese")) {
			ret=new ChicagoCheesePizza("Chicago Cheese Pizza", 20.0);
		}
		else if(type.equals("Chicken")) {
			ret=new ChicagoCheesePizza("Chicago Chicken Pizza",30.0);
		}
		return ret;
	}
	
}
