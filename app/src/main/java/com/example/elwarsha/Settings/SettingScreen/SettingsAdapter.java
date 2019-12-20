package com.example.elwarsha.Settings.SettingScreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elwarsha.R;

import java.util.ArrayList;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.MyViewHolder> {
    ArrayList<SettingsModel> mList;
    Context mContext;
    OnCatClick onCatClick;
    SettingsFragment fragment;

    public SettingsAdapter(ArrayList<SettingsModel> mList, OnCatClick onCatClick) {
        this.mList = mList;
        this.mContext = mContext;
        this.onCatClick = onCatClick;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.settings_item, parent, false);
        SettingsAdapter.MyViewHolder myViewHolder = new SettingsAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.mSettText.setText(mList.get(position).getSettText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0)
                    onCatClick.onItemClick("0");


                else if (position == 1)
                    onCatClick.onItemClick("1");

                else if (position == 2)
                    onCatClick.onItemClick("2");
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mSettText;
        ImageView mSettImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


        mSettText =itemView.findViewById(R.id.settings_text);
        mSettImage =itemView.findViewById(R.id.settings_image);
    }
}
    public interface OnCatClick {
        void onItemClick(String catNum);

    }
}
