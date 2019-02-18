public class Circle extends GeometricObject
{
    private double x;
    private double y;
    private double radius;
    private double pi = 3.14159265359;
    private double area;
    private double perimeter;

    public Circle()
    {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // Creates a circle
    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Returns the area of the circle
    public double getArea()
    {
        area = pi * (radius * radius);

        return area;
    }

    // Returns the perimeter of the circle
    public double getPerimeter()
    {
        perimeter = 2 * pi * radius;

        return perimeter;
    }

}// END OF CIRCLE CLASS
