class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;
    private double area;

    // Initializes a default triangle
    public Triangle()
    {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Iniitializes a triangle with side1, side2, side3
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Determines the area of the triangle
    public double getArea()
    {
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return Math.round(area * 10d)/10d;
    }

    // Determines the perimeter of the triangle
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    public String toString()
    {
        // Implement it to return the three sides
        return " triangle: \nSide1 = " + side1 + "\nSide2 = " + side2 + "\nSide3 = " + side3;
    }
}// END OF TRIANGLE CLASS
