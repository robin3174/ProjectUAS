import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class TabPanePanelParkir extends JPanel {
    public TabPanePanelParkir() throws SQLException {

        JTabbedPane menu = new JTabbedPane();

        menu.add("Parkir Masuk", new ParkirMasuk());
        menu.add("Parkir Keluar",new ParkirKeluar());
        menu.add("Pendapatan", new Pendapatan());

        menu.setFont(new Font(null, Font.BOLD, 14));
        setLayout(new GridLayout(1,2));

        add(menu);
        setVisible(true);
    }
}
