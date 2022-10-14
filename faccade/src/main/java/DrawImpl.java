public class DrawImpl implements Draw {
    @Override
    public void drawLineDown() {
        System.out.println("-----");
    }

    @Override
    public void drawLineUp() {
        System.out.println("-----");
    }

    @Override
    public void drawLineLeftRight() {
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
    }
}
