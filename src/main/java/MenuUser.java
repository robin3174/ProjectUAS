import javax.swing.*;
import javax.swing.plaf.TabbedPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUser extends JFrame {

    public MenuUser() {
        setTitle("Login / Register");
        setSize(640, 360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new TitleUser(),BorderLayout.NORTH);
        add(new TabPaneUser(),BorderLayout.CENTER);



        setVisible(true);

    }
}
