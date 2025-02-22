public class Task_5 {
    public static void main(String[] args) {
        double[] grades1 = {180, 190, 170, 179, 199};
        double[] grades2 = {200, 180, 160, 150, 140};

        Student s1 = new Student(1, "Moiz", grades1);
        Student s2 = new Student(2, "Zain", grades2);

        s1.displayAverageGrade();
        s2.displayAverageGrade();

        double[] percentages1 = s1.calc_Percentage();
        double[] percentages2 = s2.calc_Percentage();

        System.out.print("Percentages for Moiz: ");
        for (double p : percentages1) {
            System.out.print(p + " ");
        }
        System.out.println();

        System.out.print("Percentages for Zain: ");
        for (double p : percentages2) {
            System.out.print(p + " ");
        }
        System.out.println();

        System.out.println("Concatenated ID and Name for Moiz: " + s1.concat_id());
        System.out.println("Concatenated ID and Name for Zain: " + s2.concat_id());
    }
}
