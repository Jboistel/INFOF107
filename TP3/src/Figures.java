public class Figures {
    public final Circle circle = new Circle();
    public final Rectangle rectangle = new Rectangle();
    public final Triangle triangle = new Triangle();
    public final Pentagon pentagon = new Pentagon();

    public Figures(){
        this.circle.radius = 0;
        this.rectangle.width = 0;
        this.rectangle.length = 0;
        this.triangle.side_a = 0;
        this.triangle.side_b = 0;
        this.triangle.side_c = 0;
    }

    public double circle_area() {
        // A = π r^2
        return circle.area();
    }
    public double circle_perimeter() {
        // P = 2πr
        return circle.perimeter();
    }

    public double rectangle_area() {
        // A = w * l
        return rectangle.area();
    }

    public double rectangle_perimeter() {
        // P = 2(w + l)
        return rectangle.perimeter();
    }

    public double triangle_area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (a + b + c) / 2, or 1/2 of the parameter of the triangle
        return triangle.area();
    }

    public double triangle_perimeter() {
        // P = a + b + c
        return triangle.perimeter();
    }

    public static void main(String[] args) {
        Figures f=new Figures();
        // Rectangle test
        f.rectangle.width = 5;
        f.rectangle.length = 7;
        System.out.println("Rectangle width: " + f.rectangle.width + " and length: " + f.rectangle.length
                + "\nResulting area: " + f.rectangle.area()
                + "\nResulting perimeter: " + f.rectangle.perimeter() + "\n");

        // Circle test
        f.circle.radius = 5;
        System.out.println("Circle radius: " + f.circle.radius
                + "\nResulting Area: " + f.circle.area()
                + "\nResulting Perimeter: " + f.circle.perimeter() + "\n");

        // Triangle test
        f.triangle.side_a = 5;
        f.triangle.side_b = 3;
        f.triangle.side_c = 4;
        System.out.println("Triangle sides lengths: " + f.triangle.side_a + ", " + f.triangle.side_b + ", " + f.triangle.side_c
                + "\nResulting Area: " + f.triangle.area()
                + "\nResulting Perimeter: " + f.triangle.perimeter() + "\n");
    }

}
