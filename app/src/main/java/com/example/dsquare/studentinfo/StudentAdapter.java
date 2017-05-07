package com.example.dsquare.studentinfo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by DSQUARE on 5/3/2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    Context context;
    ArrayList<Student>StudentList;
    OnStudentListener onStudentListener;

    public StudentAdapter(Context context, ArrayList<Student>StudentList){
        this.context= context;
        this.StudentList=StudentList;


    }
    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_student,null);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, final int position) {
        final Student std= StudentList.get(position);
        holder.txtName.setText(std.getName());
        holder.txtFaculty.setText(std.getFaculty());
        holder.txtAddress.setText(std.getAddress());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onStudentListener.onStudentClick(std,position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }

    public void setOnStudentClickListener(OnStudentListener onStudentListener ){
        this.onStudentListener = onStudentListener;


    }
}
