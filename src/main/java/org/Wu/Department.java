package org.Wu;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Department {
    private static int nextId = 1;
    private String departmentId;
    private String departmentName;

    public Department(String departmentName) {
        if (isDepartmentNameValid(departmentName)) {
            this.departmentId = "D" + String.format("%02d", nextId++);
            this.departmentName = departmentName;
        } else {
            this.departmentId = null;
            this.departmentName = null;
        }
    }

    public static boolean isDepartmentNameValid(String departmentName) {
        if (departmentName == null) {
            return false;
        }

        for (int i = 0; i < departmentName.length(); i++) {
            char c = departmentName.charAt(i);
            if (!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c == ' ')) {
                return false;
            }
        }
        return true;
    }
}