public abstract class GeometricObject
{
    private String colour = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Default GeometricObject
    protected GeometricObject()
    {
        dateCreated = new java.util.Date();
        this.colour = "white";
        this.filled = false;
    }

    // Initializes a GeometricObject
    protected GeometricObject(String colour, boolean filled)
    {
        dateCreated = new java.util.Date();
        this.colour = colour;
        this.filled = filled;
    }

    // Returns the colour of the object
    public String getColour()
    {
        return colour;
    }

    // Sets the colour of the object
    public void setColour(String colour)
    {
        this.colour = colour;
    }

    // Returns if the object is filled or not
    public boolean isFilled()
    {
        return filled;
    }

    // Sets if the object is filled or not
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    // Returns the date created
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    @Override
    public String toString()
    {
        return "\nCreated on: " + dateCreated + "\nColour: " + colour + " \nFilled: " + filled;
    }

    // Determines the area of the object
    public abstract double getArea();

    // Determines the perimeter of the object
    public abstract double getPerimeter();
}// END OF GEOMETRIC OBJECT CLASS
