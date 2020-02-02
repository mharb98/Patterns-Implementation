public class Main {
	public static void main(String[] args) {
		LeafComponent chicken=new Chicken("Chicken","Chicken that comes with love",23.5);
		LeafComponent rice=new Rice("Rice","Rice that comes with passion",15.0);
		NodeComponent lunch=new LunchMenu("Lunch Menu","We put all our lunch elements lol");
		NodeComponent dessert=new DessertMenu("Dessert Menu","We put all our dessert elements lol");
		LeafComponent mango=new Mango("Mango juice","bla bla",20.0);
		LeafComponent chocolate=new Chocolate("Chocolate","bli bli",25.0);
		lunch.addItem(chicken);
		lunch.addItem(rice);
		dessert.addItem(chocolate);
		dessert.addItem(mango);
		lunch.addItem(dessert);
		lunch.print();
		lunch.removeItem(dessert);
		lunch.print();
	}
}
