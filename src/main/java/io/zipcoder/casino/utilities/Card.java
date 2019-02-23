package io.zipcoder.casino.utilities;

public class Card {
    // Instance Variables
    private String suit;
    private Integer value;

    // Constructors

    public Card(String suit, Integer value) {
        this.suit = suit;
        this.value = value;
    }

    // Methods

    public String toString() {
        return "" + suit + value;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getSuit() {
        return this.suit;
    }
}
