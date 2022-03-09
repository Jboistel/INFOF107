public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle() {
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }
}