package shapes;
/**
 * Cylinder
 * @author Brandt Fowler
 */
public class Cylinder extends BaseGeometricShape
{
	private double radius;
	
	/**
     * Constructs a Cylinder with the specified height and radius.
     *
     * @param height the height of the Cylinder
     * @param radius the radius of the Cylinder
     */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	@Override
	public double getBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double getVolume() {
		return getBaseArea() * height;
	}
}
