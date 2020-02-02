import java.util.ArrayList;
public class Store1 implements Store{
	ArrayList<Item> arr;
	public Store1() {
		this.arr=new ArrayList<Item>();
	}
	public void addItem(Item item) {
		this.arr.add(item);
	}
	public void removeItem(Item item) {
		this.arr.remove(item);
	}
	public Iterator createIterator() {
		return (Iterator) new ListIterator(this.arr);
	}
}
