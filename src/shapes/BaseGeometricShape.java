package shapes;

/**
 * Abstract class representing a base geometric shape.
 * @author Brandt Fowler
 */
public abstract class BaseGeometricShape implements Comparable<BaseGeometricShape>{
	protected double height;
	
	/**
     * Constructs a geometric shape with the specified height.
     *
     * @param height the height of the shape
     */
	public BaseGeometricShape(double height) {
        this.height = height;
    }
	
	/**
     * Calculates the base area of the shape.
     *
     * @return the base area of the shape
     */
    public abstract double getBaseArea();
    
    
    /**
     * Calculates the volume of the geometric shape.
     *
     * @return the volume of the shape
     */
    public abstract double getVolume();
	
    public double getHeight() {
    	return this.height;
    }
    /**
     * Compares this shape with another based on their heights.
     *
     * @param other the other geometric shape to compare with
     * @return a negative integer, zero, or a positive integer
     */
	@Override
	public int compareTo(BaseGeometricShape other) {
		return Double.compare(this.height, other.height);
	}
}
