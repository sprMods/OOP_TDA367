package com.traininapp.ViewModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.traininapp.Model.Session;
import com.traininapp.R;

import java.util.ArrayList;

public class SessionAdapter extends RecyclerView.Adapter<SessionHolder> {

    private Context context;
    private ArrayList<Session> sessions;

    public SessionAdapter(Context context, ArrayList<Session> sessions) {
        this.context = context;
        this.sessions = sessions;
    }

    @Override
    public SessionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.session_row, parent, false);
        return new SessionHolder(view);
    }

    @Override
    public void onBindViewHolder(SessionHolder holder, int position) {
        Session session = sessions.get(position);
        holder.setDetails(session);
    }

    @Override
    public int getItemCount() {
        return sessions.size();
    }
}
