package com.jky.xm.uibestpractice;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/2/13.
 */

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder>{
    private List<Msg> msgLIst;
    static class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView left_msg;
        TextView right_msg;

        public ViewHolder(View itemView) {
            super(itemView);
            leftLayout=(LinearLayout)itemView.findViewById(R.id.left_layout);
            rightLayout=(LinearLayout)itemView.findViewById(R.id.right_layout);
            left_msg=(TextView)itemView.findViewById(R.id.left_msg);
            right_msg=(TextView)itemView.findViewById(R.id.right_msg);
        }
    }

    public MsgAdapter(List<Msg> msgLIst) {
        this.msgLIst=msgLIst;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.msg_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
              Msg msg=msgLIst.get(position);
        if(msg.getType()==Msg.TYPE_RECEIVED){
            holder.leftLayout.setVisibility(View.VISIBLE);
            holder.rightLayout.setVisibility(View.GONE);
            holder.left_msg.setText(msg.getContent());
        }else if(msg.getType()==Msg.TYPE_SENT){
            holder.rightLayout.setVisibility(View.VISIBLE);
            holder.leftLayout.setVisibility(View.GONE);
            holder.right_msg.setText(msg.getContent());
            if(MainActivity.flag==2){
                holder.leftLayout.setVisibility(View.VISIBLE);
                holder.left_msg.setText(msg.getContent());
                Log.d("aaaa+++++++",""+msgLIst.size());


            }
        }
    }

    @Override
    public int getItemCount() {
        return msgLIst.size();
    }


}
