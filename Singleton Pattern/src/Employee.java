public class Employee {
	private String name;
	private int age;
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void takeOrder(String order) {
		System.out.println("I have taken an order to "+order);
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
