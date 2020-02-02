public class RubberDuck extends Duck{
	public RubberDuck(Flyable fly,Quackable quack) {
		super(fly,quack);
	}
	public void performQuack() {
		System.out.print("From the Rubber duck:");
		this.quack.Quack();
	}
	public void performFly() {
		System.out.print("From the Rubber duck:");
		this.fly.Fly();
	}
}
