package com.example.school_managemet_system.model;

public class Attendance {

//    unique identifier for each attendance record
   private long id;
//    foreign key referencing the id of the Student whose attendance is being recorded
   private String student_id;
//    foreign key referencing the id of the ClassSubject for which attendance is being recorded
   private String class_subject_id;
//    date for which attendance is being recorded
   private String date;
//    enum indicating the student's attendance status for the class on the given date (e.g. present, absent, excused)
   private String status;
//    date and time when the attendance record was created
   private String created_at;
//    date and time when the attendance record was last updatedprivate String
private String   updated_at;
}
