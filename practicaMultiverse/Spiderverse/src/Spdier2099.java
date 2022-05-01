public class Spdier2099 extends Spiderverse implements Spider2099Callbacks{
    public Spdier2099(int id, String name, String universe, String superhero_name) {
        super(id, name, universe, superhero_name);
    }

    @Override
    public void colmillos(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("colmillos.jpeg");
        s.setBounds(200, 100, 1100, 900);

    }

    @Override
    public void seniuelo(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("clon.jpeg");
        s.setBounds(200, 100, 1100, 900);

    }

    @Override
    public void curacion(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("curacion.jpeg");
        s.setBounds(200, 100, 1100, 900);

    }
}
