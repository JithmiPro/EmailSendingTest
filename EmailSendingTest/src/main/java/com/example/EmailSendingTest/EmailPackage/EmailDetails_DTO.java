package com.example.EmailSendingTest.EmailPackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// Class
public class EmailDetails_DTO {

    // Class data members
    private String recipient;
    private String to_name;
    private String from_name;
    private String title;
    private String msgBody;
    private String subject;
    private String attachment;


}