import java.awt.*;
public class OctoBarbie {
    public static void main(String[] args) throws InterruptedException {
        TestOcto();
    }

    private static void TestOcto() throws InterruptedException{
        Screen screen = new Screen();
        NuxtOcat nuxtOcat = new NuxtOcat(
                01,
                "NUXtOcat",
                "Salir a pasear mariposas virtuales."
        );

        FintechtOcat fintechtOcat = new FintechtOcat(
                02,
                "Fintechtocat",
                "Ser un guru del mundo Fintech."
        );

        BoxertOcat boxertOcat = new BoxertOcat(
                03,
                "Boxertocat",
                "Pelear con los mejores boxeadores del mundo."
        );

        DinotOcat dinotOcat = new DinotOcat(
                04,
                "Dinotcat",
                "Matar algunos otros animales, peligrosisimos por cierto."
        );

        MummytOcat mummytOcat = new MummytOcat(
                05,
                "Mummytocat",
                "Le gusta salir una vez al año, preferible en noche de brujas."
        );

        DaftpunkOcat daftpunkOcat = new DaftpunkOcat(
                06,
                "Daftpunktocat-Guy",
                "Le encantan los festivales de musica electrónica, aunque por el momento esta retirado :("
        );
        Runnable actv = new Runnable() {
            @Override
            public void run() {
                try{
                    nuxtOcat.activities(screen);
                    Thread.sleep(3000);

                    fintechtOcat.activities(screen);
                    Thread.sleep(3000);

                    boxertOcat.activities(screen);
                    Thread.sleep(3000);

                    dinotOcat.activities(screen);
                    Thread.sleep(3000);

                    mummytOcat.activities(screen);
                    Thread.sleep(3000);

                    daftpunkOcat.activities(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        Thread actyOct = new Thread(actv);
        actyOct.start();
    }
}
