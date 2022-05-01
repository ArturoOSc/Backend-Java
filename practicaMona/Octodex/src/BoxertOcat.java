public class BoxertOcat extends Octo implements ToctoCallbacks{
    public BoxertOcat(int id, String name, String activity) {
        super(id, name, activity);
    }

    @Override
    public void activities(Screen s) {
        s.setVisible(true);
        s.out(showMess(), "Helvetica", 28, Colors.blue);
        s.showImage("boxertocat_octodex.jpeg");
        s.setBounds(200, 100, 1100, 900);
    }
}

