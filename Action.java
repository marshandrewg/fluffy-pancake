import java.util.Random;
/**
* Class for performing actions
*/
public class Action {
    /** Name of the action performed */
    private String name;
    /** Every action has an associated D20 diceroll */
    private int roll;
    private enum Actions{
        ATTACK, DEFEND, PICKUP, DODGE, DANCE, SEARCH, EQUIP, UNEQUIP, DROP;
    }
    /**
    * Creates an action given a name
    * @param name name of the action
    */
    public Action(String name) {
        setName(name);
        Random random = new Random();
        this.roll = random.nextInt(20) + 1;
    }
    
    /**
    * Sets the name of the action and checks if valid
    * @param name name of action
    */
    private void setName(String name) {
        this.name = name;
    }
    
}
