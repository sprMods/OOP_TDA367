package com.traininapp.ViewModel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.traininapp.Model.Session;
import com.traininapp.R;

import java.time.LocalDate;
import java.util.ArrayList;

public class UpcomingSessionsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SessionAdapter adapter;
    private ArrayList<Session> sessionArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_upcoming);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        sessionArrayList = new ArrayList<>();
        adapter = new SessionAdapter(this, sessionArrayList);
        recyclerView.setAdapter(adapter);
        createListData();
    }

    private void createListData() {
        Session session = new Session("Benpass", LocalDate.now());
        sessionArrayList.add(session);

        session = new Session("Löprunda",LocalDate.now() );
        sessionArrayList.add(session);

        session = new Session("Ryggpass", LocalDate.now());
        sessionArrayList.add(session);

        adapter.notifyDataSetChanged();
    }

}
