package ustbatchno3.Exception_handling;

public class employee_details {
	private String phoneno;
	private String email;
	private String address;
	private long employee_id;
	private String employee_name;
	private String location;
	private int salary;
	public employee_details(String phoneno, String email, String address, long employee_id, String employee_name,
			String location, int salary) {
		super();
		this.phoneno = phoneno;
		this.email = email;
		this.address = address;
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.location = location;
		this.salary = salary;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee_details [phoneno=" + phoneno + ", email=" + email + ", address=" + address + ", employee_id="
				+ employee_id + ", employee_name=" + employee_name + ", location=" + location + ", salary=" + salary
				+ "]";
	}
	

}
