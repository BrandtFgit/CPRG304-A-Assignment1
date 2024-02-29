package shapes;
/**
 * Cone
 * @author Brandt Fowler
 */
public class Cone extends BaseGeometricShape
{
	private double radius;
	
	/**
     * Constructs a Cone with the specified height and radius.
     *
     * @param height the height of the Cone
     * @param radius the radius of the Cone
     */
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	@Override
	public double getBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double getVolume() {
		return 1/3 * (getBaseArea() * height);
	}
	
}
