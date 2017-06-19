package MyPackage;

import java.util.HashMap;
import java.util.Map;

public class MyClass {

	public static void main(String[] args) {
		
		Map<Integer,Employee> empMap=new HashMap<Integer,Employee>();  
		for (int i = 0; i <= 10; i++) {
			String name="emp" + i;
			int id= i;
			double sal = i+100;
			Employee employees = new Employee(name,id,sal);
			empMap.put(i, employees);
		}
		
		
		 for(Map.Entry<Integer, Employee> entry:empMap.entrySet()){    
		        int employeeId=entry.getKey();  
		        Employee empDetails=entry.getValue();  
		        System.out.println(employeeId+" Details:");  
		        System.out.println("Employee Name is " + empDetails.getEmpName() + " id is "+ empDetails.getEmpId() +" and salary is " + empDetails.getSalary());   
		    }   
	
	
	}

}