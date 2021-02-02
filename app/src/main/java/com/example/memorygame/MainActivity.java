package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String difficulty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void easy(View view) {
       difficulty = "Easy";
    }
    void medium(View view) {
        difficulty = "Medium";
    }
    void hard(View view) {
        difficulty = "Hard";
    }
    void goToGame(View view) {
        Intent intent = new Intent(this, GameActivity.class);
    }

}