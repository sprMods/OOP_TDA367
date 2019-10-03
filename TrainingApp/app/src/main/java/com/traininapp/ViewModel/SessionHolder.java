package com.traininapp.ViewModel;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.traininapp.Model.Session;
import com.traininapp.R;

public class SessionHolder extends RecyclerView.ViewHolder {

    private TextView txtSessionName;

    public SessionHolder(TextView itemView) {
        super(itemView);
        txtSessionName = itemView;
    }

    public void setDetails(String msg) {
        txtSessionName.setText(msg);
        // txtSessionDate.setText("Här ska stå ett datum"); //TODO Fixa så att datum visas
    }


}