public class DrawFaccade {

    private Draw draw;

    public DrawFaccade() {
        this.draw = new DrawImpl();
    }


    public void printRectangle() {
        draw.drawLineUp();
        draw.drawLineLeftRight();
        draw.drawLineDown();
    }
}
