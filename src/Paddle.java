import java.awt.*;

public class Paddle {

    public static final int PADDLE_LENGTH = 20;
    public static final int PADDLE_HEIGHT = 120;
    public static final int PADDLE_VELOCITY = 25;

    private int xCoord;
    private int yCoord;
    private Color color;

    public Paddle(boolean side) {
        if (side) {
            xCoord = 5;
            color = Color.red;
        } else {
            xCoord = PongPanel.PANEL_LENGTH - PADDLE_LENGTH - 5;
            color = Color.blue;
        }

        yCoord = 0;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(xCoord, yCoord, PADDLE_LENGTH, PADDLE_HEIGHT);
    }

    public void goUp() {
        yCoord -= PADDLE_VELOCITY;
    }

    public void goDown() {
        yCoord += PADDLE_VELOCITY;
    }

    public int getxCoord() {
        return xCoord;
    }


    public int getyCoord() {
        return yCoord;
    }

}
