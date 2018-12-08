
/*
 * Credit to https://stackoverflow.com/questions/8811815/is-it-possible-to-assign-numeric-value-to-an-enum-in-java
 * for teaching me how to use constructors and encapsulation
 * to assign String values to an enumerated constant
 */
public enum ScoreLabels //Names of the categories on a score sheet
{
    ACES ("Aces"),

    TWOS ("Twos"),

    THREES ("Threes"),

    FOURS ("Fours"),

    FIVES (""),

    SIXES (""),

    UPPER_SECTION_BONUS (""),

    UPPER_SECTION_TOTAL (""),

    THREE_OF_A_KIND (""),

    FOUR_OF_A_KIND (""),

    FULL_HOUSE (""),

    SMALL_STRAIGHT (""),

    LARGE_STRAIGHT (""),

    YAHTZEE (""),

    YAHTZEE_BONUS (""),

    CHANCE (""),

    LOWER_SECTION_TOTAL (""),

    GRAND_TOTAL ("")
    ;

    private final String name;

    ScoreLabels(String name) { //Possible because each constant is its own class.
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
