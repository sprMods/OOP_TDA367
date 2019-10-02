package com.traininapp.ViewModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.traininapp.Model.Session;
import com.traininapp.R;

import java.util.ArrayList;
import java.util.List;

// Provide a reference to the views for each data item
public class SessionAdapter extends RecyclerView.Adapter<SessionHolder> {

    private List<Session> sessions;

    // Adapter constructor
    public SessionAdapter(List<Session> sessions) {
        this.sessions = sessions;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public SessionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.session_row, parent, false);
        SessionHolder vh = new SessionHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(SessionHolder holder, int position) {
        //Session session = sessions.get(position);
        holder.setDetails("bla" + position);
    }

    // Return the size of dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return sessions.size();
    }
}
