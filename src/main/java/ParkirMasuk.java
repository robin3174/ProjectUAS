import javax.swing.*;

public class ParkirMasuk extends JPanel {

    public ParkirMasuk(){
        add(new Masuk1());
        add(new Masuk2());
        add(new Masuk3());

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

    }
}
