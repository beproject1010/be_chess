package com.example.hp.be_chess;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class PieceButton extends ImageButton
{
    public boolean selected = false;

    public PieceButton(Context context) {
        super(context);
    }

    public PieceButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PieceButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

}
