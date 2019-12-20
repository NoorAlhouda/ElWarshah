package com.example.elwarsha.Items;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elwarsha.R;
import com.example.elwarsha.itemDetails.itemdetailsActivity;

import java.util.ArrayList;

public class itemsAdapter extends RecyclerView.Adapter<itemsAdapter.MyViewHolder>{
    ArrayList<String> mList;
    Context mContext;

    public itemsAdapter(ArrayList<String> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public itemsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_cat_item,parent,false);
        itemsAdapter.MyViewHolder myViewHolder= new itemsAdapter.MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull itemsAdapter.MyViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, itemdetailsActivity.class));

            }
        });

    }


    @Override
    public int getItemCount() {
        return mList.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mTextitems;
        ImageView mImageitem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextitems= itemView.findViewById(R.id.text_items);
            mImageitem= itemView.findViewById(R.id.imageitems);
        }
    }
}
