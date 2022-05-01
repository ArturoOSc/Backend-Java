import java.awt.*;

public class Show2099 {
    public static void main(String[] args) throws InterruptedException {
        Test2099();
    }
    private static void Test2099() throws InterruptedException{
        Screen screen = new Screen();
        Spdier2099 spdier2099 = new Spdier2099(
                03,
                "Miguel O' Hara",
                "Tierra-928",
                "Spider-Man 2099"
        );
        Runnable att2099 = new Runnable() {
            @Override
            public void run() {
                try {
                    spdier2099.colmillos(screen);
                    Thread.sleep(3000);

                    spdier2099.curacion(screen);
                    Thread.sleep(3000);

                    spdier2099.seniuelo(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread att2099Sp = new Thread(att2099);
        att2099Sp.start();
    }
}
