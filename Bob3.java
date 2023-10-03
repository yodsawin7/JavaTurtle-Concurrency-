public class Bob3 implements Runnable {
    private int positionX, positionY, round;
    private String penColor;

    public Bob3(int positionX, int positionY, String penColor, int round) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        this.round = round;
    }

    public Bob3() {
    }

    @Override
    public void run() {
        Turtle Bob2 = new Turtle(this.positionX, this.positionY);
        Bob2.penColor(this.penColor);
        Bob2.width(5);
        Bob2.speed(2);
        for (int i = 0; i < this.round; i++) {
            Bob2.forward(i / 50.);
            Bob2.left(5);

        }

    }

}

