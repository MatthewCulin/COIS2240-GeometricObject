public class Rectangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double area;
    private double perimeter;

    public Rectangle()
    {
        this.side1 = 1;
        this.side2 = 1;
    }

    // Creates a rectangle
    public Rectangle(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    // Returns the area of the rectangle
    public double getArea()
    {
        area = side1 * side2;

        return area;
    }

    // Returns the perimeter of the rectangle
    public double getPerimeter()
    {
        perimeter = (2 * side1) + (2 * side2);

        return perimeter;
    }
}// END OF RECTANGLE CLASS
