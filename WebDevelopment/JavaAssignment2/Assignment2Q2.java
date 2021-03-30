import java.util.ArrayList;

class Manager extends Assignment2Q2 {
	private int incentive = 5000;
    @Override
    public int getSalary(int salary) {
        int manSalary = salary + incentive;
        return manSalary;
    }
}

class Labour extends Assignment2Q2 {
	private int overtime = 500;
    @Override
    public int getSalary(int salary) {
        int labSalary = salary + overtime;
        return labSalary;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
    	this.salary = salary;
    	return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int totalEmployeeSly = 0;
    	for(Integer i : employeeSalaries) {
    		totalEmployeeSly += i;
    	}
    	return totalEmployeeSly;
    }
    public static void main(String[] args) {
    	
    }
}