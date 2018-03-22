package oregontrailpackage;

/**
 * Represents a member of the player's party
 * @author Kyle Hohman
 */
public class PartyMember {
    /**
     * Holds the symbolic constants for the different conditions a party member can be
     */
    public static class Condition {
        /*
        0     - Healthy
        1 - 2 - Broken bones
        3 - 7 - Sicknesses
        */
        public static final int HEALTHY       = 0;
        public static final int BROKEN_ARM    = 1;
        public static final int BROKEN_LEG    = 2;
        public static final int TYPHOID_FEVER = 3;
        public static final int CHOLERA       = 4;
        public static final int DYSENTERY     = 5;
        public static final int DIPHTHERIA    = 6;
        public static final int MESALES       = 7;
    }
    
    private final String name; //The party member's name
    private int condition;     //The current condition of the party member
    private int health;        //The party member's health
    
    /**
     * Creates a new party member with the given name. Condition is set to healthy
     * @param name the name for the new party member
     */
    public PartyMember(String name){
        this.name = name;
        this.condition = Condition.HEALTHY;
    }

    /**
     * Returns the party member's name
     * @return the party member's name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Returns the party member's current condition
     * @return the party member's current condition
     */
    public int getCondiditon() {
        return condition;
    }
    
    /**
     * Sets the party member's current condition to the provided condition
     * @param condition the condition to set the party member's condition to
     */
    public void setCondition(int condition){
        this.condition = condition;
    }
    
    /**
     * Returns the player's health
     * @return the player's health
     */
    public int getHealth(){
        return health;
    }
    
    /**
     * Sets the party member's health to the provided number
     * @param health the number to set the player's health to
     */
    public void setHealth(int health){
        this.health = health;
    }
}
