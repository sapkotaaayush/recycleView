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

        prepareData(); // add 5 teachers

        TeacherAdapter adapter = new TeacherAdapter(MainActivity.this, teacherData);
        rvTeachers.setAdapter(adapter);
    }

    private void prepareData() {
        // 5 teachers like in the diagram (x5)

        teacherData.add(new TeacherModel(
                "Mr. Sharma",
                "Math, Physics"
        ));

        teacherData.add(new TeacherModel(
                "Ms. Karki",
                "English, Social Studies"
        ));

        teacherData.add(new TeacherModel(
                "Mr. Singh",
                "Science, Computer"
        ));

        teacherData.add(new TeacherModel(
                "Ms. Rai",
                "Accountancy, Economics"
        ));

        teacherData.add(new TeacherModel(
                "Mr. Thapa",
                "Nepali, Health"
        ));
    }
}
