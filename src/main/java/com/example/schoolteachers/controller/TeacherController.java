package com.example.schoolteachers.controller;

import com.example.schoolteachers.model.Teacher;
import com.example.schoolteachers.model.TeacherParent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "teachers")
public class TeacherController {

    List<Teacher> list = new ArrayList<>();


    @GetMapping("/all")
    public List<Teacher> getDepartments() {

        list.clear();

        list.add(new Teacher("B15", "livin", "android"));
        list.add(new Teacher("B16", "jerome", "react"));
        list.add(new Teacher("B18", "Mercy", "Tester"));
        list.add(new Teacher("B18", "Celes", "Spring boot"));

        return list;
    }

    @GetMapping("/{teacherId}")
    public TeacherParent getDepartments(@PathVariable("teacherId") String teacherId) {

        List<Teacher> tempList = new ArrayList<>();
        for (Teacher te : list) {
            if (te.getId().equalsIgnoreCase(teacherId)) {
                tempList.add(te);
            }
        }

        return new TeacherParent(tempList);
    }

}
