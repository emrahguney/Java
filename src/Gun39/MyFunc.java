package Gun39;

import java.util.concurrent.CountDownLatch;

public class MyFunc {
    //TimeUnit.SECONDS.sleep(1) direk saniyeli verir
    //1000 mills=1 saniye
    public static void bekle(int saniye){
        try {
            Thread.sleep(1000 *saniye); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
