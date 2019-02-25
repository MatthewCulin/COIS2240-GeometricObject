public class Square extends Rectangle
{
    private double side;
    private double area;
    private double perimeter;

    // Initializes a default square
    public Square()
    {
        this.side = 1;
    }

    // Initializes a square with side
    public Square(double side)
    {
        this.side = side;

        Rectangle rectangleSquare = new Rectangle(side, side);
    }

    // Determines the area of the square
    public double getArea()
    {
        area = side * side;
        return area;
    }

    // Determines the perimeter of the square
    public double getPerimeter()
    {
        perimeter = 4 * side;

        return perimeter;
    }

    public String toString()
    {
        return " square:" + "\nSide: " + side;
    }

}// END OF SQUARE CLASS
