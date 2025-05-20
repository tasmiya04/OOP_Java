class FullTimeEmployee extends Employee implements TaxPayer {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }


    double calculateSalary() {
        return monthlySalary;
    }

  
    public void payTax() {
        System.out.println(name + " (Full-time) paid tax on salary: $" + (monthlySalary * 0.2));
    }
}