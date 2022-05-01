public class FintechtOcat extends Octo implements ToctoCallbacks {
    public FintechtOcat(int id, String name, String activity) {
        super(id, name, activity);
    }

    @Override
    public void activities(Screen s) {
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.blue);
        s.showImage("Fintechtocat.png");
        s.setBounds(200, 100, 1100, 900);
    }
}

