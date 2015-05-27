package com.example.yu.coolweather.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by yu on 2015/5/27.
 */
public class FontView extends TextView {

    public FontView(Context context) {
        super(context);
        init(context);
    }

    public FontView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public FontView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf");
        setTypeface(typeface);
    }
}
