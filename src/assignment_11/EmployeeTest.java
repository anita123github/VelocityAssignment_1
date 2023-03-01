package assignment_11;

public class EmployeeTest {
	public static Employee getEmployeeById() {
		int id=10;
		String name="Vivan";
		String city="Pune";
		return new Employee(id,name,city);
	}

	public static void main(String[] args) {
		Employee e=getEmployeeById();
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.city);

	}

}
