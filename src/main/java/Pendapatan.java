import javax.swing.*;
import java.sql.SQLException;

public class Pendapatan extends JPanel {

    public Pendapatan() throws SQLException {

        add(new TabelPendapatan());
        add(new BtnPendapatan());
        add(new BoxPendapatan());

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        setVisible(true);
    }
}
