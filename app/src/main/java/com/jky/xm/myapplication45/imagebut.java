package com.jky.xm.myapplication45;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016/12/4.
 */

public class imagebut extends ImageButton {
    private  String _text = "";
    private int _color = 0;
    private float _textsize = 0f;
    Canvas canvas;
    String ab="";
    public imagebut(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void setText(String text){
        this._text = text;
    }
    public void setColor(int color){
        this._color = color;
    }

    public void setTextSize(float textsize){
        this._textsize = textsize;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p=new Paint();
        p.setTextAlign(Paint.Align.CENTER);
        p.setColor(_color);
        p.setTextSize(_textsize);
        this.canvas =canvas;

        canvas.drawText(_text,0, (canvas.getHeight()/2)+60, p);
    }
    public void getWidth1(String a){
         ab=a;
    }


}
