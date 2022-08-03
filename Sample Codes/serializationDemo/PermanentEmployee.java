package serializationDemo;

public class PermanentEmployee extends EmployeeDTO{

	private static final long serialVersionUID = 1L;
	int bonus;
	
	public PermanentEmployee(String empId, String name, String designation, int jobLevel, Address address, int bonus )
	{
		super(empId,name,designation,jobLevel, address);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [getBonus()=" + getBonus() + ", getEmpId()=" + getEmpId() + ", getName()=" + getName()
				+ ", getDesignation()=" + getDesignation() + ", getJobLevel()=" + getJobLevel() + ", getAddress()="
				+ getAddress() + "]";
	}
	
}
