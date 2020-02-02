public class Main {
	public static void main(String[] args) {
		Store1 store1=new Store1();
		Store2 store2=new Store2();
		Item item1=new Item("koko");
		Item item2=new Item("koko2");
		Item item3=new Item("koko3");
		Item dummy;
		store1.addItem(item1);
		store1.addItem(item2);
		store1.addItem(item3);
		store2.addItem(item1);
		store2.addItem(item2);
		store2.addItem(item3);
		Iterator iterator1=store1.createIterator();
		Iterator iterator2=store2.createIterator();
		while(iterator1.hasNext()) {
			dummy=iterator1.next();
			System.out.println(dummy.getName());
		}
		System.out.println("=================");
		while(iterator2.hasNext()) {
			dummy=iterator2.next();
			System.out.println(dummy.getName());
		}
	}
}
