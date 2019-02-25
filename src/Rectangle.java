public class Rectangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double area;
    private double perimeter;

    // Initializes a default rectangle
    public Rectangle()
    {
        this.side1 = 1;
        this.side2 = 1;
    }

    // Initializes a rectangle with side1, side2
    public Rectangle(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    // Deteremines the area of the rectangle
    public double getArea()
    {
        area = side1 * side2;

        return area;
    }

    // Determines the perimeter of the rectangle
    public double getPerimeter()
    {
        perimeter = (2 * side1) + (2 * side2);

        return perimeter;
    }

    public String toString()
    {
        return " rectangle: \nSide1: " + side1 + "\nSide2: " + side2;
    }
}// END OF RECTANGLE CLASS
