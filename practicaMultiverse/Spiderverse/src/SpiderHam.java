public class SpiderHam extends Spiderverse implements SpiderHamCallbacks{
    public SpiderHam(int id, String name, String universe, String superhero_name){
        super(id, name, universe, superhero_name);
    }

    @Override
    public void superpowers(Screen s) {
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("spiderham.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void SuperFuerza(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("fuerza.jpeg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void telarania(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("telarania.jpeg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void velocidad(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("velocidad.jpeg");
        s.setBounds(200, 100, 1100, 900);
    }
}
