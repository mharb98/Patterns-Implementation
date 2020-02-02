public class AdapterTurkey implements Duck {
	private Turkey turkey;
	public AdapterTurkey(Turkey turkey) {
		this.turkey=turkey;
	}
	public void Quack() {
		this.turkey.Gobble();
	}
	public void Swim() {
		this.turkey.Walk();
	}
}
