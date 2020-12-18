import javax.swing.*;
import java.awt.*;

public class TabPaneUser extends JPanel {
    public TabPaneUser(){
        JTabbedPane menu = new JTabbedPane();

        menu.add("Login", new Login());
        menu.add("Register",new Register());

        menu.setFont(new Font(null, Font.BOLD, 14));
        setLayout(new GridLayout(1,2));

        add(menu);
        setVisible(true);
    }
}
