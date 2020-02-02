public class Mocha extends AbstractDecorator{
	public Mocha(Beverage beverage) {
		super(beverage);
		this.extraCost=4.0;
		this.extraDes="Mocha";
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription()+" with "+this.extraDes;
	}

	@Override
	public double getCost() {
		return this.beverage.getCost()+this.extraCost;
	}
}
