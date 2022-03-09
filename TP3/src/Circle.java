public class Circle extends Shape {
    public double radius;
    public double pi;

    public Circle() {
        this.pi = Math.PI;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }
}