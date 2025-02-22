class Student {
    int id;
    String name;
    double[] grades;

    public Student(int id, String name, double[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public void displayAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        System.out.println("Average Grade: " + (sum / grades.length));
    }

    public double[] calc_Percentage() {
        double[] percentages = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            percentages[i] = (grades[i] / 200) * 100;
        }
        return percentages;
    }

    public String concat_id() {
        return id + name;
    }
}