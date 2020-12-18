import javax.swing.*;
import java.awt.*;

public class TitlePanelParkir extends JPanel {
    public TitlePanelParkir() {
        JLabel judul = new JLabel("Data Parkir");
        judul.setFont(new Font(null, Font.BOLD, 32));

        add(judul);
    }
}