package com.example.hp.be_chess;

/**
 * Created by Hp on 1/17/2017.
 */

public class King extends Piece {
    public King(boolean w, Position start) {
        currPos = start;
        symbol = "K";
        type = PieceType.KING;
        this.setWhite(w);

        if (w == true) {
            this.symbol = "w" + this.symbol;
        }
        else {
            this.symbol = "b" + this.symbol;
        }
    }
}
