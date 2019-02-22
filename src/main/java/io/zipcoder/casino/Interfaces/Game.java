package io.zipcoder.casino.Interfaces;

public interface Game {
    void start();

    void loadPlayer();

    String getNextPlayerAction();

    void displayGameState();

    Boolean playAgain();

    void exit();

}
