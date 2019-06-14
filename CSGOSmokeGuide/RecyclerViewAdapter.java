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
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<MapHolder> mapHolder;
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<MapHolder> mapHolder, Context mContext) {
        this.mapHolder=mapHolder;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {


        Glide.with(mContext)
                .asBitmap()
                .load(mapHolder.get(i).getMapURL())
                .into(viewHolder.image);
        
        viewHolder.imageName.setText(mapHolder.get(i).getMapName());

        viewHolder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mapHolder.get(i).getMapName(),Toast.LENGTH_SHORT).show();
                ThirdActivity.fill(i);
                Intent intent=new Intent(mContext,ThirdActivity.class);

                mContext.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return mapHolder.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        RelativeLayout parent_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
            imageName=itemView.findViewById(R.id.image_name);
            parent_layout=itemView.findViewById(R.id.parent_layout);

        }


    }


}
