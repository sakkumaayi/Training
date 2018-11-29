
public class Employee {
	String firstName;
	String lastName;
	int EmpId;
	int age;
	Address address;
	int salary;
	Department dept;
	
	public Employee() {
		
	}
	public Employee(String firstName, String lastName, int salary, int deptId, String deptName, Address a) {
		this.salary=salary;
		this.firstName=firstName;
		this.lastName=lastName;
		this.dept=new Department(deptName, deptId);//composition
		this.address=a;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	

}
