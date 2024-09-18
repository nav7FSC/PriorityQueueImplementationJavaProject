package org.education;

/**
 * Represents a House with an owner and value.
 */
public class House {
    private String owner;
    private int value;

    /**
     * Default constructor for House.
     */
    public House() {
        this.owner = "";
        this.value = 0;
    }

    /**
     * Parameterized constructor for House.
     * @param owner the owner of the house
     * @param value the value of the house
     */
    public House(String owner, int value) {
        this.owner = owner;
        this.value = value;
    }

    /**
     * Copy constructor for House.
     * @param other the house to copy
     */
    public House(House other) {
        this.owner = other.owner;
        this.value = other.value;
    }

    /**
     * Creates a deep copy of the House.
     * @return a new House object
     */
    public House deepCopy() {
        return new House(this);
    }

    /**
     * Gets the owner of the house.
     * @return the owner of the house
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the owner of the house.
     * @param owner the new owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Gets the value of the house.
     * @return the value of the house
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the house.
     * @param value the new value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Checks if two houses are equal by comparing owners.
     * @param obj the other object to compare
     * @return true if the owners are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        House house = (House) obj;
        return owner.equals(house.owner);
    }

    @Override
    public String toString() {
        return owner + " - $" + value;
    }
}
