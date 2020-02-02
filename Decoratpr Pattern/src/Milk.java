public class Milk extends AbstractDecorator{
	public Milk(Beverage beverage) {
		super(beverage);
		this.extraCost=3.0;
		this.extraDes="Milk";
	}

	public String getDescription() {
		return this.beverage.getDescription()+" with "+this.extraDes;
	}

	public double getCost() {
		return this.beverage.getCost()+this.extraCost;
	}
}
