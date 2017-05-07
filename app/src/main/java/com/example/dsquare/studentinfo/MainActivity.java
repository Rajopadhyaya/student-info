package com.example.dsquare.studentinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] name ={"Ram","Shyam","Sita","Gita"};
    String[] faculty = {"Bsc.Csit","Management","Humanities","Engineering"};
    String[] address = {"ktm","bkt","patan","sindupalchwok"};
    RecyclerView studentView;
    RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentView= (RecyclerView)findViewById(R.id.studentView);
        manager = new LinearLayoutManager(this);
        studentView.setLayoutManager(manager);

        StudentAdapter adapter = new StudentAdapter(this,getData());
        studentView.setAdapter(adapter);
        adapter.setOnStudentClickListener(new OnStudentListener() {
            @Override
            public void onStudentClick(Student student, int position) {
                Toast.makeText(MainActivity.this,position+ "\t"+student.getName(),Toast.LENGTH_LONG).show();
            }
        });

    }

    public ArrayList<Student> getData() {
        ArrayList<Student> StudentList = new ArrayList<>();
        for(int i=0; i< name.length; i++){
            StudentList.add(new Student(name[i],address[i],faculty[i]));

        }
        return StudentList;
    }

}
