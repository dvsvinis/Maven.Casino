package com.groupFour.Games;

import com.groupFour.Dice;
import com.groupFour.Interfaces.Game;
import com.groupFour.Player;

import java.util.ArrayList;

public class GreaterThanThree extends Game {

    private Dice dice;

    private Player player;
    private ArrayList<Integer> finalList;
    private Integer rollCount;

    public GreaterThanThree(Player player){
        this.player = player;
        this.dice=new Dice(5);
        this.finalList = new ArrayList<Integer>();
    }


    public GreaterThanThree(){
        this(new Player());

    }

    public void setup() {
        dice.rollDice(); //roll dice

    }

//    public Integer rollCount(){
//        if ()//rollCount++
//        return null;
//    }

    public void compareDiceResult(){
        //check for matches in diceResult
        //get user choice if not match
        //push choice or match to finalList
    }
    public void reRoll(){
        //create new dice(5-finalList.size)
        //roll
        //rollCount++
    }

    public void checkRollCount(){
        //Check if rollCount > 4
    }
    public void takeTurn() {
        //print diceResult ArrayList
        //check if any diceResult elements = finalList(1)
        //get player dice choice(if not just match)
        //move choice to final list

    }

    public void askIfRollAgain(){
        //if finalList.size >= 3 ask if roll again
    }

    public void resolve(){
        //get points(pts = finalList.size
        //if finalList.size < 3 lose game
        //if finalList.size >= 3 win game
    }

    public void endConditionChecker(){
        //if rollCount = 4, end game.
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Integer> getFinalList() {
        return finalList;
    }

    public Dice getDice() {
        return dice;
    }
}
