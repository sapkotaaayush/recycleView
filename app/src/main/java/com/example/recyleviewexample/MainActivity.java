package com.example.recyleviewexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvTeachers;
    ArrayList<TeacherModel> teacherData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeachers = findViewById(R.id.rvTeachers);

        rvTeachers.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        prepareData();

        TeacherAdapter adapter = new TeacherAdapter(MainActivity.this, teacherData);
        rvTeachers.setAdapter(adapter);
    }

    private void prepareData() {
        teacherData.add(new TeacherModel(
                "Mr. Shishir",
                "DS"
        ));

        teacherData.add(new TeacherModel(
                "Mr. Abhisekh",
                "MP"
        ));

        teacherData.add(new TeacherModel(
                "Mr. Sanjiv",
                "Eco"
        ));

        teacherData.add(new TeacherModel(
                "Mr Bhola",
                "NP"
        ));

        teacherData.add(new TeacherModel(
                "Mr. Naveen",
                "AdvJava"
        ));
    }
}
