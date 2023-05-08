class Emp{
	int empid; 
	String empname = "Saravanan";

	//final 
	int y = 100;
	
	public Emp() {
		System.out.println("from employee default construtor"+ y++);
	}
	 public Emp(int empid) {
		
		this("Hello");  
		this.empid=empid;
		System.out.println("from employee parametrized constructor");
	}
	
	public Emp(String str) {
		System.out.println("from employee overloaded const " + str);
	}
	
	public String getDetails() {
		return empid+ "-----" +empname;
	}

	public void viewsalary()
	{
		System.out.println("view salary from parent class");
	}
}

class Manager extends Emp{
	String dept = "IT";
	
	public Manager() {
		super(500); 
		System.out.println("from mgr child contructor");
	}

	public String getDetails() {  
		return super.getDetails()+ "----" + dept; 
	}
	
	public void assignproject()
	{
		System.out.println("assign project from Child class");
	}
}

class salary{
	
}

public class InnerMainClass {

	public static void main(String args[])
	{
		Emp emp = new Emp();		 
		
		Emp em = new Manager();
		System.out.println(em.getDetails());
		em.viewsalary();
		
		if(emp instanceof Emp)
		{
			System.out.println("you are manager");
		}
		else {
			System.out.println("You are emp");
		}
			
		
	}
	
}