import java.awt.*;

public class Paddle {

    public static final int PADDLE_LENGTH = 20;
    public static final int PADDLE_HEIGHT = 120;

    private int xCoord;
    private int yCoord;

    public Paddle(boolean side) {
        if (side) {
            xCoord = 5;
        } else {
            xCoord = PongPanel.PANEL_LENGTH - PADDLE_LENGTH - 5;
        }

        yCoord = 0;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.white);
        g.fillRect(xCoord, yCoord, PADDLE_LENGTH, PADDLE_HEIGHT);
    }
}
