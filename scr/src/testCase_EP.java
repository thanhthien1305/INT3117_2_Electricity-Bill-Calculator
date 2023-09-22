import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class testCase_EP {
    @Test
    public void testcase1_EP() {
        assertEquals(-1,caculatorElectric.caculatorElectric(-1));
    }
    @Test
    public void testcase2_EP() {
        assertEquals(1500,caculatorElectric.caculatorElectric(1));
    }
    @Test
    public void testcase3_EP() {
        assertEquals(76700,caculatorElectric.caculatorElectric(51));
    }
    @Test
    public void testcase4_EP() {
        assertEquals(260000,caculatorElectric.caculatorElectric(150));
    }
    @Test
    public void testcase5_EP() {
        assertEquals(485000,caculatorElectric.caculatorElectric(250));
    }
    @Test
    public void testcase6_EP() {
        assertEquals(890000,caculatorElectric.caculatorElectric(400));
    }
}
