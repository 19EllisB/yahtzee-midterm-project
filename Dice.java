
public class Dice {
    int value;
    String label;

    Dice (String label) {
        this.label = label;
    }

    public void roll() {
        value = (int) (Math.random() * 6) + 1; 
    }
}