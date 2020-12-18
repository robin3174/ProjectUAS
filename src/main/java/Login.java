import javax.swing.*;

public class Login extends JPanel {

    public Login(){
        add(new TxtLogin());
        add(new BtnLogin());
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setVisible(true);
    }
}
