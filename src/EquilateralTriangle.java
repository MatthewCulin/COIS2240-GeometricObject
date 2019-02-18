public class EquilateralTriangle extends Triangle
{
    private double side;
    private double area;
    private double perimeter;

    public EquilateralTriangle()
    {
        this.side = 1.0;
    }

    public EquilateralTriangle(double side)
    {
        this.side = side;

        Triangle equalTriangle = new Triangle(side, side, side);
    }

    public double getArea()
    {
        double height;
        double base;
        double heightCalc;

        base = side;
        heightCalc = (side * side) - ((base/2) * (base/2));

        java.lang.Math.sqrt(heightCalc);

        height = heightCalc;

        area = (base * height)/2;
        return area;
    }

    public double getPerimeter()
    {
        perimeter = 3 * side;
        return perimeter;
    }
}// END OF EQUILATERAL TRIANGLE CLASS
