package model.entity;

import model.occupation.Occupation;

/**
 * Created by Doherty on 5/8/2015.
 */
public class Statistics {

    //--Primary stats---------------------------------
    /**
     * Current health
     */
    private double health;

    /**
     * Current mana
     */
    private double mana;

    /**
     * Current experience
     */
    private double experience;

    /**
     * Strength - Improves max health, health regen, power level, etc.
     */
    private double strength;

    /**
     * Endurance - Improves max health, stamina regen, power level, etc.
     */
    private double endurance;

    /**
     * Agility - Improves max movement speed, experience gain, skill level, etc.
     */
    private double agility;

    /**
     * Arcane - Improves max mana, experience gain, skill level, etc.
     */
    private double arcane;

    /**
     * Capability - Gives a small boost to all dependent skills
     */
    private double capability;

    /**
     * Current level
     */
    private int level;

    /**
     * Occupation of the entity
     */
    private Occupation occupation;


    //--Constructors----------------------------------

    //Copy constructor
    public Statistics(Statistics stats) {
        this.health = stats.health;
        this.mana = stats.mana;
        this.experience = stats.experience;
        this.strength = stats.strength;
        this.endurance = stats.endurance;
        this.agility = stats.agility;
        this.capability = stats.capability;
        this.level = stats.level;
    }

    //Custom constructor - Used for loading the game


    public Statistics() {
        this.health = 100;
        this.mana = 100;
        this.experience = 0;
        this.strength = 0;
        this.endurance = 0;
        this.agility = 0;
        this.capability = 0;
        this.level = 0;
    }

    public Statistics(double health, double mana, double experience, double strength,
                      double endurance, double agility, double capability, int level) {
        this.health = health;
        this.mana = mana;
        this.experience = experience;
        this.strength = strength;
        this.endurance = endurance;
        this.agility = agility;
        this.capability = capability;
        this.level = level;
    }

    //--Getters and Setters---------------------------

    public double getHealth() {
        return health;
    }

    public double getMana() {
        return mana;
    }

    public double getExperience() {
        return experience;
    }

    public double getStrength() {
        return strength;
    }

    public double getEndurance() {
        return endurance;
    }

    public double getAgility() {
        return agility;
    }

    public double getCapability() {
        return capability;
    }

    public double getLevel() {
        return level;
    }


    //TODO - Figure out good, balanced calculations for these and find more dependent stats to use

    //--Dependent Stats-------------------------------

    /**
     * Dependent on current health, endurance and agility
     * @return
     */
    public double getStamina() {
        return (health * 1.0 + endurance * 1.5 + agility * 0.5 + capability * 0.25) / 3;
    }

    /**
     * Dependent on current health and agility
     * @return
     */
    public double getMovement() {
        return (health * 1.25 + agility * 1.5 + capability * 0.25) / 2;
    }

    /**
     * Dependent on strength, health and equipment
     * @return
     */
    public double getPower() {
        return 10;
    }

    /**
     * Dependent on endurance, agility, health and equipment
     * @return
     */
    public double getDefense() {
        return 10;
    }

    /**
     * Dependent on capability and experience
     * @return
     */
    public double getSkillLevel() {
        return 120;
    }

    /**
     * Dependent on strength, endurance, level and class
     * @return
     */
    public double getMaxHealth() {
        return 100;
    }

    /**
     * Dependent on arcane, level and class
     * @return
     */
    public double getMaxMana() {
        return 100;
    }

    //--Helper Methods--------------------------------
    /**
     * Changes health
     * @param health Amount of health to add. Negative numbers reduce health
     */
    public void changeHealth(double health) {
        if (this.health + health >= getMaxHealth()) {
            this.health = getMaxHealth();
        } else {
            this.health += health;
        }
    }

    /**
     * Calculates the amount of health needed to get to the next level
     * @return
     */
    public int getExperienceToPromotion() {
        return (int)(1000 * Math.pow(1.25, level));
    }

    /**
     * Calculates the total amount of experience you will have after achieving the next level
     * @return
     */
    public int getTotalExperienceForPromotion() {
        return (int)(1000 * Math.pow(1.25, level));
    }

    public static void main(String[] args) {
        //Statistics statistics = new Statistics(100, 100, , 100, 100, 100, 100, 13);

    }

}
