package io.zipcoder.casino.utilities;

public class RandomNumber {

    public static Integer getRandomNumber(Integer maxValue) {
        return (int)(Math.random()*maxValue) + 1 ;
    }
}
