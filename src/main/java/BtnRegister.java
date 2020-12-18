import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnRegister extends JPanel {
    JButton btnSubmit = new JButton("Register");
    public BtnRegister() {

        final Database db = new Database();

        add(btnSubmit);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.InsertUser();

            }
        });
    }
}
