package io.zipcoder.casino.ChoHan;

import io.zipcoder.casino.utilities.Player;

import java.util.ArrayList;
import java.util.ListIterator;

public class ChoHanPlayer {
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private ArrayList<ChoHanPlayer> eligiblePlayerListCH = new ArrayList<ChoHanPlayer>();
    private Integer guessChoHanPlayer;

    private String playerNameCH;
    private Integer walletBalanceCH;
    public Integer netGainLossPlayerCH;

    //Nullary constructor
    public ChoHanPlayer()
    {
        this.playerNameCH = "";
        this.walletBalanceCH = 0;
        this.netGainLossPlayerCH = 0;
    }

    //constructor taking in player list arraylist
    public ChoHanPlayer(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    //constructor instantiating instance variables
    public ChoHanPlayer(String name, Integer walletBalance, Integer netGainLoss) {
        this.playerNameCH = name;
        this.walletBalanceCH = walletBalance;
        this.netGainLossPlayerCH = netGainLoss;
    }

    /** construct the ChoHan eligible player list with players that have
         enough wallet balance to play the game */
    public ArrayList<ChoHanPlayer> playerListChoHan(ArrayList<Player> playerList) {
       ListIterator<Player> listIterator = playerList.listIterator();
        Player playerObj = playerList.get(0);
        int i =0;
        do {
            if (playerObj.getWallet() > 0) {
                eligiblePlayerListCH.add(new ChoHanPlayer(playerObj.getName(),
                        playerObj.getWallet(), playerObj.getPlayerNetGainLoss()));
            }
            i++;
            if(i<playerList.size())
            playerObj = playerList.get(i);
        }
        while (i<=playerList.size());

        return eligiblePlayerListCH;
    }

    /** get method to return ChoHan eligible players */
    public ArrayList<ChoHanPlayer> getEligiblePlayerListCH() {
        return this.eligiblePlayerListCH;
    }

    /** get method to return ChoHan player wallet balance */
    public Integer getWalletBalanceChoHanPlayer() {
        return walletBalanceCH;
    }

    /** set method to assign ChoHan player wallet balance */
    public void setWalletBalanceChoHanPlayer(Integer playerBalance) {
        this.walletBalanceCH = playerBalance;
    }

//  public Integer updatePlayerWallet() {
//        return null;
//    }

    public Integer getHouseBalance() {
        return null;
    }

    public void getPlayerGuess() {

    }

    public void getPlayerBets() {
    }
}