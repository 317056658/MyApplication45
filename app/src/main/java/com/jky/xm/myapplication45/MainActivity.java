package com.jky.xm.myapplication45;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends BaseActivity {
    private static final String TAG = "A";
    ProgressBar pb;
    int progress;
      Handler  mhandler=new Handler(){
          @Override
          public void handleMessage(Message msg) {
              super.handleMessage(msg);
              pb.setProgress(progress);
          }
      };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start_dialog=(Button)findViewById(R.id.start_dialog);
        Button   start_NewActivity=(Button)findViewById(R.id.start_NewActivity);
        start_NewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main22Activity.class);
                startActivity(intent);
            }
        });
        start_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        Log.d(TAG, "onCreate: ");
         pb=  (ProgressBar)findViewById(R.id.pb);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //获得进步条当前的进度
         progress=pb.getProgress();
        Log.d(TAG, "onStart: ");
         new Thread(new Runnable() {
             @Override
             public void run() {
                 int max=pb.getMax();
                 while (progress<=max){
                     progress+=10;
                     mhandler.sendEmptyMessage(1);
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }

                 }
             }
         }).start();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("aa",1);
    }
}
