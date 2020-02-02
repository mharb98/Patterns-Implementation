public class MainClass {
	public static void main(String[] args) {
		Beverage coffee=new Coffee();
		Beverage tea=new Tea();
		coffee=new Mocha(coffee);
		coffee.getDescription();
		coffee.getCost();
		coffee=new Milk(coffee);
		System.out.println(coffee.getDescription());
		System.out.println(coffee.getCost());
		tea=new Milk(tea);
		System.out.println(tea.getDescription());
		System.out.println(tea.getCost());
	}
}
