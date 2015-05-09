package model;

/**
 * Created by Doherty on 5/8/2015.
 */
public class Statistics {

    //--Primary stats---------------------------------
    private int health;
    private int mana;
    private int experience;
    private int strength;
    private int endurance;
    private int agility;

    //--Constructors----------------------------------

    //Copy constructor
    public Statistics(Statistics stats) {
        this.health = stats.health;
        this.mana = stats.mana;
        this.experience = stats.experience;
        this.strength = stats.strength;
        this.endurance = stats.endurance;
        this.agility = stats.agility;
    }

    //Custom constructor - Used for loading the game
    public Statistics(int health, int mana, int experience, int strength, int endurance, int agility) {
        this.health = health;
        this.mana = mana;
        this.experience = experience;
        this.strength = strength;
        this.endurance = endurance;
        this.agility = agility;
    }

    //--Getters and Setters---------------------------
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void changeHealth(int amt) {
        this.health += amt;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    //TODO - Figure out good, balanced calculations for these and find more dependent stats to use
    //--Dependent Stats-------------------------------
    //Dependent on current health, endurance and agility
    public int getStamina() {
        return 0;
    }

    //Dependent on current health and agility
    public int getMovement() {
        return 0;
    }

    //Dependent on experience
    public int getLevel() {
        return 0;
    }

    //Dependent on strength, health and equipment
    public int getPower() {
        return 0;
    }

    //Dependent on endurance, agility, health and equipment
    public int getDefence() {
        return 0;
    }

}
