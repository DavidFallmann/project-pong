import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {

    private static final int BALL_RADIUS = 15;
    private int ball_velocity = 2;
    private int xCoord;
    private int yCoord;
    private int xDirection;
    private int yDirection;

    public Ball() {
        xCoord = PongPanel.PANEL_LENGTH / 2;
        yCoord = PongPanel.PANEL_HEIGHT / 2;

        Random random = new Random();
        do {
            xDirection = random.nextInt(-1, 2);
        } while (xDirection == 0);
        yDirection = random.nextInt(-1, 2);
    }

    public int getBall_velocity() {
        return ball_velocity;
    }

    public void setBall_velocity(int ball_velocity) {
        this.ball_velocity = ball_velocity;
    }

    public void draw(Graphics2D g) {
        movement();
        g.setColor(Color.white);
        g.fillRect(xCoord, yCoord, BALL_RADIUS, BALL_RADIUS);
    }

    private void movement() {
        xCoord += xDirection * ball_velocity;
        yCoord += yDirection * ball_velocity;
    }
}
