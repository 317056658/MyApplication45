package com.jky.xm.myapplication45;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/12/5.
 */

public class imagebut1 extends View{
    private  Context context;
    public imagebut1(Context context) {
        super(context);
    }

    public imagebut1(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setTextAlign(Paint.Align.CENTER);
        p.setTextSize(30);
        p.setColor(Color.BLACK);
        Bitmap bitmap= BitmapFactory.decodeResource(context.getResources(),R.mipmap.ic_launcher);
        canvas.drawBitmap(bitmap,30,30,p);
        canvas.drawText("哈哈哈",0,50,p);


    }
}
