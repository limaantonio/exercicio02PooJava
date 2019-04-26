package program;

import java.util.Scanner;

import domain.Employee;

public class application {

	public static void main(String[] args) {
		
		String nome ;
		double gross, tax, aumento;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		nome = sc.nextLine();
		System.out.println("GrossSalary: ");
		gross = sc.nextDouble();
		System.out.println("Tax: ");
		tax = sc.nextDouble();
		
		Employee employee = new Employee(nome, gross, tax);
		employee.netSalary();
		
		System.out.println("Which to increase salary?");
		aumento = sc.nextDouble();
		employee.increaseSalary(aumento);
		
		System.out.printf("Update data: ");
		System.out.println(employee);

	}

}
