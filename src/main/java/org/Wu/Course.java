package org.Wu;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Course {

    private static int nextId = 1;

    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> registeredStudents;

    public Course(ArrayList<Assignment> assignments, String courseId, String courseName, double credits, Department department, ArrayList<Student> registeredStudents) {
        this.assignments = new ArrayList<>();
        this.courseId = String.format("C-" + department.getDepartmentId() + "-" + String.format("%02d", nextId++));
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
        this.registeredStudents = new ArrayList<>();
    }
}
