import java.lang.Math;

class Circle {

    private double radius = 4.0;
    private double circumference = 8.0 * Math.PI;
    private double areas = (4.0 * 4.0) * Math.PI;

    public Circle (double r) {
        radius = r;
        circumference = (2 * radius) * Math.PI;
        areas = (radius * radius) * Math.PI;
    }
        /**
     * Gets side length
     * @return double representing side
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Gets perimeter
     * @return double representing perimeter
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * Gets area
     * @return double representing area
     */
    public double getAreas() {
        return areas;
    }

    public void setRadius(double r) {
        radius = r;
        circumference = (radius * 2) * Math.PI;
        areas = (radius * radius) * Math.PI;
    }
}