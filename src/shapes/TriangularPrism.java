package shapes;
/**
 * TriangularPrism
 * @author Brandt Fowler
 */
public class TriangularPrism extends BaseGeometricShape
{
	private double sideLength;
	
	/**
     * Constructs an Triangular Prism with the specified height and side length.
     *
     * @param height the height of the Triangular Prism
     * @param sideLength the side length of the Triangular Prism
     */
	public TriangularPrism(double height) {
		super(height);
		
	}

	@Override
	public double getBaseArea() {
		return (Math.pow(sideLength, 2) * Math.sqrt(3))/4;
	}
	
	@Override
	public double getVolume() {
		return getBaseArea() * height;
	}
}
