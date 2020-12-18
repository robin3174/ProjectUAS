import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnLogin extends JPanel {
    JButton btnLogin = new JButton("Login");

    public BtnLogin() {
        final Database db = new Database();

        add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.validasi();
            }
        });
    }
}
