package Pojo;

import java.util.Random;

public class Dice {
    int start=1;
    int end=6;
    public int rollDice()
    {
        Random random=new Random();
       return random.nextInt(end);
    }
}
