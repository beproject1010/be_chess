package com.example.hp.be_chess;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newGameBtn = (Button) findViewById(R.id.new_game_button);
        newGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newGameIntent = new Intent(MainActivity.this, GameScreenActivity.class);
                startActivity(newGameIntent);
            }
        });
    }
}
