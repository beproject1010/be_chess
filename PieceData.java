package com.example.hp.be_chess;

import java.io.Serializable;
//maintains state

public class PieceData implements Serializable
{
    public PieceType type = PieceType.BLANK;
    public boolean isWhite = true;

    //piece type and color
    public PieceData(PieceType type, boolean isWhite)
    {
        this.isWhite = isWhite;
        this.type = type;
    }
}

