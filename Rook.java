package com.example.hp.be_chess;

/**
 * Created by Hp on 1/17/2017.
 */

public class Rook extends Piece
{
    public Rook(boolean w, Position start)
    {
        currPos = start;
        symbol = "R";
        type = PieceType.ROOK;
        this.setWhite(w);

        if (w == true) {
            this.symbol = "w" + this.symbol;
        }
        else {
            this.symbol = "b" + this.symbol;
        }
    }
}
