import org.junit.Test;

import static org.junit.Assert.*;

public class KthUtilsTest {

    @Test
    public void kth_isCorrect() {
        int result = KthUtils.findKthSmallestNumber(new int[]{5, 12, 11, -1, 12}, 3);
        assertEquals(11, result);
    }

    @Test
    public void kthEfficient_isCorrect() {
        int result = KthUtils.findKthSmallestNumberEfficient(new int[]{5, 12, 11, -1, 12}, 3);
        assertEquals(11, result);
    }
}