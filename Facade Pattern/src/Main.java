public class Main {
	public static void main(String args[]) {
		TV tv=new TV();
		Light light=new Light();
		DVD dvd=new DVD();
		Facade facade=new Facade(tv,light,dvd);
		facade.watchMovie();
		facade.endMovie();
	}
}
