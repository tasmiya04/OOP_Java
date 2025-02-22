class Circle {
    double radius;
    String color;

    public Circle() {
        this.radius = 0.0;
        this.color = "";
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}