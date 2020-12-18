import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Masuk2 extends JPanel {
    JButton simpan = new JButton("Check In");
    JButton batal = new JButton("Batal");

    public Masuk2(){
        final Database db = new Database();

        add(simpan);
        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.Insert();
                Masuk1.platmasuk.setText("");
                Masuk1.durasiparkir.setText("");
            }
        });
    }
}
