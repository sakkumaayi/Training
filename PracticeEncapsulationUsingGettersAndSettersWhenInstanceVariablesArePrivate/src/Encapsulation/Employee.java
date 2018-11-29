/**
 * 
 */
package Encapsulation;

/**
 * @author santh
 *
 */
public class Employee extends HumanBeings{
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if((this.empId==e.empId)&&(this.empName).equals(e.empName) ) {
			return true;
		}else {
			return false;
		}
	}

}
