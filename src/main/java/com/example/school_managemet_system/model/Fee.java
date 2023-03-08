package com.example.school_managemet_system.model;

public class Fee {

//    unique identifier for each fee
   private long id;
//    foreign key referencing the id of the Student who is responsible for paying the fee
   private String student_id;
//    type of fee (e.g. tuition, textbook, uniform)
   private String fee_type;
//    amount of the fee in dollars
   private String amount;
//    date by which the fee is due
   private String due_date;
//    date and time when the fee was paid (if it has been paid)
   private String paid_at;
//    date and time when the fee record was created
   private String created_at;
//    date and time when the fee record was last updatedprivate String
private String   updated_at;
}
