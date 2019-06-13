package com.groupFour.Games;

import com.groupFour.Deck;
import com.groupFour.Hand;
import com.groupFour.Interfaces.Game;
import com.groupFour.Wraps.GoFishPlayer;

public class GoFish extends Game {

    private Hand house;
    private Deck deck;
    private GoFishPlayer player;

    public GoFish(GoFishPlayer player){
        this.player = player;
        this.deck = new Deck();
        this.house = new Hand();
    }

    public GoFish(){this(new GoFishPlayer());}

    public void takeTurn() {

    }

    public void setup() {

    }
}
