package assignment_11;

public class Emp {
	int id=101;
	String name="vivan";
	String city="pune"; 
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public Emp addEmp() {
		Emp emp=new Emp();
		System.out.println(emp);
		return emp;
	}

	public static void main(String[] args) {
		Emp e=new Emp();
		e.addEmp();

	}

}
