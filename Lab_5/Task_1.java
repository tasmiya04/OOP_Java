public class Task_1 {
    public static void main(String[] args) {
        Book rdpd = new Book("Rich Dad & Poor Dad", "Robert Kiyosaki", true);
        Book twows = new Book("The Wolf of Wall Street", "Belfort", true);

        rdpd.Display_Book();
        System.out.println("=======================");
        twows.Display_Book();
        System.out.println("=======================");
        rdpd.Borrow_book();
        rdpd.Display_Book();
        System.out.println("=======================");
        rdpd.Return_Book();
        rdpd.Display_Book();
        System.out.println("=======================");

    }
}
