public class Store2 implements Store{
	private int max_size;
	private Item arr[];
	private int current_size;
	public Store2() {
		this.max_size=6;
		this.current_size=0;
		this.arr=new Item[max_size];
	}
	public void addItem(Item item) {
		if(this.current_size==this.max_size) {
			System.out.println("Not enought size");
			return;
		}
		arr[this.current_size]=item;
		this.current_size++;
	}
	public void removeItem(Item item) {
		
	}
	public Iterator createIterator() {
		return (Iterator) new ArrayIterator(this.arr);
	}
}
