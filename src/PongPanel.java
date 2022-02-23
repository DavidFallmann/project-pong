import javax.swing.*;
import java.awt.*;

public class PongPanel extends JPanel {

    public PongPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D graphics = (Graphics2D) g;
        g.setColor(Color.white);

        g.fillRect(10, 10, 20, 120);

    }
}
