import java.util.ArrayList;
public abstract class NodeComponent extends MenuComponent{
	protected Printable printable;
	ArrayList<MenuComponent> menuItems;
	public NodeComponent(String name,String description) {
		super(name,description);
		this.menuItems=new ArrayList<MenuComponent>();
		this.printable=new Printable();
	}
	public void print() {
		System.out.println(this.getName());
		System.out.println(this.getDescription());
		this.printable.Print(this.menuItems);
	}
	public void addItem(MenuComponent menuComponent) {
		this.menuItems.add(menuComponent);
	}
	public void removeItem(MenuComponent menuComponent) {
		this.menuItems.remove(menuComponent);
	}
}
