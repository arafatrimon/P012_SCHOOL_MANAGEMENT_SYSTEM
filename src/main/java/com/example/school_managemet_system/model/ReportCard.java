package com.example.school_managemet_system.model;

public class ReportCard {

//    unique identifier for each report card
    private long id;
//    foreign key referencing the id of the Student for whom the report card is being generated
    private String student_id;
//    date and time when the report card is being generated
    private String report_card_date;
//    numerical average of the student's grades across all classes
    private String grade_average;
//    array of objects containing the student's grades for each class, including the class name, subject name, and grade value
    private String class_grades;
//    percentage of classes for which the student was present
    private String attendance_percentage;
}
