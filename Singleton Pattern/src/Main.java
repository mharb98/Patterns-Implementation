public class Main {
	public static void main(String[] args) {
		System.out.println(Manager.getManager().getName());
		System.out.println(Manager.getManager().getAge());
		Employee employee1=new Employee("Ahmed",37);
		Employee employee2=new Employee("Katkoot",34);
		Manager.getManager().addEmployee(employee1);
		Manager.getManager().addEmployee(employee2);
		Manager.getManager().giveOrer("finish my work");
	}
}
