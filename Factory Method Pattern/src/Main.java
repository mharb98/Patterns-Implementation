public class Main {
	public static void main(String[] args) {
		PizzaStore nyp=new NYPizzaStore();
		PizzaStore chp=new ChicagoPizzaStore();
		nyp.prepare("Cheese");
		nyp.prepare("Chicken");
		chp.prepare("Cheese");
		chp.prepare("Chicken");
	}
}
