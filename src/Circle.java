public class Circle extends GeometricObject
{
    private double x;
    private double y;
    private double radius;
    private double pi = 3.14159265359;
    private double area;
    private double perimeter;

    // Initializes a default circle
    public Circle()
    {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // Initializes a circle with x, y, radius
    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Determines the area of the circle
    public double getArea()
    {
        area = pi * (radius * radius);

        return Math.round(area * 10d)/10d;
    }

    // Determines the perimeter of the circle
    public double getPerimeter()
    {
        perimeter = 2 * pi * radius;

        return Math.round(perimeter * 10d)/10d;
    }

    public String toString()
    {
        return " circle: \nX: " + x + "\nY: " + y + "\nRadius: " + radius;
    }

}// END OF CIRCLE CLASS
