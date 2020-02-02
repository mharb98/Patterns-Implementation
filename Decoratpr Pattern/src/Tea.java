public class Tea extends Beverage{
	public Tea() {
		this.description="Tea";
		this.cost=5;
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
