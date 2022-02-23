import javax.swing.*;

public class PongFrame extends JFrame {

    PongPanel panel;

    PongFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new PongPanel());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
