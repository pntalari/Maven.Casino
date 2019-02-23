package io.zipcoder.casino.ChoHanTests;
import io.zipcoder.casino.ChoHan.ChoHanPlayer;
import io.zipcoder.casino.utilities.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChoHanPlayerTest {
    private ChoHanPlayer choHanPlayer;
    @Before
    public void initial() { choHanPlayer = new ChoHanPlayer();}

    @Test
    public void playerListChoHanTest()
    {
        //Given
        ArrayList<Player> playerList = new ArrayList<Player>();
        Player player1 = new Player("John", 100);
        Player player2 = new Player("Sal", 1000);
        Player player3 = new Player("Laxmi", 0);
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        //When
        Player expectedPlayer = player3;

       // Player actualPlayer = choHanPlayer.playerListChoHan(playerList);
        //Then
    }

    @Test
    public void updatePlayerWallet() {
    }

    @Test
    public void getHouseBalance() {
    }

    @Test
    public void getPlayerGuess() {
    }

    @Test
    public void getPlayerBets() {
    }
}