class Rectangle extends Shape implements Printable {
    private double width;
    private double height;

    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    double area() {
        return width * height;
    }

    
    public void print() {
        System.out.println("This is a rectangle.");
    }
}