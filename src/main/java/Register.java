import javax.swing.*;

public class Register extends JPanel {

    public Register() {
        add(new TxtRegister());
        add(new BtnRegister());
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setVisible(true);
    }
}
