package com.example.memorygame;

        import android.content.Context;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.List;

public class CardAdapter extends BaseAdapter {

    //private final Context context;
    private final List<Card> cards;
    private final Context context;

    public CardAdapter(Context context, List<Card> cards) {
        this.context = context;
        this.cards = cards;
    }

    @Override
    public int getCount() {
        return 16;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //final Card card = cards[position];
       // final List<Card> card = cards[position];
        View v = convertView;
        if (convertView == null) {
            //imageView = new ImageView();
            // imageView = set
        }
        else {
            TextView textView = new TextView(context);
            ImageView imageView = new ImageView(context);
            textView.setText(String.valueOf(position));      // setText(card.get(position).getTitle());
            //imageView.setImageResource(card.get(position).getBack());
            // return imageView;

        }
        return v;
    }
}
