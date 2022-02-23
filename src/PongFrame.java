import javax.swing.*;

public class PongFrame extends JFrame {

    PongPanel panel;

    PongFrame(){
        new PongPanel();
        this.setSize(500, 500);

        this.setVisible(true);
    }
}
