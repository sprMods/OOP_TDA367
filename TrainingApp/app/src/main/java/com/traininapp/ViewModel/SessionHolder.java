package com.traininapp.ViewModel;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.traininapp.Model.Session;
import com.traininapp.R;

public class SessionHolder extends RecyclerView.ViewHolder {

    private TextView txtSessionName;
    private TextView txtSessionDate;

    public SessionHolder(View itemView) {
        super(itemView);
        txtSessionName = itemView.findViewById(R.id.txtSessionName);
        txtSessionDate = itemView.findViewById(R.id.txtSessionDate);
    }

    public void setDetails(Session session) {
        txtSessionName.setText(session.getName());
        txtSessionDate.setText("Här ska stå ett datum"); //TODO Fixa så att datum visas
    }


}