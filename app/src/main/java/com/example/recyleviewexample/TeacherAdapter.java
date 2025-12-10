package com.example.recyleviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TeacherAdapter extends RecyclerView.Adapter<TeacherAdapter.MyViewHolder> {

    private ArrayList<TeacherModel> teacherList;
    private Context context;

    public TeacherAdapter(Context context, ArrayList<TeacherModel> teacherList) {
        this.context = context;
        this.teacherList = teacherList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(context).inflate(R.layout.single_teacher_row, parent, false);
        return new MyViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TeacherModel model = teacherList.get(position);
        holder.tvTeacherName.setText("Teacher Name: " + model.getTeacherName());
        holder.tvSubjects.setText("Subjects: " + model.getSubjects());
    }

    @Override
    public int getItemCount() {
        return teacherList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTeacherName, tvSubjects;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTeacherName = itemView.findViewById(R.id.name);
            tvSubjects = itemView.findViewById(R.id.subjects);
        }
    }
}
