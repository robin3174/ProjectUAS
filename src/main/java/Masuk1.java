import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Masuk1 extends JPanel {
    static JTextField platmasuk = new JTextField();
    static JTextField durasiparkir = new JTextField();
    static JComboBox cmbkendaraan = new JComboBox(new String[] {"Mobil", "Motor"});

    public Masuk1(){
        setLayout(new GridLayout(3,2));

        add(new JLabel("Nomor Plat "));
        add(platmasuk);

        add(new JLabel("Jenis Kendaraan "));
        add(cmbkendaraan);

        add(new JLabel("Durasi Parkir"));
        add(durasiparkir);

        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder,"");
        titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));

        setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10,10,10,10),titledBorder));

    }
}
