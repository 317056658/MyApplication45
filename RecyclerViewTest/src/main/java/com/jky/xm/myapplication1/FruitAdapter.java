package com.jky.xm.myapplication1;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


/**
 * Created by Administrator on 2017/2/9.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>{
    private List mFruitList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView  fruitImage;
        TextView  fruitName;
        public ViewHolder(View itemView) {
            super(itemView);
            this.fruitView=itemView;
            fruitImage=(ImageView) itemView.findViewById(R.id.fruit_img);
            fruitName=(TextView)itemView.findViewById(R.id.fruit_name);
        }
    }

    public FruitAdapter(List fruitList) {
        this.mFruitList=fruitList;
    }
    Boolean  aaa= false;
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
       holder.fruitView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                 mFruitList.get(holder.getAdapterPosition());
               Toast.makeText(view.getContext(),"aaaa",Toast.LENGTH_LONG).show();
           }
       });
        holder.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    aaa=true;
                  Toast.makeText(view.getContext(),"bbbbb",Toast.LENGTH_LONG).show();
            }
        });
        return holder;
    }


    public void onBindViewHolder(ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
