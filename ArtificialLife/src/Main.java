import javax.swing.*;

public class Main {
    private static ArtificialLife world;

    private static String dumpData(String header) {
        return header + "\n" +
                "Spawned creatures: " + Creature.getTotalCreations() + "\n" +
                "Active creatures: " + Creature.getObjCount() + "\n" +
                (world != null ? "creatures in simulator: " + world.getCreatureCount() + "\n" : "") +
                "Active feeding areas: " + Food.getObjCount() + "\n" +
                (world != null ? "Feeding areas in simulator: " + world.getFoodCount() + "\n" : "");
    }

    public static void main(String[] args) {
        world = new ArtificialLife(2, 10, 1000);
        world.simulate();

        JOptionPane.showMessageDialog(null, "Simulation ended");

        String msg = dumpData("BEFORE forcing gc");
        JTextField textArea = new JTextField();
        textArea.setText(msg);
        JOptionPane.showMessageDialog(null, textArea);

        System.gc();

        msg = dumpData("AFTER forcing gc");
        textArea.setText(msg);
        JOptionPane.showMessageDialog(null, textArea);

        System.gc();

        msg = dumpData("AFTER forcing gc 2 times");
        textArea.setText(msg);
        JOptionPane.showMessageDialog(null, textArea);

        world = null;
        System.gc();

        msg = dumpData("AFTER setting world to null and forcing gc 3 times");
        textArea.setText(msg);
        JOptionPane.showMessageDialog(null, textArea);

        System.gc();

        msg = dumpData("AFTER setting world to null and forcing gc 4 times");
        textArea.setText(msg);
        JOptionPane.showMessageDialog(null, textArea);

        System.exit(0);
    }
}

// Made following prof Tacchella's code