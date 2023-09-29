import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testCase_CFG_C2 {
    @Test
    public void testcase1_CFG_C2() {
        assertEquals(-1,caculatorElectric.caculatorElectric(-1));
    }
    @Test
    public void testcase2_CFG_C2() {
        assertEquals(1500,caculatorElectric.caculatorElectric(1));
    }
    @Test
    public void testcase3_CFG_C2() {
        assertEquals(76700,caculatorElectric.caculatorElectric(51));
    }
    @Test
    public void testcase4_CFG_C2() {
        assertEquals(260000,caculatorElectric.caculatorElectric(150));
    }
    @Test
    public void testcase5_CFG_C2() {
        assertEquals(485000,caculatorElectric.caculatorElectric(250));
    }
    @Test
    public void testcase6_CFG_C2() {
        assertEquals(890000,caculatorElectric.caculatorElectric(400));
    }
}
