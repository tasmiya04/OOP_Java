class Employee {
    String name;
    int Joining_year;
    String address;
    double salary;

    public Employee(String name, int Joining_year, String address, double salary) {
        this.name = name;
        this.Joining_year = Joining_year;
        this.address = address;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + " " + Joining_year + " " + address);
    }
}