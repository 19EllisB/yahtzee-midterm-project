
public class ScoreSheet {
    int[] scores = new int[18];

    public void clear() {//resets all values to default
        /*for(int i: scores) { this loop does NOT work for some reason
            i = 0;
        }*/
        for (int i = 0; i < scores.length; i++) { //this loop is functional.
            scores[i] = 0;
        }
    }

    public void tally() {
        
    }
    
    public void print() {
        for (ScoreLabel s: ScoreLabel.values()) { //Iterates across all values of the enum ScoreLabel
            //s.ordinal() returns the index of s in the ScoreLabel list
            //this.scores[s.ordinal()] is the score in scores associated with each ScoreLabel
            System.out.println(s.getName() + ": " + this.scores[s.ordinal()]);
        }
        System.out.println("");
    }
    
}