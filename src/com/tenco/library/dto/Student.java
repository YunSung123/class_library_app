package com.tenco.library.dto;

import lombok.*;

/// 학생 데이터 그릇
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student {
    private int id;
    private String name;
    private String studentId;

    public Student(String name, String studentId){
        this.name = name;
        this.studentId = studentId;
    }
}
