import javax.swing.*;

public class ParkirKeluar extends JPanel {

    public ParkirKeluar(){
        add(new TextKeluar());
        add(new Keluar3());
        add(new Keluar1());
        add(new Keluar2());


        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

    }
}
