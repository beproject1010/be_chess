package com.example.hp.be_chess;

/**
 * Created by Hp on 1/17/2017.
 */

public class Bishop extends Piece
{
    public Bishop(boolean w, Position start) {
        currPos = start;
        symbol = "B";
        type = PieceType.BISHOP;
        this.setWhite(w);

        if (w == true) {
            this.symbol = "w" + this.symbol;
        }
        else {
            this.symbol = "b" + this.symbol;
        }
    }
}
