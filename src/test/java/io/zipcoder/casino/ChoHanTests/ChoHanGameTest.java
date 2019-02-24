package io.zipcoder.casino.ChoHanTests;
import io.zipcoder.casino.ChoHan.ChoHanGame;
import io.zipcoder.casino.ChoHan.ChoHanPlayer;
import io.zipcoder.casino.utilities.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChoHanGameTest {
    private ChoHanGame choHanGame;
    private ChoHanPlayer choHanPlayer;

    @Before
    public void initial() { choHanGame = new ChoHanGame();
    }

    @Test
    public void constructorTest(){
        //Given
        ArrayList<Player> playerList = new ArrayList<Player>();
        Player player1 = new Player("John", 100);
        playerList.add(player1);
        //When
        choHanGame = new ChoHanGame(playerList);
        Boolean actualName = choHanPlayer.getEligiblePlayerListCH().contains(player1);
        //Then
        Assert.assertTrue(actualName);
    }

    @Test
    public void getplayerGuessTest(){
        //Given
        String PlayerGuessE = "Even";
        String PlayerGuessO = "odd";
        //When
        Integer actualPlayerGuessE = choHanGame.getPlayerGuess(PlayerGuessE);
        Integer actualPlayerGuessO = choHanGame.getPlayerGuess(PlayerGuessO);
        Integer expectedPlayerGuessE = 2;
        Integer expectedPlayerGuessO = 1;
        //Then
        Assert.assertEquals(expectedPlayerGuessE,actualPlayerGuessE);
        Assert.assertEquals(expectedPlayerGuessO,actualPlayerGuessO);
    }

//    @Test
//    public void getDiceResultTest(){
//        //Given
//
//        //When
//        //Then
//    }


    @Test
    public void start() {
        //Given
        //When
        //Then
    }

}