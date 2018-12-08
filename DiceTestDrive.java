
class DiceTestDrive {
    public static void main(String[] args) {
        //this is how I aim to arrange the dice in Yahtzee
        Dice[] diceArray = {new Dice("A"), new Dice("B")}; 
        
        //Style 1
        for (Dice d: diceArray) {//tests roll and the in game dice display
            d.roll();
            System.out.println(d.label + ": " + d.value);
        }
        
        //Style 2
        for (Dice d: diceArray) {
            d.roll();
            System.out.print(d.label + " ");
        }
        System.out.println("");
        for (Dice d: diceArray){
            System.out.print(d.value + " ");
        }
        System.out.println("");
    }
}