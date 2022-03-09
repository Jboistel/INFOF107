public class Triangle extends Shape {
    public double side_a;
    public double side_b;
    public double side_c;

    public Triangle() {
    }

    @Override
    public double area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (a + b + c) / 2, or 1/2 of the parameter of the triangle
        double s = (side_a + side_b + side_c) / 2;
        return Math.sqrt(s * (s - side_a) * (s - side_b) * (s - side_c));
    }

    @Override
    public double perimeter() {
        // P = a + b + c
        return side_a + side_b + side_c;
    }
}