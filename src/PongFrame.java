import javax.swing.*;

public class PongFrame extends JFrame {

    PongPanel panel = new PongPanel();

    PongFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
