public class caculatorElectric {
    public static long caculatorElectric(int kWh) {
        if( kWh < 0 ) {
            return -1;
        } else if(kWh <= 50) {
            return kWh * 1500;
        } else if(kWh <= 100) {
            return 50 * 1500 + (kWh - 50) *1700;
        } else if(kWh <=200) {
            return  50 * 1500 + 50 * 1700 + (kWh - 100) * 2000;
        } else if(kWh <= 300) {
            return  50 * 1500 + 50 * 1700 + 100 * 2000 + (kWh - 200) * 2500;
        } else {
            return 50 * 1500 + 50 * 1700 + 100 * 2000 + 100 * 2500 + (kWh -300) *2800;
        }
    }
}
