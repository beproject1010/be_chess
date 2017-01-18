package com.example.hp.be_chess;

/**
 * Created by Hp on 1/17/2017.
 */

public class Board {
    public Piece[][] board;
    int turn;

    boolean draw;
    boolean isGameRunning;
    boolean check;

    Position oppPrevStart;
    Position oppPrevEnd;
    Position prevStart;
    Position prevEnd;
    Position oppPrevPrevStart;
    Position oppPrevPrevEnd;

    public King wKing,bKing;

    public Board()
    {
        turn = 1;
        draw = false;
        isGameRunning = true;
        check = false;

        oppPrevStart = null;
        oppPrevEnd = null;
        oppPrevPrevStart = null;
        oppPrevPrevEnd = null;
        prevStart = null;
        prevEnd = null;

        board = new Piece[8][8];
        for(int i=0; i< 8; i++)
        {
            boolean white = true;
            //white by default
            for(int j=0; j < 8; j++)
            {
                switch(i)
                {
                    case 7:
                        white = false;
                    case 0:
                        switch(j)
                        {
                            case 0:
                            case 7:
                                //position is (x,y)
                                board[i][j] = new Rook(white, new Position(j,i));
                                break;

                            case 1:
                            case 6:
                                board[i][j] = new Knight(white, new Position(j,i));
                                break;

                            case 2:
                            case 5:
                                board[i][j] = new Bishop(white, new Position(j,i));
                                break;

                            case 3:
                                board[i][j] = new Queen(white, new Position(j,i));
                                break;

                            case 4:
                                board[i][j] = new King(white, new Position(j,i));
                                if(white) {
                                    wKing = (King)board[i][j];
                                } else {
                                    bKing = (King)board[i][j];
                                }
                                break;
                        }
                        break;
                    case 6:
                        white = false;
                    case 1:
                        board[i][j] = new Pawn(white, new Position(j,i));
                        break;
                    default:
                        board[i][j] = null;
                }
            }
        }
    }

    //DEFAULT SETTING OF BOARD
    public PieceData[] sendBoard() {
        PieceData[] ret = new PieceData[64];
        for(int i = 7; i > -1; i--) {
            for(int j = 0; j < 8; j++) {
                if(board[i][j] == null) {
                    ret[i*8 + j] = new PieceData(PieceType.BLANK, true);
                } else {
                    ret[i*8 +j] = new PieceData(board[i][j].type, board[i][j].isWhite());
                }
            }
        }
        return ret;
    }

}
