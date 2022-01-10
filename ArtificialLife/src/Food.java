public class Food implements Drawable {
    public static final double MIN_RADIUS = 0.05;
    public static final double MAX_RADIUS = 0.1;
    private static final int INITIAL_HP = 100;

    private static int foodCount = 0;

    private Pos2D pos;
    private double radius;
    private int hp;

    public Food(double radius) {
        assert((radius >= MIN_RADIUS) && (radius <= MAX_RADIUS));

        pos = new Pos2D();
        pos = pos.generateRnd();

        this.radius = radius;
        hp = INITIAL_HP;
        foodCount++;
    }

    public boolean canFeed(Creature c) {
        double dist = Math.sqrt(Math.pow(this.pos.getX() - c.getPos().getX(), 2) + Math.pow(this.pos.getY() - c.getPos().getY(), 2));
        return dist < radius;
    }

    public void consumeFood(int feeds) {
        assert (feeds >= 0);
        hp -= feeds;
    }

    @Override
    public void draw() {
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledCircle(pos.getX(), pos.getY(), radius);
        StdDraw.setPenColor(StdDraw.BLACK);
    }

    public void finalize() {
        foodCount--;
    }

    public Pos2D getPos() {
        return pos;
    }

    public double getRadius() {
        return radius;
    }

    public int getHp() {
        return hp;
    }

    public static int getObjCount() {
        return foodCount;
    }
}
