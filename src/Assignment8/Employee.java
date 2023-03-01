package Assignment8;

public class Employee {
	String firstName;
	String lastName;
	String city;
	long mobileNo;
	String country;
	
	Employee(String firstName,String lastName,String city,long mobileNo,String country){
		this.firstName=firstName;
		this.lastName=lastName;
		this.city=city;
		this.mobileNo=mobileNo;
		this.country=country;
	}

	
	public String toString() {
		return "Employee[firstName"+firstName+"lastName"+lastName+"city"+city+"mobileNo "+mobileNo+" country "+country+"]";
	}

	public static void main(String[] args) {
		Employee employe1=new Employee(" Anita "," Bhui "," Baramati ",12345678," India ");
		Employee employe2=new Employee(" Sunita "," Bhui "," Solapur ",1233789678," India ");
		Employee employe3=new Employee(" Nitin "," Bhui "," pune ",1234705678," India ");
		Employee employe4=new Employee(" Nikita "," Bhui "," Pandharpur ",641234567," India ");
	System.out.println(employe1);
	System.out.println(employe2);
	System.out.println(employe3);
	System.out.println(employe4);

}
}