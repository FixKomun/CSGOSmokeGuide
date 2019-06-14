package com.fixkomun.CSGOSmokeGuide;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter2nd extends RecyclerView.Adapter<RecyclerViewAdapter2nd.ViewHolder>
{

    ArrayList<SmokeHolder> smokeholder=new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter2nd(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listnades,viewGroup,false);
        ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.nadeName.setText(smokeholder.get(i).getName());

        viewHolder.parent_layout2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,FinalActivity.class);
                intent.putExtra("smoke",smokeholder.get(i));
                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return smokeholder.size();
    }

    public void addData(ArrayList<SmokeHolder> data){
        this.smokeholder.clear();
        this.smokeholder.addAll(data);
        notifyDataSetChanged();
}

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nadeName;
        RelativeLayout parent_layout2nd;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            nadeName=itemView.findViewById(R.id.nadeName);
            parent_layout2nd=itemView.findViewById(R.id.parent_layout2nd);

        }
    }
}