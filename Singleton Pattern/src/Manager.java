import java.util.ArrayList;

public class Manager {
	private static Manager manager;
	private String name;
	private int age;
	private ArrayList<Employee> arr;
	private Manager() {
		this.name="Marwan";
		this.age=21;
		this.arr=new ArrayList<Employee>();
	}
	public static Manager getManager() {
		if(manager==null) {
			manager=new Manager();
		}
		return manager;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void addEmployee(Employee e) {
		this.arr.add(e);
	}
	public void removeEmployee(Employee e) {
		this.arr.remove(e);
	}
	public void giveOrer(String order) {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).getName());
			System.out.println(arr.get(i).getAge());
			arr.get(i).takeOrder(order);
		}
	}
}
