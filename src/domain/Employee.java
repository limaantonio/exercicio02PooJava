package domain;

public class Employee {
	private String nome;
	private double grossSalary;
	private double tax;
	
	public Employee() {
		
	}

	public Employee(String nome, double grossSalary, double tax) {
		this.nome = nome;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public void netSalary() {
		
		System.out.printf("Employee: %s, $ %.2f\n\n",nome, grossSalary-tax);
	}
	
	public void increaseSalary(double percentage ) {
		this.grossSalary += (grossSalary * (percentage/100))-tax;
	}

	@Override
	public String toString() {
		return  nome + ", $ " + grossSalary + "";
	}
	
}
