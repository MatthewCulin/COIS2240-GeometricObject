class Main
{
    public static void main(String[] args)
    {
        // Creates the objects
        Circle circle = new Circle(5,5,5);
        EquilateralTriangle equiTriangle = new EquilateralTriangle(5);
        Triangle triangle = new Triangle(5,5,5);
        Rectangle rectangle = new Rectangle(5,5);
        Square square = new Square(5);

        GeometricObject[] objectArray = new GeometricObject[5];

        // Inputs each object into the objectArray
        objectArray[0] = circle;
        objectArray[1] = equiTriangle;
        objectArray[2] = triangle;
        objectArray[3] = rectangle;
        objectArray[4] = square;

        printAreaAndPerimeter(objectArray);
    }

    private static void printAreaAndPerimeter(GeometricObject[] objectArray)
    {
        for(int i = 0; i < 5; i++)
        {
            //System.out.println(objectArray.toString());
            System.out.println("\nThe object is a" + objectArray[i]);
            System.out.println("Area: " + objectArray[i].getArea());
            System.out.println("Perimeter: " + objectArray[i].getPerimeter());
        }
    }
}// END OF TEST CLASS