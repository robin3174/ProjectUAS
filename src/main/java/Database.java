

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


public class Database {
    private Connection db;
    static DefaultTableModel dtm;
    static DefaultTableModel dtm2;

    public Database() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/sistem_parkir";
            String user = "root";
            String password = "";

            Class.forName(driver);
            db = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tabel_parkir(){
        Masuk1.cmbkendaraan.addItem("");
        try {
            Object[] kolom = {"No Tiket", "No Plat", "Jenis Kendaraan", "Durasi"};

            dtm = new DefaultTableModel(null, kolom);
            Masuk3.table.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String sql = "SELECT no_tiket,no_plat,jenis_kendaraan,durasi_parkir FROM tabel_parkir";

            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getString("no_tiket"),
                        resultSet.getString("no_plat"),
                        resultSet.getString("jenis_kendaraan"),
                        resultSet.getString("durasi_parkir")
                };
                dtm.addRow(row);
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        /* Tabel keluar */
        try {
            Object[] kolom = {"No Tiket", "No Plat", "Jenis Kendaraan", "Durasi", "Biaya Parkir", "Biaya Total"};

            dtm = new DefaultTableModel(null, kolom);
            Keluar3.tableKeluar.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String sql = "SELECT * FROM tabel_parkir";

            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getString("no_tiket"),
                        resultSet.getString("no_plat"),
                        resultSet.getString("jenis_kendaraan"),
                        resultSet.getString("durasi_parkir"),
                        resultSet.getInt("biaya_parkir"),
                        resultSet.getInt("biaya_total")
                };
                dtm.addRow(row);
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        /* Tabel Pendapatan */
        try {
            Object[] kolom = {"No Tiket", "No Plat", "Jenis Kendaraan", "Durasi", "Biaya Parkir", "Biaya Total"};

            dtm2 = new DefaultTableModel(null, kolom);
            TabelPendapatan.tablePendapatan.setModel(dtm2);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String sql = "SELECT * FROM tabel_pendapatan";

            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getString("no_tiket"),
                        resultSet.getString("no_plat"),
                        resultSet.getString("jenis_kendaraan"),
                        resultSet.getString("durasi_parkir"),
                        resultSet.getInt("biaya_parkir"),
                        resultSet.getInt("biaya_total")
                };
                dtm2.addRow(row);
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void hitungPendapatan() throws SQLException {

        try {
            String sql = "SELECT sum(biaya_total) AS biaya2 FROM tabel_pendapatan";

            Statement statement = db.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Object[] row = {
                        result.getString("biaya2")
                };
                BoxPendapatan.pendapatantotal.setText(""+result.getString(1));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void Insert() {
        String no_plat = Masuk1.platmasuk.getText();
        String jenis_kendaraan = Masuk1.cmbkendaraan.getSelectedItem().toString();
        int durasi_parkir = Integer.parseInt(Masuk1.durasiparkir.getText());
        int biaya_total = 0;
        int biaya_parkir = 0;

        if (jenis_kendaraan == "Motor") {
            biaya_total = 3000 * durasi_parkir;
            biaya_parkir = 3000;
        } else if (jenis_kendaraan == "Mobil") {
            biaya_total = 5000 * durasi_parkir;
            biaya_parkir = 5000;
        }

        try {
            String sql = "INSERT INTO tabel_parkir (no_plat, jenis_kendaraan, durasi_parkir, biaya_parkir, biaya_total) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, no_plat);
            ps.setString(2, jenis_kendaraan);
            ps.setInt(3, durasi_parkir);
            ps.setInt(4, biaya_parkir);
            ps.setInt(5, biaya_total);

            ps.execute();
            tabel_parkir();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String sql = "INSERT INTO tabel_pendapatan (no_plat, jenis_kendaraan, durasi_parkir, biaya_parkir, biaya_total) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, no_plat);
            ps.setString(2, jenis_kendaraan);
            ps.setInt(3, durasi_parkir);
            ps.setInt(4, biaya_parkir);
            ps.setInt(5, biaya_total);

            ps.execute();
            tabel_parkir();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void checkout() {
        try {
            String sql = "DELETE FROM tabel_parkir WHERE no_tiket = " + Keluar1.tiketkeluar.getText() + "";
            PreparedStatement stmt = db.prepareStatement(sql);
            stmt.execute();
            tabel_parkir();
            JOptionPane.showMessageDialog(null,"Checkout Success");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Checkout Fail");
        }
    }

    public void InsertUser() {
        String username = TxtRegister.txtuser.getText();
        String password = TxtRegister.txtpass.getText();

        try {
            String sql = "INSERT INTO login (username, password) VALUES (?, ?)";
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);


            ps.execute();
            JOptionPane.showMessageDialog(null,"Register Success");
            TxtRegister.txtuser.setText("");
            TxtRegister.txtpass.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Register Failed");
            e.printStackTrace();
        }
    }

    public void validasi() {
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM login WHERE username = '" + TxtLogin.txtuser.getText() + "' AND password = '" + TxtLogin.txtpass.getText() + "'";
            Statement st = db.createStatement();
            ResultSet rsLogin = st.executeQuery(sql);

            rsLogin.next();
            rsLogin.last(); //mengecek jumlah baris pada hasil query
            if (rsLogin.getRow()==1){
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                // new FrmMenuUtama().setVisible(true); //<-- BILA MAU DIARAHKAN KE Frame Menu Utama

                new MenuParkir().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Maaf, Username / Password salah!");
                TxtLogin.txtuser.setText("");
                TxtLogin.txtpass.setText("");
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public boolean isConnected() { return (db != null); }
}