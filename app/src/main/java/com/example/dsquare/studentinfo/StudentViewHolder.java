package com.example.dsquare.studentinfo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by DSQUARE on 5/3/2017.
 */

public class StudentViewHolder extends RecyclerView.ViewHolder{
    TextView txtName;
    TextView txtFaculty;
    TextView txtAddress;
    public StudentViewHolder(View itemView)
    {
        super(itemView);

        txtName = (TextView)itemView.findViewById(R.id.txtName);
        txtFaculty = (TextView)itemView.findViewById(R.id.txtFaculty);
        txtAddress = (TextView)itemView.findViewById(R.id.txtAddress);

    }
}
