package model;

/**
 * Created by Doherty on 5/8/2015.
 */
public class Statistics {

    //Primary stats
    private int health;
    private int mana;
    private int experience;
    private int endurance;
    private int agility;

    //Constructors
    public Statistics() {
        setDefaultStats();
    }

    public Statistics(int health, int mana, int experience, int endurance, int agility) {

    }

    public void setDefaultStats() {
        this.health = 100;
        this.mana = 100;
        this.experience = 0;
        this.endurance = 10;
        this.agility = 10;
    }

    //Getters and Setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public int getStamina() {
        return agility * endurance * health / 1000;
    }

    public int getMovement() {
        return agility * health / 100;
    }

}
