public class Pos2D {
    private double x, y;

    public Pos2D() {}

    public Pos2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Pos2D generateRnd() {
        return new Pos2D(StdRandom.uniform(), StdRandom.uniform());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
