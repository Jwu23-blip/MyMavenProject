package org.Wu;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
@Setter
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

    public boolean registeredCourse(Course course) {
        if(registeredCourses.contains(course)) {
            return false;
        }
        registeredCourses.add(course);
        course.registerStudent(this);
        return true;
    }

    public boolean dropCourse(Course course) {
        if (!registeredCourses.contains(course)) {
            return false;
        }
        registeredCourses.remove(course);
        course.getRegisteredStudents().remove(this);
        return true;
    }

    public String toSimplifiedString() {
        return studentId + " - " + studentName + " - " + getDepartment();
    }

    public enum Gender {
        MALE, FEMALE
    }

    class Address {
        private String street;
        private String city;

        public Address(String city, String street) {
            this.city = city;
            this.street = street;
        }
    }

    class Department {
        private String department;

        public Department(String departmentName) {
            this.department = departmentName;
        }
    }

    class Course {
        private String courseName;
        private ArrayList<Student> registeredStudents = new ArrayList<>();

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void registerStudent(Student student) {
            if (!registeredStudents.contains(student)) {
                registeredStudents.add(student);
            }
        }
        public ArrayList<Student> getRegisteredStudents() {
            return registeredStudents;
        }
    }
}