package com.example.hp.be_chess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import static com.example.hp.be_chess.R.id.board;

public class GameScreenActivity extends AppCompatActivity
{
    public Board b;
    public CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = new Board();
        setContentView(R.layout.activity_game_screen);
        GridView boardView = (GridView) findViewById(board);
        //createSquares(boardView);
        adapter = new CustomAdapter(this);
        adapter.setParent(boardView);
        boardView.setAdapter(adapter);
        //GET SETTING OF PIECES IN DEFAULT POSITIONS FROM SENDBOARD AND GIVE TO ADAPTER
        //adapter.setData(board.sendBoard());
    }
}
