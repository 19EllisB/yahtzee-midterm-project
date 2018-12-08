
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

    FIVES ("Fives"),

    SIXES ("Sixes"),

    UPPER_SECTION_BONUS ("Upper Section Bonus"),

    UPPER_SECTION_TOTAL ("Upper Section Total"),

    THREE_OF_A_KIND ("3 of a Kind"),

    FOUR_OF_A_KIND ("4 of a Kind"),

    FULL_HOUSE ("Full House"),

    SMALL_STRAIGHT ("Sm. Straight"),

    LARGE_STRAIGHT ("Lg. Sraight"),

    YAHTZEE ("Yahtzee"),

    YAHTZEE_BONUS ("Yahtzee Bonus"),

    CHANCE ("Chance"),

    LOWER_SECTION_TOTAL ("Lower Section Total"),

    GRAND_TOTAL ("GRAND TOTAL")
    ;

    private final String name;

    ScoreLabels(String name) { //Possible because each constant is its own class.
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
