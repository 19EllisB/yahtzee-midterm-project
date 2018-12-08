
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
        int upper = 0;
        int lower = 0;
        
        //upper tally
        for (int i = 0; i < 6; i++) { //runs through all the upper section categories
            upper += scores[i];
        }
        if (upper >= 63) { //condition for upper bonus; 35 pts.
            upper += 35;
            scores[ScoreLabel.UPPER_SECTION_BONUS.ordinal()] = 35;
        }
        scores[ScoreLabel.UPPER_SECTION_TOTAL.ordinal()] = upper;
        
        //lower tally
        for (int i = 8; i < 16; i++) { //range of the lower section
            lower += scores[i];
        }
        scores[ScoreLabel.LOWER_SECTION_TOTAL.ordinal()] = lower;
        
        //grand tally
        scores[ScoreLabel.GRAND_TOTAL.ordinal()] = upper + lower;
    }

    public void print() {
        tally(); //included so that tallying is implicit w/ printing
        for (ScoreLabel s: ScoreLabel.values()) { //Iterates across all values of the enum ScoreLabel
            //s.ordinal() returns the index of s in the ScoreLabel list
            //this.scores[s.ordinal()] is the score in scores associated with each ScoreLabel
            System.out.println(s.getName() + ": " + this.scores[s.ordinal()]);
        }
        System.out.println("");
    }

}