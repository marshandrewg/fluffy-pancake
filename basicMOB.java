public class basicMOB{
    /** Health of the MOB */
    private int health;
    /** Damage dealt by the MOB */
    private int damage;
    /** Armor of the MOB */
    private int armor;
    /** Name of the MOB */
    private String name;
    
    /**
    * Creates MOB object given name, health, armor, and damage
    * @param name MOB name
    * @param health MOB health
    * @param armor MOB armor
    * @param damage MOB damage
    */
    public basicMOB(String name, int health, int armor, int damage) {
        setName(name);
        setHealth(health);
        setArmor(armor);
        setDamage(damage);
    }
    
    /**
    * Sets the name of the MOB
    * @param name MOB name
    */
    private setName(String name) {
        this.name = name;
    }
    
    /**
    * Sets the health of the MOB
    * @param health MOB health
    */
    private setHealth(int health) {
        this.health = health;
    }
    
    /**
    * Sets the armor of the MOB
    * @param armor MOB armor
    */
    private setArmor(int armor) {
        this.armor = armor;
    }
    
    /**
    * Sets the damage of the MOB
    * @param damage MOB damage
    */
    private setDamage(int damage) {
        this.damage = damage;
    }
}
