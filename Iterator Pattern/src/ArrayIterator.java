public class ArrayIterator implements Iterator{
	private Item arr[];
	private int current;
	public ArrayIterator(Item arr[]) {
		this.arr=arr;
		this.current=0;
	}
	
	public boolean hasNext() {
		if(this.current<this.arr.length && this.arr[this.current]!=null) {
			return true;
		}
		return false;
	}

	public Item next() {
		Item dummy=this.arr[this.current];
	    this.current++;
		return dummy;
	}
	
}
