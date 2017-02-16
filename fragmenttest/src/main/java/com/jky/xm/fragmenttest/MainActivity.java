package com.jky.xm.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得碎片管理员
       FragmentManager manager= getSupportFragmentManager();
        //获得一个事物
         transaction = manager.beginTransaction();
         Button button=(Button)findViewById(R.id.button);
        transaction.addToBackStack(null);
        transaction.commit();//事物要提交才有用
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"吐司",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
