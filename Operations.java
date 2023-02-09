import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(7,7,1,1,5,2,3,6,8,4,9,0);
		
		Employee emp1 = new Employee(1,"Engineer","One",1000000);
		Employee emp2 = new Employee(2,"Engineer","Two",1050000);
		Employee emp3 = new Employee(3,"Doctor","Three",1200000);
		Employee emp4 = new Employee(4,"Engineer","Four",700000);
		Employee emp5 = new Employee(5,"Doctor","Five",900000);
		
		List<Employee> employeeList = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		
		//Write example of following intermediate operations of Stream API
		
		//filter()
		nums.stream().filter((n)->n%2==0).forEach((num) -> System.out.print(num));
		
		System.out.println();
		
		//map()
		List<Employee> employees = employeeList.stream()
					.map(emp->new Employee(emp.getId(),emp.getTitle(),emp.getName(),emp.getSalary()*1.10))
					.collect(Collectors.toList());
		System.out.println(employees);
		
		
		//sorted()
		nums.stream().sorted().forEach((num) -> System.out.print(num));
		
		System.out.println();
		
		//distinct
		nums.stream().distinct().forEach((num) -> System.out.print(num));
		
		System.out.println();
		
		//Write the examples of following terminal operations
		
		//reduce()
		System.out.println(nums.stream().reduce(0,(num,total)->num+total));
		
		//forEach()
		nums.stream().forEach((num) -> System.out.print(num));
		System.out.println();
		
		//collect()
		System.out.println(nums.stream().collect(Collectors.toSet()));
		
		//allMatch()
		System.out.println(nums.stream().allMatch(num->num>0));
		
		
		//anyMatch()
		System.out.println(nums.stream().anyMatch(num->num>0));
		
		
		//count()
		System.out.println(nums.stream().count());
		
		//min()
		System.out.println(nums.stream().min(Integer::compare).get());
		
		//max()
		System.out.println(nums.stream().max(Integer::compare).get());
		
		//Write the examples of Collectors i.e. Collectors.toList
		List<Employee> e = employeeList.stream()
				.map(emp->new Employee(emp.getId(),emp.getTitle(),emp.getName(),emp.getSalary()*1.10))
				.collect(Collectors.toList());
		System.out.println(e);

	}

}
