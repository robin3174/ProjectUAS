import javax.swing.*;
import java.awt.*;

class TextKeluar extends JPanel {
    JLabel notif = new JLabel("Klik data parkir anda pada tabel yang tersedia untuk melakukan checkout", SwingConstants.CENTER);

    public TextKeluar(){
        add(notif);

        notif.setFont(new Font(null, Font.BOLD, 16));
    }
}
