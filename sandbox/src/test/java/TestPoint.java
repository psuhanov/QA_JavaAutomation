import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {

    @Test

    public void testPoint() {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);
        assert p1.distanceTo(p2) == 28.284271247461902;


    }


}


