public abstract class AbstractDecorator extends Beverage{
	protected double extraCost;
	protected String extraDes;
	protected Beverage beverage;
	AbstractDecorator(Beverage beverage){
		this.beverage=beverage;
		this.extraCost=0.0;
		this.extraDes="Unknow Decoration";
	}
	public abstract String getDescription() ;
	public abstract double getCost();
}
