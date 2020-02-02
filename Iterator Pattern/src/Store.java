public interface Store {
	public Iterator createIterator();
	public void addItem(Item item);
	public void removeItem(Item item);
}
