import java.util.ArrayList;
public class Printable{
	public void Print(ArrayList<MenuComponent> menuItems) {
		for(int i=0;i<menuItems.size();i++) {
			menuItems.get(i).print();
		}
	}
}
