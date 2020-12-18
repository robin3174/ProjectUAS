import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keluar2 extends JPanel{
    JButton btnCheckout = new JButton("Checkout");
    JButton clear = new JButton("Bersihkan");

    public Keluar2() {
        final Database db = new Database();
        add(btnCheckout);
        add(clear);

        btnCheckout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.checkout();
                Keluar1.tiketkeluar.setText("");
                Keluar1.platkeluar.setText("");
                Keluar1.jeniskendaraankeluar.setText("");
                Keluar1.durasiparkir.setText("");
                Keluar1.biayaparkir.setText("");
                Keluar1.biayatotal.setText("");
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Keluar1.tiketkeluar.setText("");
                Keluar1.platkeluar.setText("");
                Keluar1.jeniskendaraankeluar.setText("");
                Keluar1.durasiparkir.setText("");
                Keluar1.biayaparkir.setText("");
                Keluar1.biayatotal.setText("");
            }
        });

    }

}