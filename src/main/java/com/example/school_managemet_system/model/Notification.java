package com.example.school_managemet_system.model;

public class Notification {

//    unique identifier for each notification
    private long id;
//    foreign key referencing the id of the user for whom the notification is intended (e.g. a student or parent)
    private String user_id;
//    date and time when the notification was generated
    private String notification_date;
//    content of the notification
    private String content;
//    boolean value indicating whether the notification has been read by the user
    private String is_read;
}
