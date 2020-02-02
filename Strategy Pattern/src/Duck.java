
public abstract class Duck {
	protected Flyable fly;
	protected Quackable quack;
	public Duck(Flyable fly,Quackable quack) {
		this.fly=fly;
		this.quack=quack;
	}
	public void setFlyable(Flyable fly) {
		this.fly=fly;
	}
	public void setQuackable(Quackable quack) {
		this.quack=quack;
	}
	public abstract void performQuack();
	public abstract void performFly();
}
