
public class ScoreSheetTestDrive {
    public static void main(String[] args) {
        ScoreSheet sheet1 = new ScoreSheet();
        
        //test a blank print
        sheet1.print();
        
        //test additions and a new print
        sheet1.scores[3] = 9;
        sheet1.scores[17] = 9;
        sheet1.print();
        
        //test clear()
        sheet1.clear();
        sheet1.print();
        
        //test tally
        sheet1.scores[0] = 1;
        sheet1.scores[10] = 25;
        sheet1.tally();
        sheet1.print();
        //bonus application test
        sheet1.scores[1] = 200;
        sheet1.tally();
        sheet1.print();
    }
}