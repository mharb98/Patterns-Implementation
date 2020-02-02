import java.util.ArrayList;

public class Subject {
	private ArrayList<Shape> arr;
	private int state;
	public Subject() {
		this.arr=new ArrayList<Shape>(2);
		this.state=0;
	}
	public void addShape(Shape shape) {
		this.arr.add(shape);
	}
	public void setState(int s) {
		this.state=s;
	}
	public int getState() {
		return this.state;
	}
	public void notifyObjects() {
		for(Shape i : arr) {
			i.displayArea(this.state);
		}
	}
}
