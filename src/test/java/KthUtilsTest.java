import org.junit.Test;

import static org.junit.Assert.*;

public class KthUtilsTest {

    @Test
    public void kth_isCorrect() {
        // since there are two 5s in the input array, our 3rd and 4th smallest numbers should be a '5'
        int result = KthUtils.findKthSmallestNumber(new int[]{5, 12, 11, -1, 12}, 3); // { -1, 5, 11, 12, 12 }
        assertEquals(11, result);
    }
}