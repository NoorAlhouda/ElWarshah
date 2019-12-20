package com.example.elwarsha.Items;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elwarsha.R;

import java.util.ArrayList;

public class itemsActivity extends AppCompatActivity {
    TextView mTextitems,mName_of_person;
    ImageView mImageitem;
    ArrayList<String> mList;
    itemsAdapter mItemAdapter;
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        mTextitems = findViewById(R.id.text_items);
        mImageitem = findViewById(R.id.imageitems);

        Intent intent = getIntent();
        mTextitems.setText(intent.getStringExtra("pageName"));
        mImageitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mRecyclerView = findViewById(R.id.item_rv);
        mList = new ArrayList<>();
        mList.add("");
        mList.add("");
        mList.add("");
        mList.add("");
        mList.add("");
        mList.add("");
        mList.add("");
        mList.add("");

        mItemAdapter = new itemsAdapter( mList,itemsActivity.this);
        mRecyclerView.setAdapter(mItemAdapter);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(itemsActivity.this,RecyclerView.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);



    }
}
