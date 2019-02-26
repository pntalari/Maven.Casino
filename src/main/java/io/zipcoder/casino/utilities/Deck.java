package io.zipcoder.casino.utilities;

import io.zipcoder.casino.utilities.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Deck {
    // Instance Variables

    protected ArrayList<Card> deckList;
    private final String[] suits = {"D", "H", "S", "C"};
    private final Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    // Constructors


    public Deck(ArrayList<Card> deckList) {
        this.deckList = deckList;
    }

    public Deck(){
        ArrayList<Card> list = new ArrayList<Card>();
        for(String suit : suits){
            for(Integer value : values){
                Card card = new Card(suit, value);
                list.add(card);
            }
        }
        this.deckList = list;
    }

    // Methods

    /**
     * If the deck is not empty, return the top card and remove it from the deckList
     * @return the top Card
     */

    public Card cardDealFromTop() {
        Card card;
        if(deckList.size() > 0){
            card = deckList.get(0);
            deckList.remove(0);
        }
        else {
            card = null;
        }
        return card;
    }

    /**
     * If the deck has enough card to deal, return the requested amount in an ArrayList
     * @param number
     * @return The top N Cards
     */

    public ArrayList<Card> dealNFromTop(Integer number) {
        ArrayList<Card> cardArray = new ArrayList<Card>();
        if(deckList.size()>=number) {
            for (int i = 0; i < number; i++) {
                cardArray.add(cardDealFromTop());
            }
        }
        return cardArray;
    }

    /**
     * Gets the ArrayList of the current deck state
     * @return
     */

    public ArrayList<Card> getDeck() {
        return this.deckList;
    }

    /**
     * Shuffles the current deckList
     */

    public void shuffle() {
        Collections.shuffle(deckList);
    }

    /**
     * Resets the current deskList to the preshuffled/altered state
     */

    public void refill() {
        ArrayList<Card> list = new ArrayList<Card>();
        for(String suit : suits){
            for(Integer value : values){
                Card card = new Card(suit, value);
                list.add(card);
            }
        }
        deckList = list;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckList=" + deckList +
                ", suits=" + Arrays.toString(suits) +
                ", values=" + Arrays.toString(values) +
                '}';
    }
}
