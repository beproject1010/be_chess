package com.example.hp.be_chess;

/**
 * Created by Hp on 1/17/2017.
 */

public class Knight extends Piece
{
    public Knight(boolean w, Position start)
    {
        currPos = start;
        symbol = "N";
        type = PieceType.KNIGHT;
        this.setWhite(w);

        if (w == true){
            this.symbol = "w" + this.symbol;
        }
        else{
            this.symbol = "b" + this.symbol;
        }
    }
}
