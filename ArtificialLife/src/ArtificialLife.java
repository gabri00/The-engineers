import java.util.LinkedList;
import java.util.List;

public class ArtificialLife {
    private static final long STEPS = 100;

    private int birthRate, foodRate, cycles;

    private LinkedList<Creature> creatures;
    private LinkedList<Food> foods;

    public ArtificialLife(int birthRate, int foodRate, int cycles) {
        assert (birthRate > 0 && foodRate > 0 && cycles > 0);

        this.birthRate = birthRate;
        this.foodRate = foodRate;
        this.cycles = cycles;

        creatures = new LinkedList<>();
        foods = new LinkedList<>();
    }

    public void simulate() {
        boolean updateCnv = false;

        for (int step = 0; step < cycles; ++step) {
            // Spawn creature every birthRate cycles
            if (step % birthRate == 0) {
                creatures.add(new Creature());
                updateCnv = true;
            }

            // Spawn food area every foodRate cycles
            if (step % foodRate == 0) {
                foods.add(new Food(StdRandom.uniform(Food.MIN_RADIUS, Food.MAX_RADIUS)));
                updateCnv = true;
            }

            LinkedList<Creature> deaths = new LinkedList<>();
            LinkedList<Food> emptyArea = new LinkedList<>();

            for (Creature c : creatures) {
                boolean hasEaten = false;

                for (Food f : foods) {
                    if (c.canEat(f)) {
                        f.consumeFood(1);
                        c.updateHp(true);
                    }

                    if (f.getHp() < 0) {
                        emptyArea.add(f);
                        updateCnv = true;
                    }
                }

                if (!hasEaten) c.updateHp(false);

                if (c.getHp() < 0) {
                    deaths.add(c);
                    updateCnv = true;
                }
            }

            if (updateCnv) {
                for (Creature c : deaths) creatures.remove(c);
                for (Food f : emptyArea) foods.remove(f);

                StdDraw.clear();

                for (Food f : foods) f.draw();
                for (Creature c : creatures) c.draw();

                updateCnv = false;
            }

            try {
                Thread.sleep(STEPS);
            }
            catch (InterruptedException e) {}
        }
    }

    public int getFoodCount() {
        return foods.size();
    }

    public int getCreatureCount() {
        return creatures.size();
    }
}
