package com.jky.xm.myapplication45;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/12/15.
 */

public class huatu extends View {
    public huatu(Context context) {
        super(context);
    }

    public huatu(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.parseColor("#ff0011"));
        p.setStrokeWidth(4);
        p.setAntiAlias(true);
        p.setStyle(Paint.Style.FILL);


        Path path1 = new Path();
        path1.moveTo(200, 200);
        path1.lineTo(300, 200);
        path1.quadTo(355,200,350,240);
        path1.lineTo(1000,240);
        path1.quadTo(1060,240,1060,270);
        path1.lineTo(1060,430);
        path1.quadTo(1060,457,1017,462);
        path1.lineTo(355,460);
        path1.quadTo(355,500,315,500);
        path1.lineTo(205,500);




        canvas.drawPath(path1, p);










    }
}