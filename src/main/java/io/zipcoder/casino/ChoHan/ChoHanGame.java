package io.zipcoder.casino.ChoHan;

import io.zipcoder.casino.Interfaces.GamblingGame;
import io.zipcoder.casino.Interfaces.GamblingPlayer;
import io.zipcoder.casino.Interfaces.Game;
import io.zipcoder.casino.utilities.Dice;
import io.zipcoder.casino.utilities.Player;

import java.util.ArrayList;

public class ChoHanGame implements Game, GamblingGame {

    private ArrayList<Player> playerListCHGame = new ArrayList<Player>();
    private ChoHanPlayer choHanPlayerObj;

    // constructor with player list
    public ChoHanGame(ArrayList<Player> playerList) {
        this.playerListCHGame = playerList;
        choHanPlayerObj = new ChoHanPlayer(playerListCHGame);
    }

    // default constructor
    public ChoHanGame() {}

//    public ArrayList<Player> getPlayerListChoHan() {
//        return playerListCHGame;
//    }

    public void setPlayerListChoHan(ArrayList<Player> playerListChoHan) {
        this.playerListCHGame = playerListChoHan;
    }

    public void start() {
       // choHanPlayerObj.getEligiblePlayerListCH();


    }

    public Integer askForBet(GamblingPlayer gamblingPlayer) {
        return null;
    }

    public Integer getDiceResult() {
        Dice dice = new Dice(2);
        return 0;
    }

    public void loadPlayer() {

    }

    public String getNextPlayerAction() {
        return null;
    }

    public void displayGameState() {

    }

    public Boolean playAgain() {
        return null;
    }

    public void exit() {
        System.exit(0);

    }

}
