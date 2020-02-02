
public class LivingDuck extends Duck{
	public LivingDuck(Flyable fly,Quackable quack) {
		super(fly,quack);
	}
	public void performQuack() {
		System.out.print("From the Living duck:");
		this.quack.Quack();
	}
	public void performFly() {
		System.out.print("From the Living duck:");
		this.fly.Fly();
	}
}
