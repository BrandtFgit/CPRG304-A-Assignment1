package shapes;
/**
 * OctagonalPrism
 * @author Brandt Fowler
 */
public class OctagonalPrism extends BaseGeometricShape
{
	private double sideLength;
	
	/**
     * Constructs an Octagonal Prism with the specified height and side length.
     *
     * @param height the height of the Octagonal Prism
     * @param sideLength the side length of the Octagonal Prism
     */
	public OctagonalPrism(double height, double sideLength) {
		super(height);
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return this.sideLength;
	}
	
	@Override
	public double getBaseArea() {
		return 2 * (1 + Math.sqrt(2))*Math.pow(sideLength, 2);
	}
	
	@Override
	public double getVolume() {
		return getBaseArea() * height;
	}
}
