package comparators;
import java.util.Comparator;
import shapes.BaseGeometricShape;

public class VolumeComparator implements Comparator<BaseGeometricShape> {
    @Override
    public int compare(BaseGeometricShape shape1, BaseGeometricShape shape2) {
        return Double.compare(shape1.getVolume(), shape2.getVolume());
    }
}
