package com.jky.xm.uibestpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Msg> msgList=new ArrayList<>();
    EditText input_text;
    Button send;
    RecyclerView  msg_recycler;
    private  MsgAdapter adapter;
    public  static  int  flag=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得手机的屏幕的密度
       float xdpi=getResources().getDisplayMetrics().xdpi;
        float ydpi=  getResources().getDisplayMetrics().ydpi;
        Log.d("+++++++++++++++++===", "onCreate: "+xdpi+"    "+ydpi);
        initMsgs(); //初始化消息数据
        input_text= (EditText)findViewById(R.id.input_text);
       send= (Button)findViewById(R.id.send);
        msg_recycler= (RecyclerView) findViewById(R.id.msg_recycler);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        msg_recycler.setLayoutManager(layoutManager);

        adapter=new MsgAdapter(msgList);
        msg_recycler.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  String content =input_text.getText().toString();
                if(!"".equals(content)){
                    Msg msg= new Msg(content,Msg.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyItemInserted(msgList.size()-1);
                   msg_recycler.scrollToPosition(msgList.size()-1);
                    flag=2;

                    input_text.setText("");//清空输入框的内容

                }
            }
        });

    }
    private  void  initMsgs(){
          Msg msg1=new Msg("你好朋友",Msg.TYPE_RECEIVED);
          msgList.add(msg1);
        Msg msg2=new Msg("你好朋友,你是谁",Msg.TYPE_SENT);
        msgList.add(msg2);
        Msg msg3=new Msg("我是汤姆。很高兴和你聊天",Msg.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
