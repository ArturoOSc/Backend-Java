public class ShowSilk {
    public static void main(String[] args) throws InterruptedException{
        TestSilk();
    }
    private static void TestSilk() throws InterruptedException{
        Screen screen = new Screen();
        CindyMoon cindyMoon = new CindyMoon(
                02,
                "Cindy Moon",
                "Tiera-616",
                "Silk"
        );
        Runnable superSilk = new Runnable() {
            @Override
            public void run() {
                try {
                    cindyMoon.garras(screen);
                    Thread.sleep(3000);

                    cindyMoon.conexionSpider(screen);
                    Thread.sleep(3000);

                    cindyMoon.hiperSense(screen);
                    Thread.sleep(3000);

                    cindyMoon.telaraniaOrg(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread superSilkr = new Thread(superSilk);
        superSilkr.start();
    }
}
