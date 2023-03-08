package com.example.school_managemet_system.model;

public class Borrow {

//    unique identifier for each library loan
   private long id;
//    foreign key referencing the id of the Student who is borrowing the book
   private String student_id;
//    foreign key referencing the id of the LibraryBook being borrowed
   private String library_book_id;
//    date and time when the book was borrowed
   private String borrow_date;
//    date and time when the book is due to be returned
   private String due_date;
//    date and time when the book was returned (if it has been returned)
   private String returned_at;
//    date and time when the library loan record was created
   private String created_at;
//    date and time when the library loan record was last updated
   private String updated_at;
}
