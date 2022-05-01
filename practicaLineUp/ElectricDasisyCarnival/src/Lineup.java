public class Lineup {
    public static void main(String[] args) throws InterruptedException{
        TestLineup();
    }

    private static void TestLineup() throws InterruptedException{
        Screen screen = new Screen();
        Artist line = new Artist("");
        Artist artist1 = new Artist("1991");
        Artist artist2 = new Artist("A-TRAK");
        Artist artist3 = new Artist("CRAZE");
        Artist artist4 = new Artist("A-TRAK(HOUSE SET)");
        Artist artist5 = new Artist("A.M.C");
        Artist artist6 = new Artist("AC SLATER");
        Artist artist7 = new Artist("CHRIS LORENZO");
        Artist artist8 = new Artist("ACRAZE");
        Artist artist9 = new Artist("ADAM BEYER");
        Artist artist10 = new Artist("ADRENALIZE");
        Artist artist11 = new Artist("AIR2EARTH");
        Artist artist12 = new Artist("ALAN WALKER");
        Artist artist13 = new Artist("ALESSO");
        Artist artist14 = new Artist("ALIX PEREZ");
        Artist artist15 = new Artist("ALOK");
        Artist artist16 = new Artist("ALY & FILA");
        Artist artist17 = new Artist("ALYX ANDER");
        Artist artist18 = new Artist("ANDRW RAYEL");
        Artist artist19 = new Artist("ANFISA LETYAGO");
        Artist artist20 = new Artist("ANN CLUE");
        Artist artist21 = new Artist("ARMIN VAN BUUREN");
        Artist artist22 = new Artist("ARMNHMR");
        Artist artist23 = new Artist("ASTRIX");
        Artist artist24 = new Artist("ATB");
        Artist artist25 = new Artist("ATDUSK");
        Artist artist26 = new Artist("ATLIENS");
        Artist artist27 = new Artist("AUDIEN");
        Artist artist28 = new Artist("AUDIOFREAK, CODE BLACK & TONESHIFTERZ PRESENT: 3 BLOKES");
        Artist artist29 = new Artist("AUTOGRAF");
        Artist artist30 = new Artist("JESSICA AUDIFFRED");



        Runnable show = new Runnable() {
            @Override
            public void run() {
                try {
                    line.Line(screen);
                    Thread.sleep(3000);

                    artist1.Artis1(screen);
                    Thread.sleep(3000);

                    artist2.Artis2(screen);
                    Thread.sleep(3000);

                    artist3.Artis3(screen);
                    Thread.sleep(3000);

                    artist4.Artis4(screen);
                    Thread.sleep(3000);

                    artist5.Artis5(screen);
                    Thread.sleep(3000);

                    artist6.Artis6(screen);
                    Thread.sleep(3000);

                    artist7.Artis7(screen);
                    Thread.sleep(3000);

                    artist8.Artis8(screen);
                    Thread.sleep(3000);

                    artist9.Artis9(screen);
                    Thread.sleep(3000);

                    artist10.Artis10(screen);
                    Thread.sleep(3000);

                    artist11.Artis11(screen);
                    Thread.sleep(3000);

                    artist12.Artis12(screen);
                    Thread.sleep(3000);

                    artist13.Artis13(screen);
                    Thread.sleep(3000);

                    artist14.Artis14(screen);
                    Thread.sleep(3000);

                    artist15.Artis15(screen);
                    Thread.sleep(3000);

                    artist16.Artis16(screen);
                    Thread.sleep(3000);

                    artist17.Artis17(screen);
                    Thread.sleep(3000);

                    artist18.Artis18(screen);
                    Thread.sleep(3000);

                    artist19.Artis19(screen);
                    Thread.sleep(3000);

                    artist20.Artis20(screen);
                    Thread.sleep(3000);

                    artist21.Artis21(screen);
                    Thread.sleep(3000);

                    artist22.Artis22(screen);
                    Thread.sleep(3000);

                    artist23.Artis23(screen);
                    Thread.sleep(3000);

                    artist24.Artis24(screen);
                    Thread.sleep(3000);

                    artist25.Artis25(screen);
                    Thread.sleep(3000);

                    artist26.Artis26(screen);
                    Thread.sleep(3000);

                    artist27.Artis27(screen);
                    Thread.sleep(3000);

                    artist28.Artis28(screen);
                    Thread.sleep(3000);

                    artist29.Artis29(screen);
                    Thread.sleep(3000);

                    artist30.Artis30(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread showLine = new Thread(show);
        showLine.start();
    }


}