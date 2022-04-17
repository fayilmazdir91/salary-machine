package SalaryMachine;

public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public int tax() {
		int tax = 0;
		if (this.salary <= 1000) {
			return tax = 0;
		}else {
			return tax = (this.salary/100)*3;
		}
		
	}
	
	public int bonus() {
		int bonus = 0;
		if (this.workHours > 40) {
			return bonus = (this.workHours - 40) * 30;
		}
		else {
			return bonus = 0;
		}
	}
	
	public int raiseSalary() {
		int currentYear = 2021;
		if((currentYear - this.hireYear)<10) {
			int raiseSalary = (this.salary/100)*5;
			return this.salary += raiseSalary;
		}
		else if((currentYear - this.hireYear) > 9 && (currentYear - this.hireYear) < 20) {
			int raiseSalary = (salary/100)*10;
			return this.salary += raiseSalary;
		}
		else if((currentYear - this.hireYear) > 19) {
			int raiseSalary = (this.salary/100)*15;
			return this.salary += raiseSalary;
		}else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Name: " + this.name + "\n" +
        "Salary: " + this.salary + "\n" +
        "Work Hours: " + this.workHours + "\n" +
        "Hire Year: " + this.hireYear + "\n" +
        "Tax: " + tax() + "\n" +
        "Bonus: " + bonus() + "\n" +
        "Salary increase: " + raiseSalary() + "\n" +
        "Salary with tax and bonus: " + (this.salary - tax() + bonus()) + "\n" +
        "Total Salary: " + (this.salary + raiseSalary() - tax() + bonus());
	}

}