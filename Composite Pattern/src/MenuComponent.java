public abstract class MenuComponent {
	protected String name;
	protected String description;
	public MenuComponent(String name,String description) {
		this.name=name;
		this.description=description;
	}
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	public abstract void print();
}
