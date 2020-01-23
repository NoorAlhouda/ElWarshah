package com.example.elwarsha.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.elwarsha.Items.itemsActivity;
import com.example.elwarsha.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{
    ArrayList<HomeModel> mList;
    Context mContext;

    public HomeAdapter(ArrayList<HomeModel> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.mCatName.setText(mList.get(position).getCatName());
        Glide.with(mContext).load(mList.get(position).CatImge).into(holder.mCatImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, itemsActivity.class)
                        .putExtra("pageName",mList.get(position).getCatName()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mCatName;
        ImageView mCatImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mCatName= itemView.findViewById(R.id.cat_name);
            mCatImage= itemView.findViewById(R.id.cat_image);
        }
    }
}
