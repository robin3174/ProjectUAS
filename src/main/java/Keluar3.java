import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Keluar3 extends JPanel implements MouseListener {
    static JTable tableKeluar = new JTable();

    public Keluar3(){
        Database db = new Database();
        db.tabel_parkir();

        JScrollPane scrollPane = new JScrollPane(tableKeluar);
        tableKeluar.setFillsViewportHeight(true);
        tableKeluar.setEnabled(true);

        setLayout(new GridLayout(1, 1));
        setBorder(new EmptyBorder(10, 10, 0, 10));

        tableKeluar.addMouseListener(this);
        add(scrollPane);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Keluar1.tiketkeluar.setText(Database.dtm.getValueAt(tableKeluar.getSelectedRow(),0)+"");
        Keluar1.platkeluar.setText(Database.dtm.getValueAt(tableKeluar.getSelectedRow(),1)+"");
        Keluar1.jeniskendaraankeluar.setText(Database.dtm.getValueAt(tableKeluar.getSelectedRow(),2)+"");
        Keluar1.durasiparkir.setText(Database.dtm.getValueAt(tableKeluar.getSelectedRow(),3)+"");
        Keluar1.biayaparkir.setText(Database.dtm.getValueAt(tableKeluar.getSelectedRow(),4)+"");
        Keluar1.biayatotal.setText(Database.dtm.getValueAt(tableKeluar.getSelectedRow(),5)+"");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


