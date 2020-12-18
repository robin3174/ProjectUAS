import javax.swing.*;
import java.awt.*;

public class TxtRegister extends JPanel {
    static JTextField txtuser = new JTextField();
    static JTextField txtpass = new JTextField();
    public TxtRegister(){
        add(new JLabel("Username : "));
        add(txtuser);
        add(new JLabel("Password: "));
        add(txtpass);
        setLayout(new GridLayout(2,2));
    }
}
