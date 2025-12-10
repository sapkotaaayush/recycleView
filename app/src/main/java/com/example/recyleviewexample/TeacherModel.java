package com.example.recyleviewexample;

public class TeacherModel {
    private String teacherName;
    private String subjects;

    public TeacherModel() {
    }

    public TeacherModel(String teacherName, String subjects) {
        this.teacherName = teacherName;
        this.subjects = subjects;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
