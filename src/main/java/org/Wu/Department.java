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
}
