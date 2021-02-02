package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {


    List<Card> cards = new ArrayList<Card>();
   // Card cards [];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
       // final
        load();
        CardAdapter cardAdapter= new CardAdapter(this, cards);
        GridView gridView = (GridView)findViewById(R.id.cardGrid);
        //CardAdapter = new CardAdapter(this, cards);
        gridView.setAdapter(cardAdapter);

       /* gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            Card card = cards[position];
            card.toggleFavorite();

            // This tells the GridView to redraw itself
            // in turn calling your BooksAdapter's getView method again for each cell
            cardAdapter.notifyDataSetChanged();
        }*/
    };
    public void load() {
        cards.add(new Card(getResources().getDrawable(R.drawable.lion), "question"));
        cards.add(new Card(getResources().getDrawable(R.drawable.lion), "question"));
        cards.add(new Card(getResources().getDrawable(R.drawable.lion), "question"));
        cards.add(new Card(getResources().getDrawable(R.drawable.lion), "question"));
        cards.add(new Card(getResources().getDrawable(R.drawable.lion), "question"));
        cards.add(new Card(getResources().getDrawable(R.drawable.lion), "question"));
        cards.add(new Card(getResources().getDrawable(R.drawable.lion), "question"));
    }
}