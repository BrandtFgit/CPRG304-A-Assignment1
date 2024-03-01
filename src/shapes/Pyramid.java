package shapes;
/**
 * Pyramid
 * @author Brandt Fowler
 */
public class Pyramid extends BaseGeometricShape
{
	private double sideLength;
	
	/**
     * Constructs a Pyramid with the specified height and side length.
     *
     * @param height the height of the Pyramid
     * @param sideLength the side length of the Pyramid
     */
	public Pyramid(double height, double sideLength) {
		super(height);
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return this.sideLength;
	}
	
	@Override
	public double getBaseArea() {
		return Math.pow(sideLength, 2);
	}
	
	@Override
	public double getVolume() {
		return 1/3 * (getBaseArea() * height);
	}
}
