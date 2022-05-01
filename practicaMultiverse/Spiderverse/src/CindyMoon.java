public class CindyMoon extends Spiderverse implements CindyCallbacks{
    public CindyMoon(int id, String name, String universe, String superhero_name) {
        super(id, name, universe, superhero_name);
    }

    @Override
    public void garras(Screen s) {
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("garras.jpeg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void telaraniaOrg(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("telaraniaCind.jpeg");
        s.setBounds(200, 100, 1100, 900);

    }

    @Override
    public void conexionSpider(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("spideru.jpeg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void hiperSense(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("sense.jpeg");
        s.setBounds(200, 100, 1100, 900);
    }
}
