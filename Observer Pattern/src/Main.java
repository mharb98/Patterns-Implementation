
public class Main {

	public static void main(String[] args) {
		Subject subject=new Subject();
		Shape rect=new rectangle();
		Shape circle=new circle();
		subject.addShape(rect);
		subject.addShape(circle);
		subject.setState(5);
		subject.notifyObjects();
	}

}
