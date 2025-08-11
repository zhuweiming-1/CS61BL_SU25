import org.junit.Rule;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public abstract class TriangleTest {

    /**
     * For autograding purposes; do not change this line.
     */
    abstract Triangle getNewTriangle();

    /* ***** TESTS ***** */

    // Add additional tests for Triangle.java here that pass on a
    //  correct Triangle implementation and fail on buggy Triangle implementations.

    @Test
    public void testSidesFormTriangle() {
        // 安排 - 执行 - 断言
        Triangle t = getNewTriangle();
        assertWithMessage("actual is not expected")
                .that(t.sidesFormTriangle(-1, 2, 2)).isFalse();
        assertWithMessage("actual is not expected")
                .that(t.sidesFormTriangle(-1, -2, 2)).isFalse();
        assertWithMessage("actual is not expected")
                .that(t.sidesFormTriangle(-1, -2, -2)).isFalse();
        assertWithMessage("actual is not expected")
                .that(t.sidesFormTriangle(-1, 2, -2)).isFalse();
        assertWithMessage("actual is not expected")
                .that(t.sidesFormTriangle(1, 2, 2)).isTrue();
    }

    @Test
    public void testPointsFormTriangle() {
        Triangle t = getNewTriangle();
        assertWithMessage("actual is not expected")
                .that(t.pointsFormTriangle(1, 1, 3, 1, 3, 2)).isTrue();
        assertWithMessage("actual is not expected")
                .that(t.pointsFormTriangle(1, 2, 1, 3, 1, 4)).isFalse();
    }

    @Test
    public void testTriangleType() {
        Triangle t = getNewTriangle();
        assertWithMessage("actual is not expected")
                .that(t.triangleType(1, 1, 1)).isEqualTo("Equilateral");
        assertWithMessage("actual is not expected")
                .that(t.triangleType(1, 2, 2)).isEqualTo("Isosceles");
        assertWithMessage("actual is not expected")
                .that(t.triangleType(2, 3, 4)).isEqualTo("Scalene");
    }

    @Test
    public void testSquaredHypotenuse() {
        Triangle t = getNewTriangle();
        assertWithMessage("actual is not expected")
                .that(t.squaredHypotenuse(3, 4)).isEqualTo(25);
    }

    @Test
    public void test1() {
        // stub for first test
        Triangle t = getNewTriangle();
        // remember that you'll have to call on Triangle methods like
        // t.functionName(arguments), where t is a Triangle object

    }


}
