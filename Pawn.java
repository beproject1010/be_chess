package com.example.hp.be_chess;

/**
 * Created by Hp on 1/17/2017.
 */

public class Pawn extends Piece
{
    public Pawn(boolean w, Position start) {
        currPos = start;
        symbol = "P";
        type = PieceType.PAWN;
        this.setWhite(w);

        if (w == true) {
            this.symbol = "w" + this.symbol;
        }
        else {
            this.symbol = "b" + this.symbol;
        }
    }
}
