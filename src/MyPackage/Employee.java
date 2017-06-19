package MyPackage;

public class Employee {

	 private String empName;
	 private int empId;
	 private double empSal;
	 Employee employees[] = new Employee[10];
	 
	 public Employee(String name,int id,double sal){
        this.empName = name;
        this.empId = id;
        this.empSal = sal;
     }
	 
	 public String getEmpName(){
		 return empName;
	 }
	
	 public int getEmpId(){
	     return empId;
	 }
	 
	  public double getSalary(){
	     return empSal;
	 }
}