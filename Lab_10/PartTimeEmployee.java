class PartTimeEmployee extends Employee implements TaxPayer {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

   
    public void payTax() {
        double salary = calculateSalary();
        System.out.println(name + " (Part-time) paid tax on salary: $" + (salary * 0.1));
    }
}