
public class Coffee extends Beverage{
	public Coffee() {
		this.description="Coffee";
		this.cost=15;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public double getCost() {
		return this.cost;
	}
}
