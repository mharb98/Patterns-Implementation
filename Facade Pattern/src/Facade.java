public class Facade {
	TV tv;
	Light light;
	DVD dvd;
	public Facade(TV tv,Light light,DVD dvd) {
		this.tv=tv;
		this.light=light;
		this.dvd=dvd;
	}
	public void watchMovie() {
		this.tv.startTV();
		this.dvd.startDVD();
		this.light.dimLight();
	}
	public void endMovie() {
		this.tv.endTV();
		this.dvd.endDVD();
		this.light.turnLight();
	}
}
