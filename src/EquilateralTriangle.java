public class EquilateralTriangle extends Triangle
{
    private double side;
    private double area;
    private double perimeter;

    // Initializes a default equilateral triangle
    public EquilateralTriangle()
    {
        this.side = 1.0;
    }

    // Iitializes an equilateral triangle with side
    public EquilateralTriangle(double side)
    {
        this.side = side;

        Triangle equalTriangle = new Triangle(side, side, side);
    }

    // Determines the area of the equilateral triangle
    public double getArea()
    {
        double s = (3 * side) / 2;
        area = Math.sqrt(s * (s - side) * (s - side) * (s - side));

        return Math.round(area * 10d)/10d;
    }

    // Determines the perimeter of the equilateral triangle
    public double getPerimeter()
    {
        perimeter = 3 * side;
        return Math.round(perimeter * 10d)/10d;
    }

    public String toString()
    {
        return "n equilateral triangle: \nSide: " + side;
    }
}// END OF EQUILATERAL TRIANGLE CLASS
