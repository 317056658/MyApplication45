package com.jky.xm.myapplication45;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class Main22Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Button bt=(Button)findViewById(R.id.bt1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //设置时间格式
                SimpleDateFormat formatter = new SimpleDateFormat ("yyyy/MM/dd/HH:mm");
                //获得系统当前时间
                long time=System.currentTimeMillis();
                //formatter.format(time)方法是把time转成自己设置的格式 返回是个字符串是当前时间
                String str = formatter.format(time);
                Toast.makeText(Main22Activity.this,str,Toast.LENGTH_LONG).show();
                Log.d("时间", "onCreate: "+str);
            }
        });

    }
}
