public class ShowPork {
    public static void main(String[] args) throws InterruptedException{
        TestPork();
    }

    private static void TestPork() throws InterruptedException{
        Screen screen = new Screen();
        SpiderHam spiderHam = new SpiderHam(
                01,
                "Peter Porker",
                "Tieraa-8311",
                "Spider-Ham"
        );
        Runnable spidy = new Runnable() {
            @Override
            public void run() {
                try {
                    spiderHam.superpowers(screen);
                    Thread.sleep(3000);

                    spiderHam.SuperFuerza(screen);
                    Thread.sleep(3000);

                    spiderHam.telarania(screen);
                    Thread.sleep(3000);

                    spiderHam.velocidad(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread spidyPork = new Thread(spidy);
        spidyPork.start();
    }
}

