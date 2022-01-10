public class Creature implements Drawable {
    public static final int INITIAL_HP = 10;
    private static final double SIZE = 0.01;

    private static int populationCount = 0;
    private static int totalCreations = 0;

    private Pos2D pos;
    private int hp;

    public Creature() {
        pos = new Pos2D();
        pos = pos.generateRnd();

        hp = INITIAL_HP;

        populationCount++;
        totalCreations++;
    }

    public void updateHp(boolean hasEaten) {
        if (hasEaten) hp++;
        else hp--;
    }

    public boolean canEat(Food f) {
        double dist = Math.sqrt(Math.pow(getPos().getX() - f.getPos().getX(), 2) + Math.pow(getPos().getY() - f.getPos().getY(), 2));
        return dist < f.getRadius();
    }

    @Override
    public void draw() {
        StdDraw.filledCircle(pos.getX(), pos.getY(), SIZE);
    }

    protected void finalize() {
        populationCount--;
    }

    public Pos2D getPos() {
        return pos;
    }

    public int getHp() {
        return hp;
    }

    public static int getObjCount() {
        return populationCount;
    }

    public static int getTotalCreations() {
        return totalCreations;
    }
}
