import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TabelPendapatan extends JPanel {
    static JTable tablePendapatan = new JTable();

    public TabelPendapatan(){

        Database db = new Database();
        db.tabel_parkir();

        JScrollPane scrollPane = new JScrollPane(tablePendapatan);
        tablePendapatan.setFillsViewportHeight(true);
        tablePendapatan.setEnabled(true);

        setLayout(new GridLayout(1, 1));
        setBorder(new EmptyBorder(10, 10, 0, 10));

        add(scrollPane);

    }
}
