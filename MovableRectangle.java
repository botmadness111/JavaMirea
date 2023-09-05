public class MovableRectangle implements Movable {
    private MovablePoint leftBot;
    private MovablePoint rightTop;
    private int center;

    MovableRectangle(int x1, int y1, int x2, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        leftBot = new MovablePoint(x1, y1, x1Speed, y1Speed);
        rightTop = new MovablePoint(x2, y2, x2Speed, y2Speed);
    }

    public String toString() {
        return "leftBot: " + leftBot.toString() + "   " + "rightTop " + rightTop.toString();
    }

    private boolean isSameSpeed() {
        return leftBot.getXSpeed() == rightTop.getXSpeed() && leftBot.getYSpeed() == rightTop.getYSpeed();
    }

    @Override
    public void moveUp() {
        if (isSameSpeed()) {
            leftBot.moveUp();
            rightTop.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (isSameSpeed()) {
            leftBot.moveDown();
            rightTop.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (isSameSpeed()) {
            leftBot.moveLeft();
            rightTop.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (isSameSpeed()) {
            leftBot.moveRight();
            rightTop.moveRight();
        }
    }
}
