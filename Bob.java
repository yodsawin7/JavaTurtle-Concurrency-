public class Bob implements Runnable {
    private int positionX, positionY, round;
    private String penColor;
    public Bob(int positionX, int positionY, String penColor, int round) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        this.round = round;
    }
    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(5);
        bob.speed(2);
        for(int i=0;i<this.round;i++)
        {
            bob.forward(i/50.);
            bob.right(5);
        }
    }
}

