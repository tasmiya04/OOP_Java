public class Main5 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Ammar", 101, 5000);
        PartTimeEmployee pte = new PartTimeEmployee("Moiz", 202, 80, 20);

        System.out.println(fte.name + "'s Salary: $" + fte.calculateSalary());
        fte.payTax();

        System.out.println(pte.name + "'s Salary: $" + pte.calculateSalary());
        pte.payTax();
    }
}