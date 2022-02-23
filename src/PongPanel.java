import javax.swing.*;
import java.awt.*;

public class PongPanel extends JPanel {

    public static final int PANEL_LENGTH = 1300;
    public static final int PANEL_HEIGHT = 1000;

    private Paddle paddle1;
    private Paddle paddle2;
    private Ball ball;

    public PongPanel() {
        paddle1 = new Paddle(true);
        paddle2 = new Paddle(false);
        ball = new Ball();

        this.setPreferredSize(new Dimension(PANEL_LENGTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics = (Graphics2D) g;

        paddle1.draw(graphics);
        paddle2.draw(graphics);
        ball.draw(graphics);
    }

    public Paddle getPaddle1() {
        return paddle1;
    }

    public Paddle getPaddle2() {
        return paddle2;
    }

    public Ball getBall() {
        return ball;
    }
}
