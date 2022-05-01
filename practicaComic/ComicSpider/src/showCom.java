public class showCom {
    public static void main(String[] args) throws InterruptedException{
        TestCom();
    }

    private static void TestCom() throws InterruptedException{
        Screen screen = new Screen();
        Spiderman spiderman = new Spiderman(01, "The amazing Spiderman #1");

        Runnable secuence = new Runnable() {
            @Override
            public void run() {
                try {
                    spiderman.Part1(screen);
                    Thread.sleep(10000);

                    spiderman.Part2(screen);
                    Thread.sleep(10000);

                    spiderman.Part3(screen);
                    Thread.sleep(10000);

                    spiderman.Part4(screen);
                    Thread.sleep(10000);

                    spiderman.Part5(screen);
                    Thread.sleep(10000);

                    spiderman.Part6(screen);
                    Thread.sleep(10000);

                    spiderman.Part7(screen);
                    Thread.sleep(10000);

                    spiderman.Part8(screen);
                    Thread.sleep(10000);

                    spiderman.Part9(screen);
                    Thread.sleep(10000);

                    spiderman.Part10(screen);
                    Thread.sleep(10000);

                    spiderman.Part11(screen);
                    Thread.sleep(10000);

                    spiderman.Part12(screen);
                    Thread.sleep(10000);

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread secuenceCom = new Thread(secuence);
        secuenceCom.start();
    }

}
