import java.util.ArrayList;
import java.util.List;

public class Department{
	String deptName;
	int deptId;
	List<Employee> employees;
	public Department(String deptName, int deptId) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
	}
	public Department(String deptName, int deptId, List<Employee> employees) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
		this.employees=employees;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
}
