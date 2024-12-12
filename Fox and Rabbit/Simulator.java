 import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class Simulator {
    private Field field;
    private List<Animal> animals;
    private Random rand;
 
    public Simulator(int depth, int width) {
        field = new Field(depth, width);
        animals = new ArrayList<>();
        rand = new Random();
        populate();
    }
 
    public void simulate(int steps) {
        for (int step = 0; step < steps; step++) {
            System.out.println("Simulation step: " + (step + 1));
            List<Animal> newAnimals = new ArrayList<>();
            for (Animal animal : animals) {
                animal.act(newAnimals);
            }
            animals.addAll(newAnimals);
            printField();
        }
    }
 
    private void populate() {
        int depth = field.getDepth();
        int width = field.getWidth();
 
        for (int row = 0; row < depth; row++) {
            for (int col = 0; col < width; col++) {
                if (rand.nextDouble() <= 0.02) {
                    Fox fox = new Fox(field, new Location(row, col));
                    animals.add(fox);
                } else if (rand.nextDouble() <= 0.08) {
                    Rabbit rabbit = new Rabbit(field, new Location(row, col));
                    animals.add(rabbit);
                }
            }
        }
    }
 
    private void printField() {
        for (int row = 0; row < field.getDepth(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                Object animal = field.getObjectAt(new Location(row, col));
                if (animal instanceof Fox) {
                    System.out.print("F ");
                } else if (animal instanceof Rabbit) {
                    System.out.print("R ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        Simulator simulator = new Simulator(10, 10);
        simulator.simulate(50);
    }
}
