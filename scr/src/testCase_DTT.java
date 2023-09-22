import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class testCase_DTT {
    @Test
    public void testcase1_DTT() {
        assertEquals(-1,caculatorElectric.caculatorElectric(-1));
    }
    @Test
    public void testcase2_DTT() {
        assertEquals(30000,caculatorElectric.caculatorElectric(20));
    }
    @Test
    public void testcase3_DTT() {
        assertEquals(109000,caculatorElectric.caculatorElectric(70));
    }
    @Test
    public void testcase4_DTT() {
        assertEquals(300000,caculatorElectric.caculatorElectric(170));
    }
    @Test
    public void testcase5_DTT() {
        assertEquals(535000,caculatorElectric.caculatorElectric(270));
    }
    @Test
    public void testcase6_DTT() {
        assertEquals(1170000,caculatorElectric.caculatorElectric(500));
    }
}
