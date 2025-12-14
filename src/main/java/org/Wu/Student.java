package org.Wu;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@EqualsAndHashCode
public class Student {
    private static int nextId = 1;

    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private ArrayList<Course> registeredCourses;

    public Student(Department department, Gender gender, String studentName, Address address) {
        this.address = address;
        this.department = department;
        this.gender = gender;
        this.registeredCourses = new ArrayList<>();
        this.studentId = "S" + String.format("%06d", nextId++);
        this.studentName = studentName;
    }

    public boolean registerCourse(Course course) {
        if(registeredCourses.contains(course)) {
            return false;
        }
    }
}
