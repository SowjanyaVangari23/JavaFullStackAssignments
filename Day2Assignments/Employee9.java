package Day2Assignment;

public class Employee9 {
	String name;
	float salary;
	public Employee9(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee9 [name=" + name + ", salary=" + salary + "]";
	}
	

}
