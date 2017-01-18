package com.example.hp.be_chess;

public abstract class Piece {
    public String symbol;
    private boolean white;
    public PieceType type = PieceType.BLANK;
    public boolean firstMove = true;

    public Position currPos;

    public boolean isWhite(){
        return this.white;
    }

    public void setWhite(boolean w){
        white = w;
    }

    public Position getPosition() {
        return currPos;
    }

    public void setPosition(Position newPos) {
        currPos = newPos;
    }

}