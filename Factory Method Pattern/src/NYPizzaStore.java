public class NYPizzaStore extends PizzaStore{
	public Pizza factoryMethod(String type) {
		Pizza ret=null;
		if(type.equals("Cheese")) {
			ret=new NYCheesePizza("NY Cheese Pizza", 20.0);
		}
		else if(type.equals("Chicken")) {
			ret=new NYChickenPizza("NY Chicken Pizza",30.0);
		}
		return ret;
	}
	
}
