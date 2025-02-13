package com.traininapp.View;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.traininapp.R;
import com.traininapp.adapter.StatisticsAdapter;
import com.traininapp.viewModel.GoalStatCard;
import com.traininapp.viewModel.IStatistic;
import com.traininapp.viewModel.StatisticCard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Keeps hold of the goals page or my page. Also holds the recyclerview along with its adapter and Layout manager.
 */
public class GoalsFragment extends Fragment {

    private RecyclerView recyclerView;
    private StatisticsAdapter recyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> listExample;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_goals, null);
        
        ArrayList<IStatistic> list = new ArrayList<>();                                          //dummy variables
                                                                                                 //dummy variables
        ArrayList<Integer> exampleStatList= new ArrayList<>();                                   //dummy variables to test the functionality
        ArrayList<Long> exampleDateList = new ArrayList<>();                                     //dummy variables to test the functionality
        exampleStatList.add(1); exampleStatList.add(3); exampleStatList.add(2); exampleStatList.add(4); exampleStatList.add(5); exampleStatList.add(5);                                    //dummy variables to test the functionality
        exampleDateList.add(new Date(2012, 3, 5).getTime());                  //dummy variables to test the functionality
        exampleDateList.add(new Date(2019,4,5).getTime());                                          //dummy variables to test the functionality
        exampleDateList.add(new Date(2019, 5, 5).getTime());                  //dummy variables to test the functionality
        exampleDateList.add(new Date(2019,5,9).getTime());                                          //dummy variables to test the functionality
        exampleDateList.add(new Date(2019, 5, 10).getTime());                  //dummy variables to test the functionality
        exampleDateList.add(new Date(2019,5,12).getTime());               //dummy variables to test the functionality
        list.add(new StatisticCard("Strength", exampleStatList, exampleDateList));

        recyclerView = (RecyclerView) view.findViewById(R.id.myPagesRecyclerViewID);
        recyclerView.setHasFixedSize(true);

        recyclerViewAdapter = new StatisticsAdapter(list);

        layoutManager= new LinearLayoutManager(GoalsFragment.super.getContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

}


