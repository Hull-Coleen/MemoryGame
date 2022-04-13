package com.example.memorygame;

import android.graphics.drawable.Drawable;

public class Card {
    protected Drawable back;
    protected String title;
    public Card(Drawable back, String title) {
        this.back = back;
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return back;
    }
    public Drawable getBack() {
        return back;
    }

}
