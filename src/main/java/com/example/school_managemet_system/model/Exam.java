package com.example.school_managemet_system.model;

public class Exam {

//    unique identifier for each exam
    private long id;
//    foreign key referencing the id of the ClassSubject for which the exam is being held
    private String class_subject_id;
//    foreign key referencing the id of the Teacher who is conducting the exam
    private String teacher_id;
//    date and time when the exam is being held
    private String exam_date;
//    duration of the exam in minutes
    private String duration_minutes;
//    date and time when the exam was created
    private String created_at;
//    date and time when the exam was last updated
    private String updated_at;
}
