public class Employee {
    String Name;
    int Id;
    int Salary;
    int Amount;

    public Employee(String Name, int Id, int Salary){
        this.Name = Name;
        this.Id = Id;
        this.Salary = Salary;
    }

    public void increase_Salary(int Amount){
        Salary += Amount;
        System.out.println(Amount + " is Increased in your Salary ");
    }

    public void calculate_AnnualSalary(){
        System.out.println("Your Annual Salary is " + (Salary *= 12));
    }

    public void Display_Details(){
        System.out.println("Name of Employee " + Name);
        System.out.println("Your ID " + Id);
        System.out.println("Salary Package " + Salary);
    }

}
