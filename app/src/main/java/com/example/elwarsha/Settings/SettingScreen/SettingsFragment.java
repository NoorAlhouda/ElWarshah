package com.example.elwarsha.Settings.SettingScreen;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elwarsha.LogOut.LogOutFragment;
import com.example.elwarsha.R;
import com.example.elwarsha.Settings.EditeProfil.EditeProfilActivity;
import com.example.elwarsha.Settings.Languages.languagesActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment implements SettingsAdapter.OnCatClick{

    View view;
    RecyclerView mRecycler;
    SettingsAdapter mSettingAdapter;
    ArrayList<SettingsModel> mList;
    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_settings, container, false);
        initViews();
        return view;

    }

    private void initViews() {
        mRecycler = view.findViewById(R.id.settings_rv);
        mList = new ArrayList<>();
        SettingsModel m1 = new SettingsModel("Edite Profile", R.drawable.ic_home_black_24dp, "0");
        SettingsModel m2 = new SettingsModel("Change Language", R.drawable.ic_home_black_24dp, "1");
        SettingsModel m3 = new SettingsModel("ContactUs", R.drawable.ic_home_black_24dp, "2");
        SettingsModel m4 = new SettingsModel("Share App", R.drawable.ic_home_black_24dp, "3");
        SettingsModel m5 = new SettingsModel("Rate APP", R.drawable.ic_home_black_24dp, "4");
        SettingsModel m6 = new SettingsModel("Log Out", R.drawable.ic_home_black_24dp, "5");

        mList.add(m1);
        mList.add(m2);
        mList.add(m3);
        mList.add(m4);
        mList.add(m5);
        mList.add(m6);

        mSettingAdapter = new SettingsAdapter(mList,this);
        mRecycler.setAdapter(mSettingAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        mRecycler.setLayoutManager(layoutManager);

    }

    @Override
    public void onItemClick(String catNum) {
        if (catNum.equalsIgnoreCase("0"))
            startActivity(new Intent(getContext(), EditeProfilActivity.class));
        else if (catNum.equalsIgnoreCase("1"))
            startActivity(new Intent(getContext(), languagesActivity.class));
        else if (catNum.equalsIgnoreCase("2"))
            startActivity(new Intent(getContext(), LogOutFragment.class));

        mSettingAdapter = new SettingsAdapter(mList,this);
        mRecycler.setAdapter(mSettingAdapter);

    }
}
