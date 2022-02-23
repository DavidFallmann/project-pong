import java.awt.*;

public class Ball extends Rectangle {

    public static final int BALL_RADIUS = 30;

    private int xCoord;
    private int yCoord;

    public Ball() {
        xCoord = PongPanel.PANEL_LENGTH / 2;
        yCoord = PongPanel.PANEL_HEIGHT / 2;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.white);
        g.fillOval(xCoord, yCoord, BALL_RADIUS, BALL_RADIUS);
    }
}
