package com.example.elwarsha.Home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elwarsha.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    View view;
    RecyclerView mRecyclerView;
    HomeAdapter mAdapter;
    ArrayList<HomeModel> mList;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        initViews();
        return view;
        
    }

    private void initViews() {
        mRecyclerView = view.findViewById(R.id.home_rv);
        mList = new ArrayList<>();
        HomeModel m1 = new HomeModel("Carpenter",R.drawable.carpenter,"1");
        HomeModel m2 = new HomeModel("Electrician",R.drawable.electrician,"2");
        HomeModel m3 = new HomeModel("Clean",R.drawable.clean,"3");
        HomeModel m4 = new HomeModel("Plumbers",R.drawable.plumbers,"4");

        mList.add(m1);
        mList.add(m2);
        mList.add(m3);
        mList.add(m4);

        mAdapter = new HomeAdapter(mList,getActivity());
        mRecyclerView.setAdapter(mAdapter);
        RecyclerView.LayoutManager layoutManager= new GridLayoutManager(getContext(),2);
        mRecyclerView.setLayoutManager(layoutManager);





    }

}
