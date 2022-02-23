import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongFrame extends JFrame implements KeyListener {

    PongPanel panel = new PongPanel();

    PongFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.addKeyListener(this);

        while (true) {
            panel.repaint(1000);
        }
    }

    //TODO: fix concurrency
    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'w':
                panel.getPaddle1().goUp();
                break;

            case 's':
                panel.getPaddle1().goDown();
                break;

            case 'o':
                panel.getPaddle2().goUp();
                break;

            case 'l':
                panel.getPaddle2().goDown();
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
