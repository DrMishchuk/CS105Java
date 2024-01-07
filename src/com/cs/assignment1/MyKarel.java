package com.cs.assignment1;

import com.shpp.karel.KarelTheRobot;

public class MyKarel extends SuperKarel {
    //Main method
    @Override
    public void run() throws Exception {
        move();
        stepLeft();
        move();
        pickBeeper();
        stepLeft();
        move();
        move();
    }


}

class SuperKarel extends KarelTheRobot{
    /*
        Method turnRight
     */
    public void turnRight() throws Exception {
        for (int i = 0; i < 3; i++)
            turnLeft();
    }

    /**
     *  Method step left
     *
     * @throws Exception
     */
    public void stepLeft()throws Exception{
        turnLeft();
        move();
        turnRight();
    }
}
