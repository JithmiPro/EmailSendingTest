package com.example.EmailSendingTest.EmailPackage;

public interface EmailService {

//    String sendSimpleMail(EmailDetails_DTO details);

//    String sendMailWithAttachment(EmailDetails_DTO details);

//    Note
//    *****  save to the DB in first save btn , then confirm it (through that send the emails)

    String sendEmailString(EmailDetails_DTO mail);

}
