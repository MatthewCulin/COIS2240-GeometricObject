public class Square extends Rectangle
{
    private double side;
    private double area;
    private double perimeter;

    public Square()
    {
        this.side = 1;
    }

    // Creates a square
    public Square(double side)
    {
        this.side = side;

        Rectangle rectangleSquare = new Rectangle(side, side);
    }

    // Returns the area of the square
    public double getArea()
    {
        area = side * side;
        return area;
    }

    // Returns the perimeter of the square
    public double getPerimeter()
    {
        perimeter = 4 * side;

        return perimeter;
    }

}// END OF SQUARE CLASS
