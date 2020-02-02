public abstract class Pizza {
	String type;
	public Pizza() {
		this.type="";
	}
	public abstract String getType();
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
}
