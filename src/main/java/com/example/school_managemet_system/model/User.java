package com.example.school_managemet_system.model;

public class User {


//    unique identifier for each user
   private long id;
//    name of the user
   private String name;
//    email address of the user
   private String email;
//    hashed password of the user
   private String password;
//    enum indicating the role of the user (e.g. student, teacher, administrator)
   private String role;
//    date and time when the user was created
   private String created_at;
//    date and time when the user was last updated
   private String updated_at;
}
