public abstract class Beverage {
	protected String description;
	protected double cost;
	public Beverage() {
		this.description="Unknown Beverage";
		this.cost=0.0;
	}
	public abstract String getDescription();
	public abstract double getCost();
}
