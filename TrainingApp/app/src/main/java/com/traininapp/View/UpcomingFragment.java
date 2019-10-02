package com.traininapp.View;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.traininapp.Model.Session;
import com.traininapp.R;
import com.traininapp.ViewModel.SessionAdapter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UpcomingFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Session> sessionArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_upcoming, null);
        //setContentView(R.layout.fragment_upcoming);
        recyclerView = v.findViewById(R.id.recyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // Using a linear layout manager
        layoutManager = new LinearLayoutManager(inflater.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // Initializing the list of Sessions and fill it with dummies
        sessionArrayList = new ArrayList<>();
        createListData();

        // Specifying the adapter
        adapter = new SessionAdapter(sessionArrayList);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

        return v;
    }

    private void createListData() {
        Session session = new Session("Benpass", LocalDate.now());
        sessionArrayList.add(session);

        session = new Session("Löprunda", LocalDate.now());
        sessionArrayList.add(session);

        session = new Session("Ryggpass", LocalDate.now());
        sessionArrayList.add(session);

        //adapter.notifyDataSetChanged();
    }
}