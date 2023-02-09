
public class Employee {

	private int id;
	private String title;
	private String name;
	private double salary;
	
	public Employee() {}

	public Employee(int id, String title, String name, double salary) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", title=" + title + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
