import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class MenuParkir extends JFrame {

    public MenuParkir() throws SQLException, ClassNotFoundException {

        setTitle("Menu Parkir");
        setSize(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new TitlePanelParkir(),BorderLayout.NORTH);
        add(new TabPanePanelParkir(),BorderLayout.CENTER);

        setVisible(true);
    }
}