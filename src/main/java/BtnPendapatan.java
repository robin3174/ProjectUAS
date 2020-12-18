import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class BtnPendapatan extends JPanel {
    JButton btnTotal = new JButton("Total");

    public BtnPendapatan() throws SQLException {
        final Database db = new Database();

        add(btnTotal);
        btnTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    db.hitungPendapatan();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }
}
