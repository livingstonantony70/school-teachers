package com.example.schoolteachers.model;

import java.util.List;

public class TeacherParent {
    private List<Teacher> list;

    public TeacherParent(List<Teacher> list) {
        this.list = list;
    }

    public List<Teacher> getList() {
        return list;
    }

    public void setList(List<Teacher> list) {
        this.list = list;
    }
}



