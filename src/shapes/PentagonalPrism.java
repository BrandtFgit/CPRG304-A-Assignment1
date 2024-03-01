package shapes;
/**
 * PentagonalPrism
 * @author Brandt Fowler
 */
public class PentagonalPrism extends BaseGeometricShape
{
	private double sideLength;
	
	/**
     * Constructs an Pentagonal Prism with the specified height and side length.
     *
     * @param height the height of the Pentagonal Prism
     * @param sideLength the side length of the Pentagonal Prism
     */
	public PentagonalPrism(double height, double sideLength) {
		super(height);
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return this.sideLength;
	}
	
	@Override
	public double getBaseArea() {
		return (5 * Math.pow(sideLength, 2) * Math.tan(Math.toRadians(54))) / 4;
	}
	
	@Override
	public double getVolume() {
		return getBaseArea() * height;
	}
}
