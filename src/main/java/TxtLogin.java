import javax.swing.*;
import java.awt.*;

public class TxtLogin extends JPanel {
    static JTextField txtuser = new JTextField();
    static JPasswordField txtpass = new JPasswordField();

    public TxtLogin() {
        add(new JLabel("Username : "));
        add(txtuser);
        add(new JLabel("Password: "));
        add(txtpass);
        setLayout(new GridLayout(2,2));
    }
}
