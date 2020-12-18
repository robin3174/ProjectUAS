import javax.swing.*;
import java.awt.*;

public class TitleUser extends JPanel {
    public TitleUser(){
        JLabel judul = new JLabel("LOGIN / REGISTER");
        judul.setFont(new Font(null, Font.BOLD, 32));

        add(judul);
    }
}
