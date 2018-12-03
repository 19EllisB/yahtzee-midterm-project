import java.util.*;

public class Die{
    public int rankValue;
    public char nameValue;
    
    //kinds of ranks / face values  
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    
    public Die(int rank, char name) throws RuntimeException{
        if (rank < 1 || rank > 6) {
            throw new RuntimeException();
        } else {
            rankValue = rank;
            nameValue = name;
        }
    }
    
    public static String rankToString(int rank) {
        switch (rank) {
            case ONE:
            return "One";
            default:
            return null;
        }
    }
}