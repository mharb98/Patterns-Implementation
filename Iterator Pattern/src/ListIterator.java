import java.util.ArrayList;
public class ListIterator implements Iterator{
	private ArrayList<Item> arr;
	private int current;
	public ListIterator(ArrayList<Item> arr) {
		this.arr=arr;
		this.current=0;
	}
	
	public boolean hasNext() {
		if(this.current<this.arr.size()) {
			return true;
		}
		return false;
	}
	
	public Item next() {
		Item dummy=this.arr.get(this.current);
		this.current++;
		return dummy;
	}

}
