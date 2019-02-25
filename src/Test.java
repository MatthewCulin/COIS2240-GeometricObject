class Main
{
    public static void main(String[] args)
    {
        // Creates the objects with input
        Circle circle = new Circle(5,5,5);
        EquilateralTriangle equiTriangle = new EquilateralTriangle(5);
        Triangle triangle = new Triangle(5,5,5);
        Rectangle rectangle = new Rectangle(5,5);
        Square square = new Square(5);

        // Creates objects without input
        Circle circle2 = new Circle();
        EquilateralTriangle equiTriangle2 = new EquilateralTriangle();
        Triangle triangle2 = new Triangle();
        Rectangle rectangle2 = new Rectangle();
        Square square2 = new Square();

        GeometricObject[] objectArray = new GeometricObject[10];

        // Inputs each object into the objectArray
        objectArray[0] = circle;
        objectArray[1] = equiTriangle;
        objectArray[2] = triangle;
        objectArray[3] = rectangle;
        objectArray[4] = square;
        objectArray[5] = circle2;
        objectArray[6] = equiTriangle2;
        objectArray[7] = triangle2;
        objectArray[8] = rectangle2;
        objectArray[9] = square2;


        printAreaAndPerimeter(objectArray);
    }

    // Method will print the object details from the GeometricObject array objectArray
    private static void printAreaAndPerimeter(GeometricObject[] objectArray)
    {
        // Loops through each array element
        for(int i = 0; i < 10; i++)
        {
            System.out.println("\nThe object is a" + objectArray[i]);
            System.out.println("Area: " + objectArray[i].getArea());
            System.out.println("Perimeter: " + objectArray[i].getPerimeter());
        }
    }
}// END OF TEST CLASS