import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Keluar1 extends JPanel {
    static JTextField tiketkeluar = new JTextField();
    static JTextField platkeluar = new JTextField();
    static JTextField jeniskendaraankeluar = new JTextField();
    static JTextField durasiparkir = new JTextField();
    static JTextField biayaparkir = new JTextField();
    static JTextField biayatotal = new JTextField();

    public Keluar1(){
        add (new JLabel("No Tiket"));
        add (tiketkeluar);
        tiketkeluar.setEditable(false);
        tiketkeluar.setBackground(Color.white);

        add (new JLabel("No Plat"));
        add (platkeluar);
        platkeluar.setEditable(false);
        platkeluar.setBackground(Color.white);

        add (new JLabel("Jenis Kendaraan"));
        add (jeniskendaraankeluar);
        jeniskendaraankeluar.setEditable(false);
        jeniskendaraankeluar.setBackground(Color.white);

        add (new JLabel("Durasi Parkir"));
        add (durasiparkir);
        durasiparkir.setEditable(false);
        durasiparkir.setBackground(Color.white);

        add (new JLabel("Biaya Parkir"));
        add (biayaparkir);
        biayaparkir.setEditable(false);
        biayaparkir.setBackground(Color.white);

        add (new JLabel("Biaya Total"));
        add (biayatotal);
        biayatotal.setEditable(false);
        biayatotal.setBackground(Color.white);


        setLayout(new GridLayout(8,1));
        setVisible(true);

        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder,"");
        titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));

        setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10,10,10,10),titledBorder));

    }
}
