package shapes;
/**
 * SquarePrism
 * @author Brandt Fowler
 */
public class SquarePrism extends BaseGeometricShape
{
	private double sideLength;
	
	/**
     * Constructs a Square Prism with the specified height and sideLength.
     *
     * @param height the height of the Square Prism
     * @param sideLength the side length of the Square Prism
     */
	public SquarePrism(double height, double sideLength) {
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
		return getBaseArea() * height;
	}
}
