import java.awt.*;
import java.rmi.server.ExportException;

public class BeepPrintEx3 {
    public static void main(String[] args) {
        // Thread 클래스를 직접 상속받은 beepThread 클래스 타입의 객체를 이용함
//        Thread thread = new BeepThread();
//
//        thread.start();

        Thread thread = new Thread(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for (int i = 0; i < 5; i++) {
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                    }
                }
            }
        };

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
