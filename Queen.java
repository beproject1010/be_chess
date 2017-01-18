package com.example.hp.be_chess;

/**
 * Created by Hp on 1/17/2017.
 */

public class Queen extends Piece
{
    public Queen(boolean w, Position start) {
        currPos = start;
        symbol = "Q";
        type = PieceType.QUEEN;
        this.setWhite(w);

        if (w == true) {
            this.symbol = "w" + this.symbol;
        }
        else {
            this.symbol = "b" + this.symbol;
        }
    }
}
