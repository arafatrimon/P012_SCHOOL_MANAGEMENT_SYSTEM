package com.example.school_managemet_system.model;

public class Announcement {

//    unique identifier for each announcement
   private long id;
//    foreign key referencing the id of the ClassSubject for which the announcement is relevant
   private String class_subject_id;
//    foreign key referencing the id of the Teacher who posted the announcement
   private String teacher_id;
//    date and time when the announcement was posted
   private String announcement_date;
//    title of the announcement
   private String title;
//    content of the announcement
   private String content;
//    date and time when the announcement was created
   private String created_at;
//    date and time when the announcement was last updated
   private String updated_at;
}
