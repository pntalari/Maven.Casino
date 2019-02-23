package io.zipcoder.casino.ChoHan;

import io.zipcoder.casino.Player;

import java.util.ArrayList;
import java.util.ListIterator;

public class ChoHanPlayer {
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private ArrayList<ChoHanPlayer> eligiblePlayerListCH = new ArrayList<ChoHanPlayer>();
//    private Integer walletBalanceChoHanPlayer;
//    private Integer netGainLossChoHanPlayer;
    private Integer guessChoHanPlayer;

    private String playerNameCH;
    private Integer walletBalanceCH;
    public Integer NetGainLossPlayerCH;

    public ChoHanPlayer(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public ChoHanPlayer(String name, Integer walletBalance, Integer netGainLoss) {
        this.playerNameCH = name;
        this.walletBalanceCH = walletBalance;
        this.NetGainLossPlayerCH = netGainLoss;
    }

    /*construct the ChoHan eligible playerlist with players that have
     enough wallet balance to play the game */
    public ArrayList playerListChoHan(ArrayList playerList) {
        ListIterator<String> listIterator = playerList.listIterator();
        Player playerObj = new Player();
        while (listIterator.hasNext()) {
            if (playerObj.getWallet() > 0) {
                eligiblePlayerListCH.add(new ChoHanPlayer(playerObj.getName(), playerObj.getWallet(), playerObj.getPlayerNetGainLoss()));
            }
        }
        return eligiblePlayerListCH;
    }

    public Integer getWalletBalanceChoHanPlayer() {
        return walletBalanceCH;
    }

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
